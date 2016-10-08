package com.aotuspace.web.controller;

import java.util.List;

import javax.ws.rs.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aotuspace.web.spgoods.model.po.task.custom.SpAotuerpTreasureTaskCustom;
import com.aotuspace.web.spgoods.model.po.treasure.SpAotuerpTreasureImg;
import com.aotuspace.web.spgoods.service.ISpGoodsImgService;
import com.aotuspace.web.spgoods.service.ISpGoodsService;
import com.aotuspace.web.spuser.model.po.user.custom.SpUsersAvatarCustom;
import com.aotuspace.web.spuser.service.ISpUsersService;
import com.aotuspace.web.util.thumbnailator.ImgSpec;
import com.aotuspace.web.util.thumbnailator.ThumbnailatorUtil;

/**
 * 
 * Title:AotuSpaceController
 * Description:凹凸空间controller
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-9-16 下午3:18:21
 *
 */
@Controller
public class AotuSpaceController {

	@Autowired
	ISpGoodsService iSpGoodsService;
	
	@Autowired
	ISpGoodsImgService iSpGoodsImgService;
	
	@Autowired
	ISpUsersService iSpUsersService;

	/**
	 * 首页
	 * @return
	 */
	@RequestMapping("/index")
	public String index() {
		//首页数据准备
		/*return "aotuspace/index";*/
		return "index";
	}

	/**
	 * 全部商品
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping("/goods")
	public String goods(Model model) throws Exception {
		String goodsPicPath = "E:\\TOMCAT虚拟目录\\";//全部商品目录物理地址
		//String goodsPicPath ="C:\\zowbman@hotmail.com\\TECHNOLOGY\\TOMCAT虚拟目录\\";
		ImgSpec imgSpec=new ImgSpec(200,200);
		//1：未进行 2：进行中 3：已进行
		Integer spStatusId = 2;
		//商品页面即（任务商品（已代言商品、销售中商品））
		List<SpAotuerpTreasureTaskCustom> spAotuerpTreasureTaskCustoms = iSpGoodsService
				.findTreasureTaskListByspStatusId(spStatusId);
		//全部商品页面缩略图制作imgSpec
		for (SpAotuerpTreasureTaskCustom spAotuerpTreasureTaskCustom : spAotuerpTreasureTaskCustoms) {
			if(spAotuerpTreasureTaskCustom.getSpAotuerpTreasureInfoCustom()!=null){
				//查询是否拥有缩略图，有则不制作，没有则制作
				if(spAotuerpTreasureTaskCustom.getSpAotuerpTreasureInfoCustom().getTreasurePrimaryImg()!=null){
					ImgSpec thumnailImgSpec=ThumbnailatorUtil.createThumbnailImg(imgSpec, goodsPicPath, spAotuerpTreasureTaskCustom.getSpAotuerpTreasureInfoCustom().getTreasurePrimaryImg().getSpImg(), "jpg");
					//返回规格保存
					if(thumnailImgSpec!=null){//非空就是创建了缩略图
						//保存数据库
						SpAotuerpTreasureImg thumbnailImg=new SpAotuerpTreasureImg();
						thumbnailImg.setSpImg(thumnailImgSpec.getImgPath());//路径
						thumbnailImg.setSpImgwidth(thumnailImgSpec.getImgWidth());//宽
						thumbnailImg.setSpImgheight(thumnailImgSpec.getImgHeight());//高
						thumbnailImg.setSpImgsize(thumnailImgSpec.getImgSize().intValue());//大小
						thumbnailImg.setSpOrginalimgid(spAotuerpTreasureTaskCustom.getSpAotuerpTreasureInfoCustom().getTreasurePrimaryImg().getSpId());
						iSpGoodsImgService.saveGoodsThumbnail(thumbnailImg);
					}
				}
				if (spAotuerpTreasureTaskCustom.getSpAnchorBinfoCustom() != null
						&& spAotuerpTreasureTaskCustom.getSpAnchorBinfoCustom().getSpUsersBinfoCustom() != null
						&& spAotuerpTreasureTaskCustom.getSpAnchorBinfoCustom().getSpUsersBinfoCustom().getSpUsersDinfoCustom()!=null
						&& spAotuerpTreasureTaskCustom.getSpAnchorBinfoCustom().getSpUsersBinfoCustom().getSpUsersDinfoCustom().getSpUsersAvatar()!=null) {
					//制作头像开始
					String avatarPath = "E:\\TOMCAT虚拟目录\\";//全部商品目录物理地址
					//String avatarPath ="C:\\zowbman@hotmail.com\\TECHNOLOGY\\TOMCAT虚拟目录\\";
					ImgSpec avatarSpec=new ImgSpec(64,64);//规格
					//规格，根目录，原图片路径，转向格式
					ImgSpec thumnailImgSpec=ThumbnailatorUtil.createThumbnailImg(avatarSpec, avatarPath, spAotuerpTreasureTaskCustom.getSpAnchorBinfoCustom().getSpUsersBinfoCustom().getSpUsersDinfoCustom().getSpUsersAvatar().getSpAvatar(), "jpg");
					if(thumnailImgSpec!=null){//非空就是创建了缩略图
						//保存数据库
						iSpUsersService.saveUserAvatar(new SpUsersAvatarCustom(thumnailImgSpec.getImgPath(),spAotuerpTreasureTaskCustom.getSpAnchorBinfoCustom().getSpUsersBinfoCustom().getSpUsersDinfoCustom().getSpUsersAvatar().getSpId()));
					}
				}
			}
		}
		model.addAttribute("goods", spAotuerpTreasureTaskCustoms);
		return "all_goods";
	}

	/**
	 * 我要代
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping("/goods/r")
	public String represent(Model model,@PathParam("id") Integer goodsId) throws Exception {
		//1：未进行 2：进行中 3：已进行
		Integer spStatusId = 1;
		//商品页面即（任务商品（已代言商品、销售中商品））
		List<SpAotuerpTreasureTaskCustom> spAotuerpTreasureTaskCustoms = iSpGoodsService
				.findTreasureTaskListByspStatusId(spStatusId);
		model.addAttribute("rgoods",spAotuerpTreasureTaskCustoms);
		return "Represent";
	}

	/**
	 * 网站正在搭建
	 * @return
	 */
	@RequestMapping("/constr")
	public String constr() {
		//首页数据准备
		return "construction";
	}
}
