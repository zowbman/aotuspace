package com.aotuspace.web.spuser.model.po.user.custom;

import java.util.Collection;
import java.util.Set;

import javax.servlet.ServletContext;

import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

import com.aotuspace.web.spuser.model.po.priv.custom.SpAotuspacePrivCustom;
import com.aotuspace.web.spuser.model.po.priv.custom.SpAotuspaceRolePrivCustom;
import com.aotuspace.web.spuser.model.po.priv.custom.SpAotuspaceUidenPrivCustom;
import com.aotuspace.web.spuser.model.po.priv.custom.SpAotuspaceUserPrivCustom;
import com.aotuspace.web.spuser.model.po.priv.custom.SpAotuspaceUserRoleCustom;
import com.aotuspace.web.spuser.model.po.user.SpUsersAvatar;
import com.aotuspace.web.spuser.model.po.user.SpUsersBinfo;

/**
 * 
 * Title:SpUsersBinfoCustom
 * Description:�û�������Ϣ��չ
 * Company:aotuspace
 * @author    ΰ��
 * @date      2015-9-10 ����11:06:20
 *
 */
public class SpUsersBinfoCustom extends SpUsersBinfo {

	//����֤�����
	//Ȩ��
	//private Set<SpAotuspacePriv> aotuspacePrivs;
	private Set<SpAotuspaceUserPrivCustom> spAotuspaceUserPrivCustoms;
	//��ɫ
	private Set<SpAotuspaceUserRoleCustom> spAotuspaceUserRoleCustoms;
	//��(���)
	private Set<SpAotuspaceUidenPrivCustom> spAotuspaceUidenPrivCustoms;
	//�û���ϸ��Ϣ
	private SpUsersDinfoCustom spUsersDinfoCustom;
	
	//===============�ǹ�������
	//ͷ��
	private SpUsersAvatar userAvatar;
	
	/**
	 * �ж��û��Ƿ���ָ����URL��Ȩ��
	 * @param privUrl
	 * @return
	 */
	public boolean hasPrivilegeByUrl(String privUrl) {
		WebApplicationContext webApplicationContext = ContextLoader
				.getCurrentWebApplicationContext();
		ServletContext servletContext = webApplicationContext
				.getServletContext();
		//��ȡUrlȨ�޼���
		Collection<String> allPrivilegeUrls = (Collection<String>) servletContext
				.getAttribute("allAotuspacePrivUrls");
		//�жϴ�url�Ƿ���Ҫ����
		if (allPrivilegeUrls != null) {
			if (!allPrivilegeUrls.contains(privUrl)) {
				return true;
			} else {
				//���url��Ҫ���ƣ��ж��û��Ƿ������Ȩ��
				//�û�����Ȩ��
				for (SpAotuspaceUserPrivCustom spAotuspaceUsersPrivCustoms : spAotuspaceUserPrivCustoms) {
					for (SpAotuspacePrivCustom spAotuspacePrivCustom : spAotuspaceUsersPrivCustoms
							.getSpAotuspacePrivCustoms()) {
						if(privUrl.equals(spAotuspacePrivCustom.getSpUrl())){
							return true;
						}
					}
				}
				
				//�û���ɫȨ��
				for (SpAotuspaceUserRoleCustom spAotuspaceUserRoleCustom : spAotuspaceUserRoleCustoms) {
					for (SpAotuspaceRolePrivCustom spAotuspaceRolePrivCustom : spAotuspaceUserRoleCustom
							.getSpAotuspaceRolePrivCustoms()) {
						for (SpAotuspacePrivCustom spAotuspacePrivCustom : spAotuspaceRolePrivCustom
								.getSpAotuspacePrivCustoms()) {
							if(privUrl.equals(spAotuspacePrivCustom.getSpUrl())){
								return true;
							}
							/*System.out.println("roleprivs----->"
									+ spAotuspacePrivCustom.getSpUrl());*/
						}
					}
				}
				
				//�û����Ȩ��
				for (SpAotuspaceUidenPrivCustom spAotuspaceUidenPrivCustom : spAotuspaceUidenPrivCustoms) {
					for (SpAotuspacePrivCustom spAotuspacePrivCustom : spAotuspaceUidenPrivCustom
							.getSpAotuspacePrivCustoms()) {
						if(privUrl.equals(spAotuspacePrivCustom.getSpUrl())){
							return true;
						}
						/*System.out.println("uidenprivs----->"
								+ spAotuspacePrivCustom.getSpUrl());*/
					}
				}

			}
		} else {
			return true;
		}
		return false;
	}

	//getter��setter

	public Set<SpAotuspaceUserPrivCustom> getSpAotuspaceUserPrivCustoms() {
		return spAotuspaceUserPrivCustoms;
	}

	public void setSpAotuspaceUserPrivCustoms(
			Set<SpAotuspaceUserPrivCustom> spAotuspaceUserPrivCustoms) {
		this.spAotuspaceUserPrivCustoms = spAotuspaceUserPrivCustoms;
	}

	public Set<SpAotuspaceUserRoleCustom> getSpAotuspaceUserRoleCustoms() {
		return spAotuspaceUserRoleCustoms;
	}

	public void setSpAotuspaceUserRoleCustoms(
			Set<SpAotuspaceUserRoleCustom> spAotuspaceUserRoleCustoms) {
		this.spAotuspaceUserRoleCustoms = spAotuspaceUserRoleCustoms;
	}

	public Set<SpAotuspaceUidenPrivCustom> getSpAotuspaceUidenPrivCustoms() {
		return spAotuspaceUidenPrivCustoms;
	}

	public void setSpAotuspaceUidenPrivCustoms(
			Set<SpAotuspaceUidenPrivCustom> spAotuspaceUidenPrivCustoms) {
		this.spAotuspaceUidenPrivCustoms = spAotuspaceUidenPrivCustoms;
	}

	/*public String getUserAvatar() {
		return userAvatar;
	}

	public void setUserAvatar(String userAvatar) {
		this.userAvatar = userAvatar;
	}*/

	public SpUsersDinfoCustom getSpUsersDinfoCustom() {
		return spUsersDinfoCustom;
	}

	public void setSpUsersDinfoCustom(SpUsersDinfoCustom spUsersDinfoCustom) {
		this.spUsersDinfoCustom = spUsersDinfoCustom;
	}

	public SpUsersAvatar getUserAvatar() {
		return userAvatar;
	}

	public void setUserAvatar(SpUsersAvatar userAvatar) {
		this.userAvatar = userAvatar;
	}
}
