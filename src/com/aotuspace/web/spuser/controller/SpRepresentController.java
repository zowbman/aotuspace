package com.aotuspace.web.spuser.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.aotuspace.web.global.jsonmsg.model.JsonMsg;
import com.aotuspace.web.spdictionary.model.po.bank.SpBankRegion;
import com.aotuspace.web.spdictionary.model.po.bank.SpBanks;
import com.aotuspace.web.spdictionary.model.po.livestation.SpLivestationInfo;
import com.aotuspace.web.spdictionary.service.bank.ISpBankService;
import com.aotuspace.web.spdictionary.service.livestation.ISpLiveStationService;
import com.aotuspace.web.spuser.model.po.user.custom.SpUsersBinfoCustom;
import com.aotuspace.web.spuser.model.vo.application.SpAnchorAppQueryVo;
import com.aotuspace.web.spuser.model.vo.application.SpArtistAppQueryVo;
import com.aotuspace.web.spuser.service.ISpRepresentService;
import com.aotuspace.web.util.CustomUploadUtil;

/**
 * 
 * Title:SpRepresentController
 * Description:���Թ���ģ��controller
 * Company:Boundless
 * @author    ΰ��
 * @date      2015-9-10 ����12:54:47
 *
 */

@Controller
@RequestMapping("/a")
public class SpRepresentController {

	@Autowired
	ISpBankService iSpBankService;

	@Autowired
	ISpLiveStationService iSpLiveStationService;

	@Autowired
	ISpRepresentService iSpRepresentService;

	/**
	 * ǩԼ����ҳ��
	 * @param model
	 * @return
	 * ��������ҳ
	 * ��������ʾҳ
	 * @throws Exception
	 */
	@RequestMapping("/register")
	public String register() throws Exception {
		return "ApplicationPage/ApplicationPage";
	}

	/**
	 * ��������form
	 * @return
	 * spBanks �����б�
	 * spPros ���е���ʡ��
	 * spCitys ���е�����(��ݼ���)
	 * ApplicationPage/Subpage/anchorApp ��������
	 * ApplicationPage/Subpage/otherAnchorApp ��������
	 * @throws Exception
	 */
	@RequestMapping("/register/form")
	public String registerAnForm(Model model, @RequestParam(defaultValue = "1") Integer formType) throws Exception {
		//���У�����service ��ȡ��������
		List<SpBanks> spBanks = iSpBankService.bankList();
		model.addAttribute("spBanks", spBanks);
		//���е�������service����ȡ��������ʡ��
		Integer levelId = 1;//��ʡ:1,�У�4��
		List<SpBankRegion> spBankRegions = iSpBankService.bankRegionListByLevelId(levelId);
		model.addAttribute("spPros", spBankRegions);
		//ֱ��ƽ̨
		List<SpLivestationInfo> spLiveStations = iSpLiveStationService.findAllSpLiveStationInfo();
		model.addAttribute("spLiveStations", spLiveStations);
		switch (formType) {
		case 1:
			return "ApplicationPage/Subpage/anchorApp";//1Ϊ������������
		case 2:
			return "ApplicationPage/Subpage/otherAnchorApp";//2Ϊ���˴�������
		default:
			return "ApplicationPage/Subpage/anchorApp";//��������Ǿͷ��ش���
		}
	}

	/**
	 * ǩԼ���������ϴ�ͼƬ
	 * @param spIdnumsort_pic ���֤��ͼ
	 * @param spLivesort_pic ֱ����ͼ
	 * @return
	 * code:100000,msg:����ɹ�
	 * code:400000,msg:����ʧ��
	 * @throws Exception
	 */
	@RequestMapping("/an/register/upload")
	public @ResponseBody
	JsonMsg registerAnUpload(@RequestParam(value = "spIdnumsort_pic") MultipartFile spIdnumsort_pic,
			@RequestParam(value = "spLivesort_pic") List<MultipartFile> spLivesort_pic) throws Exception {
		//���֤��ͼ��������·��
		String spIdnumSortPath = "E:\\TOMCAT����Ŀ¼\\";
		//String spIdnumSortPath="C:\\zowbman@hotmail.com\\TECHNOLOGY\\TOMCAT����Ŀ¼\\";
		List<String> spIdnumSort_picPath = CustomUploadUtil.upload(spIdnumsort_pic, spIdnumSortPath);
		//ֱ����ͼ��������·��
		String spLiscreensortPath = "E:\\TOMCAT����Ŀ¼\\";
		//String spLiscreensortPath ="C:\\zowbman@hotmail.com\\TECHNOLOGY\\TOMCAT����Ŀ¼\\";
		List<String> spLivesort_picPath = CustomUploadUtil.upload(spLivesort_pic, spLiscreensortPath);

		Map<String, List<String>> picMap = new HashMap<String, List<String>>();
		picMap.put("spIdnumSortPath", spIdnumSort_picPath);
		picMap.put("spLiscreensortPath", spLivesort_picPath);
		if (spIdnumSort_picPath != null && spLivesort_picPath != null) {
			return new JsonMsg(100000, "����ɹ�", null, picMap);
		}
		return new JsonMsg(400000, "����ʧ��", null, picMap);
	}

