package com.aotuspace.web.spuser.model.po.priv.custom;

import java.util.Collection;

import com.aotuspace.web.spuser.model.po.priv.SpAotuspacePriv;

/**
 * 
 * Title:SpAotuspacePrivCustom
 * Description:Ȩ����չ
 * Company:aotuspace
 * @author    ΰ��
 * @date      2015-9-12 ����1:37:32
 *
 */
public class SpAotuspacePrivCustom extends SpAotuspacePriv {
	//����String��urls����
	private Collection<String> urls;

	public Collection<String> getUrls() {
		return urls;
	}

	public void setUrls(Collection<String> urls) {
		this.urls = urls;
	}

}
