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
 * Description:代言功能模块controller
 * Company:Boundless
 * @author    伟宝
 * @date      2015-9-10 下午12:54:47
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
	 * 签约代言页面
	 * @param model
	 * @return
	 * 返回申请页
	 * 已申请提示页
	 * @throws Exception
	 */
	@RequestMapping("/register")
	public String register() throws Exception {
		return "ApplicationPage/ApplicationPage";
	}

	/**
	 * 代言申请form
	 * @return
	 * spBanks 总行列表
	 * spPros 银行地域省份
	 * spCitys 银行地域市(身份级联)
	 * ApplicationPage/Subpage/anchorApp 主播申请
	 * ApplicationPage/Subpage/otherAnchorApp 艺人申请
	 * @throws Exception
	 */
	@RequestMapping("/register/form")
	public String registerAnForm(Model model, @RequestParam(defaultValue = "1") Integer formType) throws Exception {
		//总行：请求service 获取所有银行
		List<SpBanks> spBanks = iSpBankService.bankList();
		model.addAttribute("spBanks", spBanks);
		//银行地域：请求service，获取所有银行省份
		Integer levelId = 1;//（省:1,市：4）
		List<SpBankRegion> spBankRegions = iSpBankService.bankRegionListByLevelId(levelId);
		model.addAttribute("spPros", spBankRegions);
		//直播平台
		List<SpLivestationInfo> spLiveStations = iSpLiveStationService.findAllSpLiveStationInfo();
		model.addAttribute("spLiveStations", spLiveStations);
		switch (formType) {
		case 1:
			return "ApplicationPage/Subpage/anchorApp";//1为主播代言申请
		case 2:
			return "ApplicationPage/Subpage/otherAnchorApp";//2为艺人代言申请
		default:
			return "ApplicationPage/Subpage/anchorApp";//如果都不是就返回错误
		}
	}

	/**
	 * 签约主播代言上传图片
	 * @param spIdnumsort_pic 身份证截图
	 * @param spLivesort_pic 直播截图
	 * @return
	 * code:100000,msg:请求成功
	 * code:400000,msg:请求失败
	 * @throws Exception
	 */
	@RequestMapping("/an/register/upload")
	public @ResponseBody
	JsonMsg registerAnUpload(@RequestParam(value = "spIdnumsort_pic") MultipartFile spIdnumsort_pic,
			@RequestParam(value = "spLivesort_pic") List<MultipartFile> spLivesort_pic) throws Exception {
		//身份证截图保存物理路径
		String spIdnumSortPath = "E:\\TOMCAT虚拟目录\\";
		//String spIdnumSortPath="C:\\zowbman@hotmail.com\\TECHNOLOGY\\TOMCAT虚拟目录\\";
		List<String> spIdnumSort_picPath = CustomUploadUtil.upload(spIdnumsort_pic, spIdnumSortPath);
		//直播截图保存物理路径
		String spLiscreensortPath = "E:\\TOMCAT虚拟目录\\";
		//String spLiscreensortPath ="C:\\zowbman@hotmail.com\\TECHNOLOGY\\TOMCAT虚拟目录\\";
		List<String> spLivesort_picPath = CustomUploadUtil.upload(spLivesort_pic, spLiscreensortPath);

		Map<String, List<String>> picMap = new HashMap<String, List<String>>();
		picMap.put("spIdnumSortPath", spIdnumSort_picPath);
		picMap.put("spLiscreensortPath", spLivesort_picPath);
		if (spIdnumSort_picPath != null && spLivesort_picPath != null) {
			return new JsonMsg(100000, "请求成功", null, picMap);
		}
		return new JsonMsg(400000, "请求失败", null, picMap);
	}

	/**
	 * 签约主播代言
	 * @param spAnAppV
	 * @param httpSession
	 * @return
	 * code:100000,msg:请求成功
	 * code:400000,msg:请求失败
	 * @throws IOException 
	 * @throws IllegalStateException 
	 */
	@RequestMapping("/an/registerSubmit")
	public @ResponseBody
	JsonMsg registerAnSubmit(@RequestBody SpAnchorAppQueryVo spAnAppV, HttpSession httpSession) throws Exception {
		//获取当前用户
		SpUsersBinfoCustom spUser = (SpUsersBinfoCustom) httpSession.getAttribute("spUser");
		//是否已经提交申请
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
	 * 签约艺人代言上传图片
	 * @param spIdnumsort_pic 身份证截图
	 * @param spArscreensort_pic 演出截图
	 * @return
	 * code:100000,msg:请求成功
	 * code:400000,msg:请求失败
	 * @throws Exception
	 */
	@RequestMapping("/ar/register/upload")
	public @ResponseBody
	JsonMsg registerArUpload(@RequestParam(value = "spIdnumsort_pic") MultipartFile spIdnumsort_pic,
			@RequestParam(value = "spArscreensort_pic") List<MultipartFile> spArscreensort_pic) throws Exception {
		//身份证截图保存物理路径
		String spIdnumSortPath = "E:\\TOMCAT虚拟目录\\";
		//String spIdnumSortPath="C:\\zowbman@hotmail.com\\TECHNOLOGY\\TOMCAT虚拟目录\\";
		List<String> spIdnumSort_picPath = CustomUploadUtil.upload(spIdnumsort_pic, spIdnumSortPath);
		//演出截图保存物理路径
		String spArscreensortPath = "E:\\TOMCAT虚拟目录\\";
		//String spArscreensortPath ="C:\\zowbman@hotmail.com\\TECHNOLOGY\\TOMCAT虚拟目录\\";
		List<String> spArscreensort_picPath = CustomUploadUtil.upload(spArscreensort_pic, spArscreensortPath);
		
		Map<String, List<String>> picMap = new HashMap<String, List<String>>();
		picMap.put("spIdnumSortPath", spIdnumSort_picPath);
		picMap.put("spArscreensortPath", spArscreensort_picPath);
		
		if (spIdnumSort_picPath != null && spArscreensort_picPath != null) {
			return new JsonMsg(100000, "请求成功", null, picMap);
		}
		return new JsonMsg(400000, "请求失败", null, picMap);
	}

	/**
	 * 签约艺人代言
	 * @param SpArappV
	 * @param httpSession
	 * @return
	 * code:100000,msg:请求成功
	 * code:400000,msg:请求失败
	 * @throws Exception 
	 */
	@RequestMapping("/ar/registerSubmit")
	public @ResponseBody
	JsonMsg registerArSubmit(@RequestBody SpArtistAppQueryVo spArappV, HttpSession httpSession) throws Exception {
		//获取当前用户
		SpUsersBinfoCustom spUser = (SpUsersBinfoCustom) httpSession.getAttribute("spUser");
		//是否已经提交申请
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
