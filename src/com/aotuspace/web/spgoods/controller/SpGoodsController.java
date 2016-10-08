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
 * Description:��͹�ռ���Դ���controller
 * Company:aotuspace
 * @author    ΰ��
 * @date      2015-9-16 ����3:18:21
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
	 * ��Ʒ��ϸ
	 * @param anchorId
	 * @param taskId
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping("/{aId}/{id}")
	public String goods(@PathVariable("aId") Integer anchorId,@PathVariable("id") Integer taskId,Model model) throws Exception{
		String goodsPicPath = "E:\\TOMCAT����Ŀ¼\\";//ȫ����ƷĿ¼�����ַ
		//String avatarPath ="C:\\zowbman@hotmail.com\\TECHNOLOGY\\TOMCAT����Ŀ¼\\";
		ImgSpec imgSpec=new ImgSpec(420,420);//ͼƬ���
		//��ѯ������ϸ
		//����״̬
		//1��δ���� 2�������� 3���ѽ���
		Integer spStatusId = 2;
		SpAotuerpTreasureTaskQueryVo spTreaTaskV=new SpAotuerpTreasureTaskQueryVo();
		spTreaTaskV.getSpTreaTaskC().setSpAnid(anchorId);//������id
		spTreaTaskV.getSpTreaTaskC().setSpId(taskId);//����id
		spTreaTaskV.getSpTreaTaskC().setSpStatusid(spStatusId);//����״̬
		SpAotuerpTreasureTaskCustom spTreaTaskC=iSpGoodsService.findTreasureDetailByAnIdAndSpIdAndSpStatus(spTreaTaskV);
		if(spTreaTaskC!=null){
			//���ı�����
			spTreaTaskC.getSpAotuerpTreasureInfoCustom().setSpTreasuredescription(CustomUtil.unescape(spTreaTaskC.getSpAotuerpTreasureInfoCustom().getSpTreasuredescription()));
			model.addAttribute("rgoods", spTreaTaskC);
			return "Details-Page/Representdetail";
		}
		return null;	
	}
	
	/**
	 * ��Ʒ��ϸ ��sku��Ϣjson��
	 * @param anchorId
	 * @param taskId
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/{aId}/{id}!sku/json")
	public @ResponseBody JsonMsg goodsSkuJson(@PathVariable("aId") Integer anchorId,@PathVariable("id") Integer taskId)throws Exception{
		//1��δ���� 2�������� 3���ѽ���
		Integer spStatusId = 2;
		SpAotuerpTreasureTaskQueryVo spTreaTaskV = new SpAotuerpTreasureTaskQueryVo();
		spTreaTaskV.getSpTreaTaskC().setSpAnid(anchorId);//������id
		spTreaTaskV.getSpTreaTaskC().setSpId(taskId);//����id
		spTreaTaskV.getSpTreaTaskC().setSpStatusid(spStatusId);//����״̬
		Map<String, Map<String, Long>> skuMap=iSpGoodsService.findTreasureDetailSkuJsonByAnIdAndSpIdAndSpStatus(spTreaTaskV);
		return new JsonMsg(100000, "����ɹ�", null, skuMap);
	}

	/**
	 * ��Ʒ������ϸ
	 * @param goodsId
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/r/{id}")
	public String representGoods(@PathVariable("id") Integer taskId,Model model)throws Exception{
		//������װ����
		//����״̬
		//1��δ���� 2�������� 3���ѽ���
		Integer spStatusId = 1;
		SpAotuerpTreasureTaskQueryVo spTreaTaskV=new SpAotuerpTreasureTaskQueryVo();
		spTreaTaskV.getSpTreaTaskC().setSpId(taskId);//����id
		spTreaTaskV.getSpTreaTaskC().setSpStatusid(spStatusId);
		SpAotuerpTreasureTaskCustom spTreaTaskC=iSpGoodsService.findTreasureTaskDetailBySpIdAndSpStatus(spTreaTaskV);
		if(spTreaTaskC!=null){
			//���ı�����
			spTreaTaskC.getSpAotuerpTreasureInfoCustom().setSpTreasuredescription(CustomUtil.unescape(spTreaTaskC.getSpAotuerpTreasureInfoCustom().getSpTreasuredescription()));
			model.addAttribute("rgoods", spTreaTaskC);
			return "Details-Page/Endorsement_details";
		}
		return "construction";
	}
	
	//������Ʒ
	@RequestMapping("/r/{id}!buy")
	public String representGoodsCheck(HttpSession httpSession,SpUsersBinfoQueryVo spUserV,@PathVariable("id") Integer taskId)throws Exception{
		//��ȡ��ǰ�û�
		SpUsersBinfoCustom currentSpUser=(SpUsersBinfoCustom) httpSession.getAttribute("spUser");
		if(currentSpUser!=null){
			//��֤1����ѯ��ǰ�û��Ƿ�����Լ��Ƿ��Ǵ�������
			boolean flag=iSpUsersService.findUserByAutoIdAndIdenId(currentSpUser.getSpAtuid(), 2);
			if(flag){
				//��֤2����ѯ��ǰ�û��Ƿ���������Ϣ���д���
				SpAnchorBinfo spAnchorBinfo=iSpUsersService.findAnBySpAutoId(currentSpUser.getSpAtuid());
				if(spAnchorBinfo!=null){
					//������ת��������Ʒ
					//��һ��tooken
					return "redirect:/goods/r/"+taskId+"/"+spAnchorBinfo.getSpId()+"!buy";
				}
			}
		}
		//��ת��������������ҳ��
		return null;
	}
	
	/**
	 * ���Դ���Ʒ
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/r/{id}/{anId}!buy")
	public String representGoodsBuy(HttpSession httpSession,@PathVariable("id") Integer taskId,@PathVariable("anId")Integer anId)throws Exception{
		//У���ȡ��ת��������������
		//У��tooken
		//У����ת����
		//��ȡ��������ԭ����
		SpUsersBinfoCustom currentSpUser=(SpUsersBinfoCustom) httpSession.getAttribute("spUser");
			SpAotuerpTreasureTask treasureTask=iSpGoodsService.findTreasureTaskBySpId(taskId);
			if(treasureTask!=null){
				//���뵱ǰaotuid
				//�޸�����״̬
				treasureTask.setSpAnid(anId);
				treasureTask.setSpStatusid(2);//(1:δ����,2:������,3:�ѽ���)
				//��ʼ�����޸ģ�
				iSpGoodsService.updateTreasureTaskForBegin(treasureTask);
			}
		return null;
	}
}
