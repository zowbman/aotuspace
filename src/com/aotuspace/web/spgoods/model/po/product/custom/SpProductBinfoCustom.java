package com.aotuspace.web.spgoods.model.po.product.custom;

import java.util.HashSet;
import java.util.Set;

import com.aotuspace.web.spgoods.model.po.product.SpProductBinfo;
import com.aotuspace.web.spgoods.model.po.product.SpProductBrands;

/**
 * 
 * Title:SpProductBinfoCustom
 * Description:商品扩展类
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-12-1 下午3:06:17
 *
 */
public class SpProductBinfoCustom extends SpProductBinfo {
	//品牌
	private SpProductBrands spProductBrands;

	//商品属性
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
