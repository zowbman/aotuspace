package com.aotuspace.web.spgoods.mapper.treasure.custom;

import java.util.Collection;

import com.aotuspace.web.spgoods.model.po.treasure.custom.SpAotuerpTreasureProductSkuCustom;

/**
 * 
 * Title:SpAotuauerpTreasureProductSkuCustom
 * Description:±¦±´skuÀ©Õ¹mapper
 * Company:aotuspace
 * @author    Î°±¦
 * @date      2015-12-1 ÉÏÎç11:29:33
 *
 */
public interface SpAotuerpTreasureProductSkuMapperCustom {
	
	/**
	 * ¸ù¾Ý±¦±´id²éÑ¯±¦±´sku
	 * @param treausreId
	 * @return
	 */
	Collection<SpAotuerpTreasureProductSkuCustom> findTreasureProductSkuByTreasureId(Integer treausreId);
}
