package com.aotuspace.web.spuser.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileItemIterator;
import org.apache.commons.fileupload.FileItemStream;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aotuspace.web.global.clientinfo.service.IGetClientInfoService;
import com.aotuspace.web.global.jsonmsg.model.AvatarJsonMsg;
import com.aotuspace.web.global.jsonmsg.model.JsonMsg;
import com.aotuspace.web.spdictionary.model.po.area.SpDistrictInfo;
import com.aotuspace.web.spdictionary.service.area.ISpAreaService;
import com.aotuspace.web.spuser.model.po.deliver.SpDeliverInfo;
import com.aotuspace.web.spuser.model.po.deliver.custom.SpDeliverInfoCustom;
import com.aotuspace.web.spuser.model.po.user.SpUsersAvatar;
import com.aotuspace.web.spuser.model.po.user.SpUsersDinfo;
import com.aotuspace.web.spuser.model.po.user.SpUsersDinfoKey;
import com.aotuspace.web.spuser.model.po.user.custom.SpUsersAvatarCustom;
import com.aotuspace.web.spuser.model.po.user.custom.SpUsersBinfoCustom;
import com.aotuspace.web.spuser.model.po.user.custom.SpUsersDinfoCustom;
import com.aotuspace.web.spuser.model.vo.user.SpUsersBinfoQueryVo;
import com.aotuspace.web.spuser.service.ISpDeliverService;
import com.aotuspace.web.spuser.service.ISpUsersService;
import com.aotuspace.web.util.CustomDeleteFileUtil;
import com.aotuspace.web.util.CustomUploadUtil;
import com.aotuspace.web.util.WebUtil;

/**
 * 
 * Title:LoginController
 * Description:用户功能模块controller
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-9-10 上午10:27:01
 *
 */
@Controller
@RequestMapping("/u")
public class SpUserController {

	@Autowired
	ISpUsersService iSpUsersService;
	
	@Autowired
	IGetClientInfoService iGetClientInfoService;
	
	@Autowired
	ISpDeliverService iSpDeliverService;
	
	@Autowired 
	ISpAreaService iSpAreaService;

	//登录页面
	@RequestMapping("/login")
	public String login() {
		//是否已经登录
		//验证码调用什么的
		/*return "jsp/aotuspace/user/login";*/
		return "Landed&Registered/Landinginterface";
	}

	//登录
	@RequestMapping("/loginSubmit")
	public @ResponseBody
	JsonMsg loginSubmit(HttpSession httpSession, HttpServletRequest httpServletRequest,
			@RequestBody SpUsersBinfoQueryVo spUsersBinfoQueryVo,
			@CookieValue(value = "JSESSIONID", defaultValue = "") String sessionId, HttpServletResponse resp)
			throws Exception {
		//使用hibernate-validation进行服务器端验证
		/*if (spUsersBinfoQueryVo.getSpUserC() != null) {
			if ((spUsersBinfoQueryVo.getSpUserC().getSpAccount() != null && spUsersBinfoQueryVo
					.getSpUserC().getSpAccount() != "")
					&& (spUsersBinfoQueryVo.getSpUserC().getSpPassword() != null && spUsersBinfoQueryVo
							.getSpUserC().getSpPassword() != "")) {*/
		SpUsersBinfoCustom spUsersBinfoCustom = iSpUsersService.login(spUsersBinfoQueryVo);
		if (spUsersBinfoCustom != null) {
			if (httpServletRequest.getHeader("Referer").indexOf("login") < 0) {
				/*return "redirect:"
						+ httpServletRequest.getHeader("Referer");*/
			}
			
			SpUsersDinfoKey key=new SpUsersDinfoKey();
			key.setSpId(spUsersBinfoCustom.getSpId());
			key.setSpAtuid(spUsersBinfoCustom.getSpAtuid());
			SpUsersDinfo spUsersDinfo=iSpUsersService.findUserDInfoByKey(key);
			if(spUsersDinfo!=null){
				SpUsersAvatar spUsersAvatar=iSpUsersService.findUserAvatarBySpId(spUsersDinfo.getSpIcon());
				spUsersBinfoCustom.setUserAvatar(spUsersAvatar);
			}
			
			httpSession.setAttribute("spUser", spUsersBinfoCustom);
			WebUtil.addCookie(resp, "spUserId", sessionId, httpSession.getMaxInactiveInterval());
			return JsonMsg.successJsonMsg();
			//返回成功页面
			//获取上一个请求url
		}
		/*}
		}*/
		//返回用户密码错误
		return JsonMsg.errorJsonMsg();
	}

