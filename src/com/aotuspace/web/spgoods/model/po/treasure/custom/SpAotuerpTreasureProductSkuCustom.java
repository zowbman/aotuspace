package com.aotuspace.web.spgoods.model.po.treasure.custom;

import java.util.ArrayList;
import java.util.List;

import com.aotuspace.web.spgoods.model.po.product.custom.SpProductBpropertiesCustom;
import com.aotuspace.web.spgoods.model.po.treasure.SpAotuerpTreasureProductSku;

/**
 * 
 * Title:SpAotuerpTreasureProductSku
 * Description:宝贝sku扩展类
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-12-1 上午11:26:20
 *
 */
public class SpAotuerpTreasureProductSkuCustom extends SpAotuerpTreasureProductSku {
	
	//商品sku属性
	private List<SpProductBpropertiesCustom> spProductBproCSkus;
	
	/**
	 * sku属性值处理
	 * @param spProductBproC
	 * @return
	 */
	public List<String> skuProIds(List<SpProductBpropertiesCustom> spProductBproCSkus){
		if(spProductBproCSkus!=null){
			List<String> skuProId=new ArrayList<String>();
			for (SpProductBpropertiesCustom spProductBpropertiesCustom : spProductBproCSkus) {
				skuProId.add(spProductBpropertiesCustom.getSpPropertynameid()+":"+spProductBpropertiesCustom.getSpPropertyvalueid());
			}
			return skuProId;
		}
		return null;
		
	}
	
	public List<SpProductBpropertiesCustom> getSpProductBproCSkus() {
		return spProductBproCSkus;
	}

	public void setSpProductBproCSkus(List<SpProductBpropertiesCustom> spProductBproCSkus) {
		this.spProductBproCSkus = spProductBproCSkus;
	}
	
}
