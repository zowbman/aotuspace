package com.aotuspace.web.spgoods.mapper.product.custom;

import com.aotuspace.web.spgoods.model.po.product.SpProductPropertyValue;


/**
 * 
 * Title:SpProductPropertyValueMapper
 * Description:属性值扩展mapper
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-12-11 下午3:38:27
 *
 */
public interface SpProductPropertyValueMapperCustom {
	
	/**
	 * 根据id查询商品属性值
	 * @param spId
	 * @return
	 */
    SpProductPropertyValue findSpProductPvalue(Integer spId);
}