package com.aotuspace.web.spgoods.mapper.product.custom;

import com.aotuspace.web.spgoods.model.po.product.SpProductPropertyName;


/**
 * 
 * Title:SpProductPropertyNameMapper
 * Description:属性名扩展mapper接口
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-12-11 下午3:38:16
 *
 */
public interface SpProductPropertyNameMapperCustom {
	
	/**
	 * 根据id查询商品属性名		
	 * @param spId
	 * @return
	 */
   SpProductPropertyName findSpProductPnameById(Integer spId);
}