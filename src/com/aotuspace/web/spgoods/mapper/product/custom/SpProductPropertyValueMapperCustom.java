package com.aotuspace.web.spgoods.mapper.product.custom;

import com.aotuspace.web.spgoods.model.po.product.SpProductPropertyValue;


/**
 * 
 * Title:SpProductPropertyValueMapper
 * Description:����ֵ��չmapper
 * Company:aotuspace
 * @author    ΰ��
 * @date      2015-12-11 ����3:38:27
 *
 */
public interface SpProductPropertyValueMapperCustom {
	
	/**
	 * ����id��ѯ��Ʒ����ֵ
	 * @param spId
	 * @return
	 */
    SpProductPropertyValue findSpProductPvalue(Integer spId);
}