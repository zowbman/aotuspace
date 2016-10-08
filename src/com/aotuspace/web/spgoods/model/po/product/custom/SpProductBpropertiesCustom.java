package com.aotuspace.web.spgoods.model.po.product.custom;

import com.aotuspace.web.spgoods.model.po.product.SpProductBproperties;
import com.aotuspace.web.spgoods.model.po.product.SpProductPropertyName;
import com.aotuspace.web.spgoods.model.po.product.SpProductPropertyValue;

/**
 * 
 * Title:SpProductBproperties
 * Description:商品属性扩展类
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-12-11 下午3:05:13
 *
 */
public class SpProductBpropertiesCustom extends SpProductBproperties {
	
	private SpProductPropertyName spProductPname;//属性名
	
	private SpProductPropertyValue spProductPvalue;//属性值
	
	

	public SpProductPropertyName getSpProductPname() {
		return spProductPname;
	}

	public void setSpProductPname(SpProductPropertyName spProductPname) {
		this.spProductPname = spProductPname;
	}

	public SpProductPropertyValue getSpProductPvalue() {
		return spProductPvalue;
	}

	public void setSpProductPvalue(SpProductPropertyValue spProductPvalue) {
		this.spProductPvalue = spProductPvalue;
	}

}