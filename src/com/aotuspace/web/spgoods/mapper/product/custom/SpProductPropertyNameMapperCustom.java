package com.aotuspace.web.spgoods.mapper.product.custom;

import com.aotuspace.web.spgoods.model.po.product.SpProductPropertyName;


/**
 * 
 * Title:SpProductPropertyNameMapper
 * Description:��������չmapper�ӿ�
 * Company:aotuspace
 * @author    ΰ��
 * @date      2015-12-11 ����3:38:16
 *
 */
public interface SpProductPropertyNameMapperCustom {
	
	/**
	 * ����id��ѯ��Ʒ������		
	 * @param spId
	 * @return
	 */
   SpProductPropertyName findSpProductPnameById(Integer spId);
}