package com.aotuspace.web.spuser.model.po.priv.custom;

import java.util.Set;

import com.aotuspace.web.spuser.model.po.priv.SpAotuspaceRolePriv;

/**
 * 
 * Title:SpAotuspaceRolePriv
 * Description:角色权限
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-9-13 下午8:32:37
 *
 */
public class SpAotuspaceRolePrivCustom extends SpAotuspaceRolePriv {
	
	private Set<SpAotuspacePrivCustom> spAotuspacePrivCustoms;

	public Set<SpAotuspacePrivCustom> getSpAotuspacePrivCustoms() {
		return spAotuspacePrivCustoms;
	}

	public void setSpAotuspacePrivCustoms(
			Set<SpAotuspacePrivCustom> spAotuspacePrivCustoms) {
		this.spAotuspacePrivCustoms = spAotuspacePrivCustoms;
	}

	
   
}