	//注册页面
	@RequestMapping("/register")
	public String register() {
		//token信息
		return "Landed&Registered/Registered";
	}

	/**
	 * 注册
	 * @param spUsersBinfoQueryV
	 * @param httpSession
	 * @return
	 * code:100000,msg:请求成功
	 * code:200000,msg:用户名重复
	 * code:300000,msg:二次密码输入错误
	 * @throws Exception
	 */
	@RequestMapping("/registerSubmit")
	public @ResponseBody JsonMsg registerSubmit(@RequestBody SpUsersBinfoQueryVo spUsersBinfoQueryV, HttpSession httpSession) throws Exception {
		String userRootPath = "E:\\TOMCAT虚拟目录\\";//初始化账号目录
		//String userRootPath ="C:\\zowbman@hotmail.com\\TECHNOLOGY\\TOMCAT虚拟目录\\";
		//后端验证密码与二次输入密码是否正确
		if (spUsersBinfoQueryV.getSpUser().getSpPassword().equals(spUsersBinfoQueryV.getRepPass())) {
			//注册
			//参数封装,ip地址获取,注册地获取,注册时间
			SpUsersBinfoCustom spUsersBinfoCustom = iSpUsersService
					.register(spUsersBinfoQueryV.getSpUser());
			if (spUsersBinfoCustom != null) {
				/*spUsersBinfoQueryV.setSpUserC(spUsersBinfoCustom);
				//登录
				spUsersBinfoCustom = iSpUsersService
						.login(spUsersBinfoQueryV);
				if (spUsersBinfoCustom != null) {
					httpSession.setAttribute("spUser", spUsersBinfoCustom);
				}*/
				//初始化一个目录用户目录
				File destFile = new File(userRootPath+spUsersBinfoCustom.getSpAtuid());
				if (!destFile.exists() && !destFile.isDirectory()) {
					destFile.mkdirs();
				}
				return JsonMsg.successJsonMsg();
			}else{
				//用户名重复
				return new JsonMsg(200000,"用户名重复",null,null);
			}
		}else{
			return new JsonMsg(300000,"二次密码输入错误",null,null);
		}
		//System.out.println("ip------->"+iGetClientInfoService.findClientIp(httpServletRequest));查询客户端ip地址
		//iGetClientInfoService.findClientAddress("ip=125.88.172.247");
	}

	//退出登录
	@RequestMapping("/logout")
	public String logout(HttpSession httpSession) {
		httpSession.removeAttribute("spUser");
		return "redirect:/index";
	}

	//找回密码(入口)
	@RequestMapping("findPW")
	public String findPW() {
		return "Retrievepassword/Retrievepassword";
	}
	
	//找回密码
	@RequestMapping("/findPWSubmit")
	public String findPWSubmit() {
		//return "Retrievepassword/Retrievepassword";
		return null;
	}
	
	//找回密码-验证身份
	@RequestMapping("/findPw/verify")
	public String verify(){
		return "Retrievepassword/Retrievepassword-verify";
	}

	//找回密码-重置密码
	@RequestMapping("/findPw/rp")
	public String rp() {
		return "Retrievepassword/Retrievepassword-rp";
	}
	
