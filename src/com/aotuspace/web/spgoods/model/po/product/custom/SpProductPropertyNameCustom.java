package com.aotuspace.web.spgoods.model.po.product.custom;

import java.util.List;

import com.aotuspace.web.spgoods.model.po.product.SpProductPropertyName;

/**
 * 
 * Title:SpProductPropertyName
 * Description:��������չ
 * Company:aotuspace
 * @author    ΰ��
 * @date      2015-12-11 ����3:36:59
 *
 */
public class SpProductPropertyNameCustom extends SpProductPropertyName {

	//һ��name��һ������value
	private List<SpProductBpropertiesCustom> spProductPropertyValues;

	public List<SpProductBpropertiesCustom> getSpProductPropertyValues() {
		return spProductPropertyValues;
	}

	public void setSpProductPropertyValues(List<SpProductBpropertiesCustom> spProductPropertyValues) {
		this.spProductPropertyValues = spProductPropertyValues;
	}

}