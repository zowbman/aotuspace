package com.aotuspace.web.spuser.model.po.priv.custom;

import java.util.Collection;

import com.aotuspace.web.spuser.model.po.priv.SpAotuspacePriv;

/**
 * 
 * Title:SpAotuspacePrivCustom
 * Description:权限扩展
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-9-12 下午1:37:32
 *
 */
public class SpAotuspacePrivCustom extends SpAotuspacePriv {
	//集合String的urls数组
	private Collection<String> urls;

	public Collection<String> getUrls() {
		return urls;
	}

	public void setUrls(Collection<String> urls) {
		this.urls = urls;
	}

}
