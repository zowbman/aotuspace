package com.aotuspace.web.spgoods.model.po.product.custom;

import com.aotuspace.web.spgoods.model.po.product.SpProductBproperties;
import com.aotuspace.web.spgoods.model.po.product.SpProductPropertyName;
import com.aotuspace.web.spgoods.model.po.product.SpProductPropertyValue;

/**
 * 
 * Title:SpProductBproperties
 * Description:��Ʒ������չ��
 * Company:aotuspace
 * @author    ΰ��
 * @date      2015-12-11 ����3:05:13
 *
 */
public class SpProductBpropertiesCustom extends SpProductBproperties {
	
	private SpProductPropertyName spProductPname;//������
	
	private SpProductPropertyValue spProductPvalue;//����ֵ
	
	

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