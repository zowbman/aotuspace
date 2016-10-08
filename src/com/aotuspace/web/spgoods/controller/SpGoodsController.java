package com.aotuspace.web.spgoods.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aotuspace.web.global.jsonmsg.model.JsonMsg;
import com.aotuspace.web.spgoods.model.po.task.SpAotuerpTreasureTask;
import com.aotuspace.web.spgoods.model.po.task.custom.SpAotuerpTreasureTaskCustom;
import com.aotuspace.web.spgoods.model.vo.task.SpAotuerpTreasureTaskQueryVo;
import com.aotuspace.web.spgoods.service.ISpGoodsService;
import com.aotuspace.web.spuser.model.po.user.SpAnchorBinfo;
import com.aotuspace.web.spuser.model.po.user.custom.SpUsersBinfoCustom;
import com.aotuspace.web.spuser.model.vo.user.SpUsersBinfoQueryVo;
import com.aotuspace.web.spuser.service.ISpUsersService;
import com.aotuspace.web.util.CustomUtil;
import com.aotuspace.web.util.thumbnailator.ImgSpec;

/**
 * 
 * Title:AotuSpaceController
 * Description:凹凸空间代言代言controller
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-9-16 下午3:18:21
 *
 */

@Controller
@RequestMapping("/goods")
public class SpGoodsController {

	@Autowired
	ISpGoodsService iSpGoodsService;
	
	@Autowired
	ISpUsersService iSpUsersService;
	
	/**
	 * 商品详细
	 * @param anchorId
	 * @param taskId
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping("/{aId}/{id}")
	public String goods(@PathVariable("aId") Integer anchorId,@PathVariable("id") Integer taskId,Model model) throws Exception{
		String goodsPicPath = "E:\\TOMCAT虚拟目录\\";//全部商品目录物理地址
		//String avatarPath ="C:\\zowbman@hotmail.com\\TECHNOLOGY\\TOMCAT虚拟目录\\";
		ImgSpec imgSpec=new ImgSpec(420,420);//图片规格
		//查询任务详细
		//任务状态
		//1：未进行 2：进行中 3：已进行
		Integer spStatusId = 2;
		SpAotuerpTreasureTaskQueryVo spTreaTaskV=new SpAotuerpTreasureTaskQueryVo();
		spTreaTaskV.getSpTreaTaskC().setSpAnid(anchorId);//代言人id
		spTreaTaskV.getSpTreaTaskC().setSpId(taskId);//任务id
		spTreaTaskV.getSpTreaTaskC().setSpStatusid(spStatusId);//任务状态
		SpAotuerpTreasureTaskCustom spTreaTaskC=iSpGoodsService.findTreasureDetailByAnIdAndSpIdAndSpStatus(spTreaTaskV);
		if(spTreaTaskC!=null){
			//富文本解码
			spTreaTaskC.getSpAotuerpTreasureInfoCustom().setSpTreasuredescription(CustomUtil.unescape(spTreaTaskC.getSpAotuerpTreasureInfoCustom().getSpTreasuredescription()));
			model.addAttribute("rgoods", spTreaTaskC);
			return "Details-Page/Representdetail";
		}
		return null;	
	}
	
	/**
	 * 商品详细 （sku信息json）
	 * @param anchorId
	 * @param taskId
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/{aId}/{id}!sku/json")
	public @ResponseBody JsonMsg goodsSkuJson(@PathVariable("aId") Integer anchorId,@PathVariable("id") Integer taskId)throws Exception{
		//1：未进行 2：进行中 3：已进行
		Integer spStatusId = 2;
		SpAotuerpTreasureTaskQueryVo spTreaTaskV = new SpAotuerpTreasureTaskQueryVo();
		spTreaTaskV.getSpTreaTaskC().setSpAnid(anchorId);//代言人id
		spTreaTaskV.getSpTreaTaskC().setSpId(taskId);//任务id
		spTreaTaskV.getSpTreaTaskC().setSpStatusid(spStatusId);//任务状态
		Map<String, Map<String, Long>> skuMap=iSpGoodsService.findTreasureDetailSkuJsonByAnIdAndSpIdAndSpStatus(spTreaTaskV);
		return new JsonMsg(100000, "请求成功", null, skuMap);
	}

	/**
	 * 商品代言详细
	 * @param goodsId
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/r/{id}")
	public String representGoods(@PathVariable("id") Integer taskId,Model model)throws Exception{
		//创建包装类型
		//任务状态
		//1：未进行 2：进行中 3：已进行
		Integer spStatusId = 1;
		SpAotuerpTreasureTaskQueryVo spTreaTaskV=new SpAotuerpTreasureTaskQueryVo();
		spTreaTaskV.getSpTreaTaskC().setSpId(taskId);//宝贝id
		spTreaTaskV.getSpTreaTaskC().setSpStatusid(spStatusId);
		SpAotuerpTreasureTaskCustom spTreaTaskC=iSpGoodsService.findTreasureTaskDetailBySpIdAndSpStatus(spTreaTaskV);
		if(spTreaTaskC!=null){
			//富文本解码
			spTreaTaskC.getSpAotuerpTreasureInfoCustom().setSpTreasuredescription(CustomUtil.unescape(spTreaTaskC.getSpAotuerpTreasureInfoCustom().getSpTreasuredescription()));
			model.addAttribute("rgoods", spTreaTaskC);
			return "Details-Page/Endorsement_details";
		}
		return "construction";
	}
	
	//代言商品
	@RequestMapping("/r/{id}!buy")
	public String representGoodsCheck(HttpSession httpSession,SpUsersBinfoQueryVo spUserV,@PathVariable("id") Integer taskId)throws Exception{
		//获取当前用户
		SpUsersBinfoCustom currentSpUser=(SpUsersBinfoCustom) httpSession.getAttribute("spUser");
		if(currentSpUser!=null){
			//验证1：查询当前用户是否存在以及是否是代言主播
			boolean flag=iSpUsersService.findUserByAutoIdAndIdenId(currentSpUser.getSpAtuid(), 2);
			if(flag){
				//验证2：查询当前用户是否在主播信息表中存在
				SpAnchorBinfo spAnchorBinfo=iSpUsersService.findAnBySpAutoId(currentSpUser.getSpAtuid());
				if(spAnchorBinfo!=null){
					//请求跳转到代言商品
					//贴一个tooken
					return "redirect:/goods/r/"+taskId+"/"+spAnchorBinfo.getSpId()+"!buy";
				}
			}
		}
		//跳转到代言主播申请页面
		return null;
	}
	
	/**
	 * 代言此商品
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/r/{id}/{anId}!buy")
	public String representGoodsBuy(HttpSession httpSession,@PathVariable("id") Integer taskId,@PathVariable("anId")Integer anId)throws Exception{
		//校验获取跳转过来的请求链接
		//校验tooken
		//校验跳转参数
		//获取宝贝任务原对象
		SpUsersBinfoCustom currentSpUser=(SpUsersBinfoCustom) httpSession.getAttribute("spUser");
			SpAotuerpTreasureTask treasureTask=iSpGoodsService.findTreasureTaskBySpId(taskId);
			if(treasureTask!=null){
				//插入当前aotuid
				//修改任务状态
				treasureTask.setSpAnid(anId);
				treasureTask.setSpStatusid(2);//(1:未进行,2:进行中,3:已结束)
				//开始任务（修改）
				iSpGoodsService.updateTreasureTaskForBegin(treasureTask);
			}
		return null;
	}
}