	/**
	 * ǩԼ��������
	 * @param spAnAppV
	 * @param httpSession
	 * @return
	 * code:100000,msg:����ɹ�
	 * code:400000,msg:����ʧ��
	 * @throws IOException 
	 * @throws IllegalStateException 
	 */
	@RequestMapping("/an/registerSubmit")
	public @ResponseBody
	JsonMsg registerAnSubmit(@RequestBody SpAnchorAppQueryVo spAnAppV, HttpSession httpSession) throws Exception {
		//��ȡ��ǰ�û�
		SpUsersBinfoCustom spUser = (SpUsersBinfoCustom) httpSession.getAttribute("spUser");
		//�Ƿ��Ѿ��ύ����
		if (spUser != null) {
			spAnAppV.getSpAnAppC().setSpAtuid(spUser.getSpAtuid());
			boolean insertSuccess = iSpRepresentService.saveRegisterAn(spAnAppV.getSpAnAppC());
			if (insertSuccess) {
				return JsonMsg.successJsonMsg();
			}
		}
		return JsonMsg.errorJsonMsg();
	}

	/**
	 * ǩԼ���˴����ϴ�ͼƬ
	 * @param spIdnumsort_pic ���֤��ͼ
	 * @param spArscreensort_pic �ݳ���ͼ
	 * @return
	 * code:100000,msg:����ɹ�
	 * code:400000,msg:����ʧ��
	 * @throws Exception
	 */
	@RequestMapping("/ar/register/upload")
	public @ResponseBody
	JsonMsg registerArUpload(@RequestParam(value = "spIdnumsort_pic") MultipartFile spIdnumsort_pic,
			@RequestParam(value = "spArscreensort_pic") List<MultipartFile> spArscreensort_pic) throws Exception {
		//���֤��ͼ��������·��
		String spIdnumSortPath = "E:\\TOMCAT����Ŀ¼\\";
		//String spIdnumSortPath="C:\\zowbman@hotmail.com\\TECHNOLOGY\\TOMCAT����Ŀ¼\\";
		List<String> spIdnumSort_picPath = CustomUploadUtil.upload(spIdnumsort_pic, spIdnumSortPath);
		//�ݳ���ͼ��������·��
		String spArscreensortPath = "E:\\TOMCAT����Ŀ¼\\";
		//String spArscreensortPath ="C:\\zowbman@hotmail.com\\TECHNOLOGY\\TOMCAT����Ŀ¼\\";
		List<String> spArscreensort_picPath = CustomUploadUtil.upload(spArscreensort_pic, spArscreensortPath);
		
		Map<String, List<String>> picMap = new HashMap<String, List<String>>();
		picMap.put("spIdnumSortPath", spIdnumSort_picPath);
		picMap.put("spArscreensortPath", spArscreensort_picPath);
		
		if (spIdnumSort_picPath != null && spArscreensort_picPath != null) {
			return new JsonMsg(100000, "����ɹ�", null, picMap);
		}
		return new JsonMsg(400000, "����ʧ��", null, picMap);
	}

	/**
	 * ǩԼ���˴���
	 * @param SpArappV
	 * @param httpSession
	 * @return
	 * code:100000,msg:����ɹ�
	 * code:400000,msg:����ʧ��
	 * @throws Exception 
	 */
	@RequestMapping("/ar/registerSubmit")
	public @ResponseBody
	JsonMsg registerArSubmit(@RequestBody SpArtistAppQueryVo spArappV, HttpSession httpSession) throws Exception {
		//��ȡ��ǰ�û�
		SpUsersBinfoCustom spUser = (SpUsersBinfoCustom) httpSession.getAttribute("spUser");
		//�Ƿ��Ѿ��ύ����
		if (spUser != null) {
			spArappV.getSpArAppC().setSpAtuid(spUser.getSpAtuid());
			boolean insertSuccess = iSpRepresentService.saveRegisterAr(spArappV.getSpArAppC());
			if (insertSuccess) {
				return JsonMsg.successJsonMsg();
			}
		}
		return JsonMsg.errorJsonMsg();
	}
}
