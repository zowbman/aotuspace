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
 * Description:�û�����ģ��controller
 * Company:aotuspace
 * @author    ΰ��
 * @date      2015-9-10 ����10:27:01
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

	//��¼ҳ��
	@RequestMapping("/login")
	public String login() {
		//�Ƿ��Ѿ���¼
		//��֤�����ʲô��
		/*return "jsp/aotuspace/user/login";*/
		return "Landed&Registered/Landinginterface";
	}

	//��¼
	@RequestMapping("/loginSubmit")
	public @ResponseBody
	JsonMsg loginSubmit(HttpSession httpSession, HttpServletRequest httpServletRequest,
			@RequestBody SpUsersBinfoQueryVo spUsersBinfoQueryVo,
			@CookieValue(value = "JSESSIONID", defaultValue = "") String sessionId, HttpServletResponse resp)
			throws Exception {
		//ʹ��hibernate-validation���з���������֤
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
			//���سɹ�ҳ��
			//��ȡ��һ������url
		}
		/*}
		}*/
		//�����û��������
		return JsonMsg.errorJsonMsg();
	}

	//ע��ҳ��
	@RequestMapping("/register")
	public String register() {
		//token��Ϣ
		return "Landed&Registered/Registered";
	}

	/**
	 * ע��
	 * @param spUsersBinfoQueryV
	 * @param httpSession
	 * @return
	 * code:100000,msg:����ɹ�
	 * code:200000,msg:�û����ظ�
	 * code:300000,msg:���������������
	 * @throws Exception
	 */
	@RequestMapping("/registerSubmit")
	public @ResponseBody JsonMsg registerSubmit(@RequestBody SpUsersBinfoQueryVo spUsersBinfoQueryV, HttpSession httpSession) throws Exception {
		String userRootPath = "E:\\TOMCAT����Ŀ¼\\";//��ʼ���˺�Ŀ¼
		//String userRootPath ="C:\\zowbman@hotmail.com\\TECHNOLOGY\\TOMCAT����Ŀ¼\\";
		//�����֤������������������Ƿ���ȷ
		if (spUsersBinfoQueryV.getSpUser().getSpPassword().equals(spUsersBinfoQueryV.getRepPass())) {
			//ע��
			//������װ,ip��ַ��ȡ,ע��ػ�ȡ,ע��ʱ��
			SpUsersBinfoCustom spUsersBinfoCustom = iSpUsersService
					.register(spUsersBinfoQueryV.getSpUser());
			if (spUsersBinfoCustom != null) {
				/*spUsersBinfoQueryV.setSpUserC(spUsersBinfoCustom);
				//��¼
				spUsersBinfoCustom = iSpUsersService
						.login(spUsersBinfoQueryV);
				if (spUsersBinfoCustom != null) {
					httpSession.setAttribute("spUser", spUsersBinfoCustom);
				}*/
				//��ʼ��һ��Ŀ¼�û�Ŀ¼
				File destFile = new File(userRootPath+spUsersBinfoCustom.getSpAtuid());
				if (!destFile.exists() && !destFile.isDirectory()) {
					destFile.mkdirs();
				}
				return JsonMsg.successJsonMsg();
			}else{
				//�û����ظ�
				return new JsonMsg(200000,"�û����ظ�",null,null);
			}
		}else{
			return new JsonMsg(300000,"���������������",null,null);
		}
		//System.out.println("ip------->"+iGetClientInfoService.findClientIp(httpServletRequest));��ѯ�ͻ���ip��ַ
		//iGetClientInfoService.findClientAddress("ip=125.88.172.247");
	}

	//�˳���¼
	@RequestMapping("/logout")
	public String logout(HttpSession httpSession) {
		httpSession.removeAttribute("spUser");
		return "redirect:/index";
	}

	//�һ�����(���)
	@RequestMapping("findPW")
	public String findPW() {
		return "Retrievepassword/Retrievepassword";
	}
	
	//�һ�����
	@RequestMapping("/findPWSubmit")
	public String findPWSubmit() {
		//return "Retrievepassword/Retrievepassword";
		return null;
	}
	
	//�һ�����-��֤���
	@RequestMapping("/findPw/verify")
	public String verify(){
		return "Retrievepassword/Retrievepassword-verify";
	}

	//�һ�����-��������
	@RequestMapping("/findPw/rp")
	public String rp() {
		return "Retrievepassword/Retrievepassword-rp";
	}
	
	//�һ�����-��������
	@RequestMapping("/findPw/success")
	public String success() {
		return "Retrievepassword/Retrievepassword-success";
	}
	
	/**
	 * ���˿ռ�:������Ϣ
	 * @param httpSession
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/myProfile")
	public String myProfile(HttpSession httpSession,Model model)throws Exception{
		SpUsersBinfoCustom spUsersBinfoCustom=(SpUsersBinfoCustom) httpSession.getAttribute("spUser");//��ȡ��ǰ�û�
		if(spUsersBinfoCustom!=null){
			SpUsersDinfoKey key=new SpUsersDinfoKey();
			key.setSpId(spUsersBinfoCustom.getSpId());
			key.setSpAtuid(spUsersBinfoCustom.getSpAtuid());
			SpUsersDinfo spUsersDinfo=iSpUsersService.findUserDInfoByKey(key);
			model.addAttribute("spUserD", spUsersDinfo);
		}
		//��ȡ��ǰ�û�
		return "PersonalC/ContentsPage/BasicData";
	}
	
	/**
	 * ���˿ռ�:�˺Ű�ȫ
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/safety")
	public String safety()throws Exception{
		return "PersonalC/ContentsPage/AccountSecurity";
	}
	
	/**
	 * ���˿ռ�:�ҵĶ���
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/boughtItems")
	public String boughtItems()throws Exception{
		return "PersonalC/ContentsPage/MyGoods";
	}
	
	/**
	 * ���˿ռ�:�ջ���ַ
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/deliver")
	public String receivAddress(HttpSession httpSession ,Model model)throws Exception{
		SpUsersBinfoCustom spUsersBinfoCustom=(SpUsersBinfoCustom) httpSession.getAttribute("spUser");//��ȡ��ǰ�û�
		if(spUsersBinfoCustom!=null){
			//����aotuid��ѯ�ջ��ַ
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
		//��������ʡ��������ѯʡ����(0:ʡ)
		List<SpDistrictInfo> province =iSpAreaService.findAreaList(0);
		model.addAttribute("province", province);
		return "PersonalC/ContentsPage/ReceivAddress";
	}
	
	/**
	 * ���˿ռ�:�����ղ�
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/collectBaby")
	public String collectionBaby()throws Exception{
		return "PersonalC/ContentsPage/Mycollection-Baby";
	}
	
	/**
	 * ���˿ռ�:�����ղ�
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/collectArtist")
	public String collectionArtist()throws Exception{
		return "PersonalC/ContentsPage/Mycollection-Artist";
	}
	
	/**
	 * �ϴ�ͷ��ҳ��
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/changeAvatar")
	public String changeAvatar()throws Exception{
		return "PersonalC/ContentsPage/ChangeAvatar";
	}
	
	/**
	 * �ϴ�ͷ��
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/changeAvatar!upload")
	public @ResponseBody AvatarJsonMsg avatarUpload(HttpServletRequest httpServletRequest,HttpSession httpSession)throws Exception{
		String avatarPath ="C:\\zowbman@hotmail.com\\TECHNOLOGY\\TOMCAT����Ŀ¼\\";
		SpUsersBinfoCustom currentSpUser=(SpUsersBinfoCustom) httpSession.getAttribute("spUser");
		if(currentSpUser!=null){
			//�ж�form�Ƿ�Ϊmultipart form
			boolean isMultipart=httpServletRequest.getContentType().indexOf("multipart/form-data")>=0 ?true:false;
			if(isMultipart){
				FileItemFactory fileItemFactory=new DiskFileItemFactory();//���ù���
				ServletFileUpload upload=new ServletFileUpload(fileItemFactory);
				FileItemIterator fileItems=upload.getItemIterator(httpServletRequest);
				//��������
				String originalImgName="";
				String[] spec=new String[]{"50x50","32x32"};
				Integer specIndex=0;
				SpUsersAvatarCustom spUsersAvatarCustom=null;
				//������ͷ����Ϣ
				while (fileItems.hasNext()) {
					FileItemStream fileItem = fileItems.next();
					String fieldName=fileItem.getFieldName();
					if(fieldName.startsWith("__avatar1")){//��һ��Ϊԭͼ��100x100
						originalImgName=CustomUploadUtil.uploadAvatar(fileItem, avatarPath+currentSpUser.getSpAtuid()+"/avatar/",null,null);
						//��͹id/avatar/�ļ���
						iSpUsersService.saveUserAvatar(spUsersAvatarCustom=new SpUsersAvatarCustom(currentSpUser.getSpAtuid()+"/avatar/"+originalImgName));
						currentSpUser.setUserAvatar(spUsersAvatarCustom);//����session��
					}else if(fieldName.startsWith("__avatar")){//����Ϊ����ͼ 50x50,32x32
						String thumbnailImgNam= CustomUploadUtil.uploadAvatar(fileItem, avatarPath+currentSpUser.getSpAtuid()+"/avatar/",originalImgName,spec[specIndex++]);
						iSpUsersService.saveUserAvatar(new SpUsersAvatarCustom(currentSpUser.getSpAtuid()+"/avatar/"+thumbnailImgNam,spUsersAvatarCustom.getSpId()));
					}
				}
				//�����û���ϸ��Ϣ�ľ�ͷ����Ϣ
				SpUsersDinfoKey key=new SpUsersDinfoCustom();
				key.setSpId(currentSpUser.getSpId());
				key.setSpAtuid(currentSpUser.getSpAtuid());
				SpUsersDinfo spUsersDinfo=iSpUsersService.findUserDInfoByKey(key);
				if(spUsersDinfo!=null){
					Integer oldAvatar=spUsersDinfo.getSpIcon();
					//�����û���ϸ��Ϣ�ľ�ͷ��idΪ��ͷ����Ϣ
					spUsersDinfo.setSpIcon(spUsersAvatarCustom.getSpId());//ԭͼid
					//ɾ����ͷ����Ϣ�����ݿ⣬�ļ���
					//ɾ���ļ�
					SpUsersAvatar spUsersAvatar=iSpUsersService.findUserAvatarBySpId(oldAvatar);
					if(spUsersAvatar!=null){
						boolean result= CustomDeleteFileUtil.deleteFile(avatarPath+spUsersAvatar.getSpAvatar());
						if(result)
							System.out.println("ɾ���ɹ�-->"+avatarPath+spUsersAvatar.getSpAvatar());
						System.out.println("ɾ��ʧ��-->"+avatarPath+spUsersAvatar.getSpAvatar());
					}
					List<SpUsersAvatar> spUsersAvatars=iSpUsersService.findUserAvatarByAvatarId(oldAvatar);
					if(spUsersAvatars!=null){
						for (SpUsersAvatar avatar : spUsersAvatars) {
							boolean result= CustomDeleteFileUtil.deleteFile(avatarPath+avatar.getSpAvatar());
							if(result)
								System.out.println("ɾ���ɹ�-->"+avatarPath+avatar.getSpAvatar());
							System.out.println("ɾ��ʧ��-->"+avatarPath+avatar.getSpAvatar());
						}
					}
					iSpUsersService.updateUserDinfo(spUsersDinfo);
					//ɾ�����ݿ���Ϣ
					iSpUsersService.deleteUserAvatar(oldAvatar);
				}
				//
				return AvatarJsonMsg.successAvatarJsonMsg();
			}
		}
		return AvatarJsonMsg.errorAvatarJsonMsg();
	}
}
