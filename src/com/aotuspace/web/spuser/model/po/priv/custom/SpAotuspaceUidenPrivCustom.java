package com.aotuspace.web.spuser.model.po.priv.custom;

import java.util.Set;

import com.aotuspace.web.spuser.model.po.priv.SpAotuspaceUidenPriv;

/**
 * 
 * Title:SpAotuspaceUidenPriv
 * Description:���Ȩ����չ
 * Company:aotuspace
 * @author    ΰ��
 * @date      2015-9-13 ����8:33:00
 *
 */
public class SpAotuspaceUidenPrivCustom extends SpAotuspaceUidenPriv {

	private Set<SpAotuspacePrivCustom> spAotuspacePrivCustoms;

	public Set<SpAotuspacePrivCustom> getSpAotuspacePrivCustoms() {
		return spAotuspacePrivCustoms;
	}

	public void setSpAotuspacePrivCustoms(
			Set<SpAotuspacePrivCustom> spAotuspacePrivCustoms) {
		this.spAotuspacePrivCustoms = spAotuspacePrivCustoms;
	}

	

}