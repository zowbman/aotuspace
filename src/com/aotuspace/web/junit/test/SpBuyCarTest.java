package com.aotuspace.web.junit.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.aotuspace.web.spgoods.model.po.shopping.SpBuyProduct;
import com.aotuspace.web.spgoods.model.po.task.custom.SpAotuerpTreasureTaskCustom;
import com.aotuspace.web.spgoods.model.po.treasure.custom.SpAotuerpTreasureProductSkuCustom;

public class SpBuyCarTest {
	
	/**
	 * ���Ա��������񣩣�sku(��ʽ)�Ƿ����  ����hascode��equal
	 */
	@Test
	public void test() {
		List<SpBuyProduct> product=new ArrayList<SpBuyProduct>();
		
		//����
		SpAotuerpTreasureTaskCustom spAotuerpTreasureTaskCustom=new SpAotuerpTreasureTaskCustom();
		spAotuerpTreasureTaskCustom.setSpId(1);
		
		//����sku
		SpAotuerpTreasureProductSkuCustom spAotuerpTreasureProductSkuCustom=new SpAotuerpTreasureProductSkuCustom();
		spAotuerpTreasureProductSkuCustom.setSpId(1);
		
		spAotuerpTreasureTaskCustom.getSpAotuerpTreasureInfoCustom().addTreasureProSkuC(spAotuerpTreasureProductSkuCustom);
		
		SpBuyProduct spBuyProduct=new SpBuyProduct();
		spBuyProduct.setCount(1);
		spBuyProduct.setSpTreasureTaskC(spAotuerpTreasureTaskCustom);
		product.add(spBuyProduct);
		
		
		//����
		SpAotuerpTreasureTaskCustom spAotuerpTreasureTaskCustom1=new SpAotuerpTreasureTaskCustom();		
		spAotuerpTreasureTaskCustom1.setSpId(1);
		//����sku
		SpAotuerpTreasureProductSkuCustom spAotuerpTreasureProductSkuCustom1=new SpAotuerpTreasureProductSkuCustom();
		spAotuerpTreasureProductSkuCustom1.setSpId(1);		
		
		spAotuerpTreasureTaskCustom1.getSpAotuerpTreasureInfoCustom().addTreasureProSkuC(spAotuerpTreasureProductSkuCustom1);
		
		SpBuyProduct spBuyProduct1=new SpBuyProduct();
		spBuyProduct1.setCount(1);
		spBuyProduct1.setSpTreasureTaskC(spAotuerpTreasureTaskCustom1);
		
	/*	
		Assert.assertTrue("�����������",spBuyProduct.equals(spBuyProduct1));
		
		System.out.println(spBuyProduct.equals(spBuyProduct1));*/
		
		Assert.assertTrue("�����������",product.contains(spBuyProduct1));
		
	}

}
