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
 * Description:用户基本信息扩展
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-9-10 上午11:06:20
 *
 */
public class SpUsersBinfoCustom extends SpUsersBinfo {

	//带验证码参数
	//权限
	//private Set<SpAotuspacePriv> aotuspacePrivs;
	private Set<SpAotuspaceUserPrivCustom> spAotuspaceUserPrivCustoms;
	//角色
	private Set<SpAotuspaceUserRoleCustom> spAotuspaceUserRoleCustoms;
	//组(身份)
	private Set<SpAotuspaceUidenPrivCustom> spAotuspaceUidenPrivCustoms;
	//用户详细信息
	private SpUsersDinfoCustom spUsersDinfoCustom;
	
	//===============非关联对象
	//头像
	private SpUsersAvatar userAvatar;
	
	/**
	 * 判断用户是否有指定的URL的权限
	 * @param privUrl
	 * @return
	 */
	public boolean hasPrivilegeByUrl(String privUrl) {
		WebApplicationContext webApplicationContext = ContextLoader
				.getCurrentWebApplicationContext();
		ServletContext servletContext = webApplicationContext
				.getServletContext();
		//获取Url权限集合
		Collection<String> allPrivilegeUrls = (Collection<String>) servletContext
				.getAttribute("allAotuspacePrivUrls");
		//判断此url是否需要控制
		if (allPrivilegeUrls != null) {
			if (!allPrivilegeUrls.contains(privUrl)) {
				return true;
			} else {
				//如此url需要控制，判断用户是否有这个权限
				//用户本身权限
				for (SpAotuspaceUserPrivCustom spAotuspaceUsersPrivCustoms : spAotuspaceUserPrivCustoms) {
					for (SpAotuspacePrivCustom spAotuspacePrivCustom : spAotuspaceUsersPrivCustoms
							.getSpAotuspacePrivCustoms()) {
						if(privUrl.equals(spAotuspacePrivCustom.getSpUrl())){
							return true;
						}
					}
				}
				
				//用户角色权限
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
				
				//用户身份权限
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

	//getter、setter

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
