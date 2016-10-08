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
 * Description:��͹�ռ�controller
 * Company:aotuspace
 * @author    ΰ��
 * @date      2015-9-16 ����3:18:21
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
	 * ��ҳ
	 * @return
	 */
	@RequestMapping("/index")
	public String index() {
		//��ҳ����׼��
		/*return "aotuspace/index";*/
		return "index";
	}

	/**
	 * ȫ����Ʒ
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping("/goods")
	public String goods(Model model) throws Exception {
		String goodsPicPath = "E:\\TOMCAT����Ŀ¼\\";//ȫ����ƷĿ¼�����ַ
		//String goodsPicPath ="C:\\zowbman@hotmail.com\\TECHNOLOGY\\TOMCAT����Ŀ¼\\";
		ImgSpec imgSpec=new ImgSpec(200,200);
		//1��δ���� 2�������� 3���ѽ���
		Integer spStatusId = 2;
		//��Ʒҳ�漴��������Ʒ���Ѵ�����Ʒ����������Ʒ����
		List<SpAotuerpTreasureTaskCustom> spAotuerpTreasureTaskCustoms = iSpGoodsService
				.findTreasureTaskListByspStatusId(spStatusId);
		//ȫ����Ʒҳ������ͼ����imgSpec
		for (SpAotuerpTreasureTaskCustom spAotuerpTreasureTaskCustom : spAotuerpTreasureTaskCustoms) {
			if(spAotuerpTreasureTaskCustom.getSpAotuerpTreasureInfoCustom()!=null){
				//��ѯ�Ƿ�ӵ������ͼ������������û��������
				if(spAotuerpTreasureTaskCustom.getSpAotuerpTreasureInfoCustom().getTreasurePrimaryImg()!=null){
					ImgSpec thumnailImgSpec=ThumbnailatorUtil.createThumbnailImg(imgSpec, goodsPicPath, spAotuerpTreasureTaskCustom.getSpAotuerpTreasureInfoCustom().getTreasurePrimaryImg().getSpImg(), "jpg");
					//���ع�񱣴�
					if(thumnailImgSpec!=null){//�ǿվ��Ǵ���������ͼ
						//�������ݿ�
						SpAotuerpTreasureImg thumbnailImg=new SpAotuerpTreasureImg();
						thumbnailImg.setSpImg(thumnailImgSpec.getImgPath());//·��
						thumbnailImg.setSpImgwidth(thumnailImgSpec.getImgWidth());//��
						thumbnailImg.setSpImgheight(thumnailImgSpec.getImgHeight());//��
						thumbnailImg.setSpImgsize(thumnailImgSpec.getImgSize().intValue());//��С
						thumbnailImg.setSpOrginalimgid(spAotuerpTreasureTaskCustom.getSpAotuerpTreasureInfoCustom().getTreasurePrimaryImg().getSpId());
						iSpGoodsImgService.saveGoodsThumbnail(thumbnailImg);
					}
				}
				if (spAotuerpTreasureTaskCustom.getSpAnchorBinfoCustom() != null
						&& spAotuerpTreasureTaskCustom.getSpAnchorBinfoCustom().getSpUsersBinfoCustom() != null
						&& spAotuerpTreasureTaskCustom.getSpAnchorBinfoCustom().getSpUsersBinfoCustom().getSpUsersDinfoCustom()!=null
						&& spAotuerpTreasureTaskCustom.getSpAnchorBinfoCustom().getSpUsersBinfoCustom().getSpUsersDinfoCustom().getSpUsersAvatar()!=null) {
					//����ͷ��ʼ
					String avatarPath = "E:\\TOMCAT����Ŀ¼\\";//ȫ����ƷĿ¼�����ַ
					//String avatarPath ="C:\\zowbman@hotmail.com\\TECHNOLOGY\\TOMCAT����Ŀ¼\\";
					ImgSpec avatarSpec=new ImgSpec(64,64);//���
					//��񣬸�Ŀ¼��ԭͼƬ·����ת���ʽ
					ImgSpec thumnailImgSpec=ThumbnailatorUtil.createThumbnailImg(avatarSpec, avatarPath, spAotuerpTreasureTaskCustom.getSpAnchorBinfoCustom().getSpUsersBinfoCustom().getSpUsersDinfoCustom().getSpUsersAvatar().getSpAvatar(), "jpg");
					if(thumnailImgSpec!=null){//�ǿվ��Ǵ���������ͼ
						//�������ݿ�
						iSpUsersService.saveUserAvatar(new SpUsersAvatarCustom(thumnailImgSpec.getImgPath(),spAotuerpTreasureTaskCustom.getSpAnchorBinfoCustom().getSpUsersBinfoCustom().getSpUsersDinfoCustom().getSpUsersAvatar().getSpId()));
					}
				}
			}
		}
		model.addAttribute("goods", spAotuerpTreasureTaskCustoms);
		return "all_goods";
	}

	/**
	 * ��Ҫ��
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping("/goods/r")
	public String represent(Model model,@PathParam("id") Integer goodsId) throws Exception {
		//1��δ���� 2�������� 3���ѽ���
		Integer spStatusId = 1;
		//��Ʒҳ�漴��������Ʒ���Ѵ�����Ʒ����������Ʒ����
		List<SpAotuerpTreasureTaskCustom> spAotuerpTreasureTaskCustoms = iSpGoodsService
				.findTreasureTaskListByspStatusId(spStatusId);
		model.addAttribute("rgoods",spAotuerpTreasureTaskCustoms);
		return "Represent";
	}

	/**
	 * ��վ���ڴ
	 * @return
	 */
	@RequestMapping("/constr")
	public String constr() {
		//��ҳ����׼��
		return "construction";
	}
}
