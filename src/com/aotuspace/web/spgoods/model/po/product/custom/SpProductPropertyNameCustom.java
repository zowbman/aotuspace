package com.aotuspace.web.spgoods.model.po.product.custom;

import java.util.List;

import com.aotuspace.web.spgoods.model.po.product.SpProductPropertyName;

/**
 * 
 * Title:SpProductPropertyName
 * Description:属性名扩展
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-12-11 下午3:36:59
 *
 */
public class SpProductPropertyNameCustom extends SpProductPropertyName {

	//一个name有一个或多个value
	private List<SpProductBpropertiesCustom> spProductPropertyValues;

	public List<SpProductBpropertiesCustom> getSpProductPropertyValues() {
		return spProductPropertyValues;
	}

	public void setSpProductPropertyValues(List<SpProductBpropertiesCustom> spProductPropertyValues) {
		this.spProductPropertyValues = spProductPropertyValues;
	}

}