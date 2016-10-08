package com.aotuspace.web.spgoods.model.po.product.custom;

import java.util.HashSet;
import java.util.Set;

import com.aotuspace.web.spgoods.model.po.product.SpProductBinfo;
import com.aotuspace.web.spgoods.model.po.product.SpProductBrands;

/**
 * 
 * Title:SpProductBinfoCustom
 * Description:��Ʒ��չ��
 * Company:aotuspace
 * @author    ΰ��
 * @date      2015-12-1 ����3:06:17
 *
 */
public class SpProductBinfoCustom extends SpProductBinfo {
	//Ʒ��
	private SpProductBrands spProductBrands;

	//��Ʒ����
	private Set<SpProductBpropertiesCustom> spProductBpropertiesCustoms=new HashSet<SpProductBpropertiesCustom>();

	public Set<SpProductBpropertiesCustom> getSpProductBpropertiesCustoms() {
		return spProductBpropertiesCustoms;
	}

	public void setSpProductBpropertiesCustoms(Set<SpProductBpropertiesCustom> spProductBpropertiesCustoms) {
		this.spProductBpropertiesCustoms = spProductBpropertiesCustoms;
	}

	public SpProductBrands getSpProductBrands() {
		return spProductBrands;
	}

	public void setSpProductBrands(SpProductBrands spProductBrands) {
		this.spProductBrands = spProductBrands;
	}

}