	//找回密码-重置密码
	@RequestMapping("/findPw/success")
	public String success() {
		return "Retrievepassword/Retrievepassword-success";
	}
	
	/**
	 * 个人空间:基本信息
	 * @param httpSession
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/myProfile")
	public String myProfile(HttpSession httpSession,Model model)throws Exception{
		SpUsersBinfoCustom spUsersBinfoCustom=(SpUsersBinfoCustom) httpSession.getAttribute("spUser");//获取当前用户
		if(spUsersBinfoCustom!=null){
			SpUsersDinfoKey key=new SpUsersDinfoKey();
			key.setSpId(spUsersBinfoCustom.getSpId());
			key.setSpAtuid(spUsersBinfoCustom.getSpAtuid());
			SpUsersDinfo spUsersDinfo=iSpUsersService.findUserDInfoByKey(key);
			model.addAttribute("spUserD", spUsersDinfo);
		}
		//获取当前用户
		return "PersonalC/ContentsPage/BasicData";
	}
	
	/**
	 * 个人空间:账号安全
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/safety")
	public String safety()throws Exception{
		return "PersonalC/ContentsPage/AccountSecurity";
	}
	
	/**
	 * 个人空间:我的订单
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/boughtItems")
	public String boughtItems()throws Exception{
		return "PersonalC/ContentsPage/MyGoods";
	}
	
	/**
	 * 个人空间:收货地址
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/deliver")
	public String receivAddress(HttpSession httpSession ,Model model)throws Exception{
		SpUsersBinfoCustom spUsersBinfoCustom=(SpUsersBinfoCustom) httpSession.getAttribute("spUser");//获取当前用户
		if(spUsersBinfoCustom!=null){
			//根据aotuid查询收获地址
			List<SpDeliverInfoCustom> spDeliverInfoCustoms=new ArrayList<SpDeliverInfoCustom>();
			List<SpDeliverInfo> spDeliverInfos=iSpDeliverService.findDeliverInfoByAutoId(spUsersBinfoCustom.getSpAtuid());
			if(spDeliverInfos!=null){
				for (SpDeliverInfo spDeliverInfo : spDeliverInfos) {
					SpDeliverInfoCustom spDeliverInfoCustom=new SpDeliverInfoCustom();
					BeanUtils.copyProperties(spDeliverInfo, spDeliverInfoCustom);
					spDeliverInfoCustoms.add(spDeliverInfoCustom);
				}
			}
			model.addAttribute("delivers", spDeliverInfoCustoms);
		}
		//三级联动省市区，查询省出来(0:省)
		List<SpDistrictInfo> province =iSpAreaService.findAreaList(0);
		model.addAttribute("province", province);
		return "PersonalC/ContentsPage/ReceivAddress";
	}
	
	/**
	 * 个人空间:宝贝收藏
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/collectBaby")
	public String collectionBaby()throws Exception{
		return "PersonalC/ContentsPage/Mycollection-Baby";
	}
	
	/**
	 * 个人空间:艺人收藏
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/collectArtist")
	public String collectionArtist()throws Exception{
		return "PersonalC/ContentsPage/Mycollection-Artist";
	}
	
	/**
	 * 上传头像页面
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/changeAvatar")
	public String changeAvatar()throws Exception{
		return "PersonalC/ContentsPage/ChangeAvatar";
	}
	
	/**
	 * 上传头像
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/changeAvatar!upload")
	public @ResponseBody AvatarJsonMsg avatarUpload(HttpServletRequest httpServletRequest,HttpSession httpSession)throws Exception{
		String avatarPath ="C:\\zowbman@hotmail.com\\TECHNOLOGY\\TOMCAT虚拟目录\\";
		SpUsersBinfoCustom currentSpUser=(SpUsersBinfoCustom) httpSession.getAttribute("spUser");
		if(currentSpUser!=null){
			//判断form是否为multipart form
			boolean isMultipart=httpServletRequest.getContentType().indexOf("multipart/form-data")>=0 ?true:false;
			if(isMultipart){
				FileItemFactory fileItemFactory=new DiskFileItemFactory();//设置工厂
				ServletFileUpload upload=new ServletFileUpload(fileItemFactory);
				FileItemIterator fileItems=upload.getItemIterator(httpServletRequest);
				//遍历表单域
				String originalImgName="";
				String[] spec=new String[]{"50x50","32x32"};
				Integer specIndex=0;
				SpUsersAvatarCustom spUsersAvatarCustom=null;
				//插入新头像信息
				while (fileItems.hasNext()) {
					FileItemStream fileItem = fileItems.next();
					String fieldName=fileItem.getFieldName();
					if(fieldName.startsWith("__avatar1")){//第一张为原图：100x100
						originalImgName=CustomUploadUtil.uploadAvatar(fileItem, avatarPath+currentSpUser.getSpAtuid()+"/avatar/",null,null);
						//凹凸id/avatar/文件名
						iSpUsersService.saveUserAvatar(spUsersAvatarCustom=new SpUsersAvatarCustom(currentSpUser.getSpAtuid()+"/avatar/"+originalImgName));
						currentSpUser.setUserAvatar(spUsersAvatarCustom);//放在session中
					}else if(fieldName.startsWith("__avatar")){//后面为缩略图 50x50,32x32
						String thumbnailImgNam= CustomUploadUtil.uploadAvatar(fileItem, avatarPath+currentSpUser.getSpAtuid()+"/avatar/",originalImgName,spec[specIndex++]);
						iSpUsersService.saveUserAvatar(new SpUsersAvatarCustom(currentSpUser.getSpAtuid()+"/avatar/"+thumbnailImgNam,spUsersAvatarCustom.getSpId()));
					}
				}
				//查找用户详细信息的旧头像信息
				SpUsersDinfoKey key=new SpUsersDinfoCustom();
				key.setSpId(currentSpUser.getSpId());
				key.setSpAtuid(currentSpUser.getSpAtuid());
				SpUsersDinfo spUsersDinfo=iSpUsersService.findUserDInfoByKey(key);
				if(spUsersDinfo!=null){
					Integer oldAvatar=spUsersDinfo.getSpIcon();
					//更改用户详细信息的旧头像id为新头像信息
					spUsersDinfo.setSpIcon(spUsersAvatarCustom.getSpId());//原图id
					//删除旧头像信息（数据库，文件）
					//删除文件
					SpUsersAvatar spUsersAvatar=iSpUsersService.findUserAvatarBySpId(oldAvatar);
					if(spUsersAvatar!=null){
						boolean result= CustomDeleteFileUtil.deleteFile(avatarPath+spUsersAvatar.getSpAvatar());
						if(result)
							System.out.println("删除成功-->"+avatarPath+spUsersAvatar.getSpAvatar());
						System.out.println("删除失败-->"+avatarPath+spUsersAvatar.getSpAvatar());
					}
					List<SpUsersAvatar> spUsersAvatars=iSpUsersService.findUserAvatarByAvatarId(oldAvatar);
					if(spUsersAvatars!=null){
						for (SpUsersAvatar avatar : spUsersAvatars) {
							boolean result= CustomDeleteFileUtil.deleteFile(avatarPath+avatar.getSpAvatar());
							if(result)
								System.out.println("删除成功-->"+avatarPath+avatar.getSpAvatar());
							System.out.println("删除失败-->"+avatarPath+avatar.getSpAvatar());
						}
					}
					iSpUsersService.updateUserDinfo(spUsersDinfo);
					//删除数据库信息
					iSpUsersService.deleteUserAvatar(oldAvatar);
				}
				//
				return AvatarJsonMsg.successAvatarJsonMsg();
			}
		}
		return AvatarJsonMsg.errorAvatarJsonMsg();
	}
}
