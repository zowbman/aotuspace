package com.aotuspace.web.spgoods.mapper.treasure.custom;

import java.util.Collection;

import com.aotuspace.web.spgoods.model.po.treasure.custom.SpAotuerpTreasureProductSkuCustom;

/**
 * 
 * Title:SpAotuauerpTreasureProductSkuCustom
 * Description:����sku��չmapper
 * Company:aotuspace
 * @author    ΰ��
 * @date      2015-12-1 ����11:29:33
 *
 */
public interface SpAotuerpTreasureProductSkuMapperCustom {
	
	/**
	 * ���ݱ���id��ѯ����sku
	 * @param treausreId
	 * @return
	 */
	Collection<SpAotuerpTreasureProductSkuCustom> findTreasureProductSkuByTreasureId(Integer treausreId);
}
