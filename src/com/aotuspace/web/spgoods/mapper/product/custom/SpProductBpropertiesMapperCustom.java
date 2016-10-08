package com.aotuspace.web.spgoods.mapper.product.custom;

import java.util.List;
import java.util.Map;

import com.aotuspace.web.spgoods.model.po.product.custom.SpProductBpropertiesCustom;
/**
 * 
 * Title:SpProductBpropertiesMapper
 * Description:��Ʒ������չmapper
 * Company:aotuspace
 * @author    ΰ��
 * @date      2015-12-11 ����3:07:57
 *
 */

public interface SpProductBpropertiesMapperCustom {

	/**
	 * ������Ʒid����ѯ��Ʒ����
	 * @param spPdId ��Ʒid
	 * @param spIsSku �Ƿ�sku
	 * @return
	 */
	List<SpProductBpropertiesCustom> findSpProductBproCBySpPdId(Integer spPdId);
	
	/**
	 * ������Ʒsku����ѯ��Ʒ����
	 * @param spSkuId
	 * @return
	 */
	List<SpProductBpropertiesCustom> findSpProductBproCBySpSkuId(Integer spSkuId);
	
	/**
	 * ����sku��ѯkey
	 * @param spSkuId
	 * @return
	 */
	List<SpProductBpropertiesCustom> findSpProductBproCNameBySpSkuId(Integer[] spSkuId);
	
	/**
	 * ����skuid��keyid��ѯvalue
	 * @param map
	 * map['nameId']
	 * map['skuIds']
	 * @return
	 */
	List<SpProductBpropertiesCustom> findSpProductBproCValueBySpSkuIdAndNameId(Map<String, Object> map);
	
}