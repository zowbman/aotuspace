package com.aotuspace.web.spuser.model.po.priv.custom;

import java.util.Set;

import com.aotuspace.web.spuser.model.po.priv.SpAotuspaceUserRole;

/**
 * 
 * Title:SpAotuspaceUserRole
 * Description:�û���ɫ��չ
 * Company:aotuspace
 * @author    ΰ��
 * @date      2015-9-14 ����7:50:44
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