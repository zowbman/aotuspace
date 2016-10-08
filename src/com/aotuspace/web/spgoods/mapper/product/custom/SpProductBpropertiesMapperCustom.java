package com.aotuspace.web.spgoods.mapper.product.custom;

import java.util.List;
import java.util.Map;

import com.aotuspace.web.spgoods.model.po.product.custom.SpProductBpropertiesCustom;
/**
 * 
 * Title:SpProductBpropertiesMapper
 * Description:商品属性扩展mapper
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-12-11 下午3:07:57
 *
 */

public interface SpProductBpropertiesMapperCustom {

	/**
	 * 根据商品id，查询商品属性
	 * @param spPdId 商品id
	 * @param spIsSku 是否sku
	 * @return
	 */
	List<SpProductBpropertiesCustom> findSpProductBproCBySpPdId(Integer spPdId);
	
	/**
	 * 根据商品sku，查询商品属性
	 * @param spSkuId
	 * @return
	 */
	List<SpProductBpropertiesCustom> findSpProductBproCBySpSkuId(Integer spSkuId);
	
	/**
	 * 根据sku查询key
	 * @param spSkuId
	 * @return
	 */
	List<SpProductBpropertiesCustom> findSpProductBproCNameBySpSkuId(Integer[] spSkuId);
	
	/**
	 * 根据skuid和keyid查询value
	 * @param map
	 * map['nameId']
	 * map['skuIds']
	 * @return
	 */
	List<SpProductBpropertiesCustom> findSpProductBproCValueBySpSkuIdAndNameId(Map<String, Object> map);
	
}