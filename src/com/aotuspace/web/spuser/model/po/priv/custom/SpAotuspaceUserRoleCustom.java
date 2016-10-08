package com.aotuspace.web.spuser.model.po.priv.custom;

import java.util.Set;

import com.aotuspace.web.spuser.model.po.priv.SpAotuspaceUserRole;

/**
 * 
 * Title:SpAotuspaceUserRole
 * Description:用户角色扩展
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-9-14 下午7:50:44
 *
 */
public class SpAotuspaceUserRoleCustom extends SpAotuspaceUserRole {

	private Set<SpAotuspaceRolePrivCustom> spAotuspaceRolePrivCustoms;

	public Set<SpAotuspaceRolePrivCustom> getSpAotuspaceRolePrivCustoms() {
		return spAotuspaceRolePrivCustoms;
	}

	public void setSpAotuspaceRolePrivCustoms(
			Set<SpAotuspaceRolePrivCustom> spAotuspaceRolePrivCustoms) {
		this.spAotuspaceRolePrivCustoms = spAotuspaceRolePrivCustoms;
	}
	

}