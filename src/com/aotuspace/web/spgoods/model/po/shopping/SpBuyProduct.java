package com.aotuspace.web.spgoods.model.po.shopping;

import com.aotuspace.web.spgoods.model.po.task.custom.SpAotuerpTreasureTaskCustom;
import com.aotuspace.web.spgoods.model.po.treasure.custom.SpAotuerpTreasureProductSkuCustom;

/**
 * 
 * Title:SpBuyProduct
 * Description:�������Ʒ
 * Company:aotuspace
 * @author    ΰ��
 * @date      2015-12-18 ����2:30:10
 *
 */
public class SpBuyProduct {
	/** ���������Ʒ **/
	private SpAotuerpTreasureTaskCustom spTreasureTaskC;
	/** �������� **/
	private int count;

	public SpBuyProduct() {

	}

	public SpBuyProduct(SpAotuerpTreasureTaskCustom spTreasureTaskC) {
		this.spTreasureTaskC = spTreasureTaskC;
	}

	public SpBuyProduct(SpAotuerpTreasureTaskCustom spTreasureTaskC, int count) {
		this.spTreasureTaskC = spTreasureTaskC;
		this.count = count;
	}

	public SpAotuerpTreasureTaskCustom getSpTreasureTaskC() {
		return spTreasureTaskC;
	}

	public void setSpTreasureTaskC(SpAotuerpTreasureTaskCustom spTreasureTaskC) {
		this.spTreasureTaskC = spTreasureTaskC;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public int hashCode() {
		String buyProductId = spTreasureTaskC.hashCode() + "-";
		if (spTreasureTaskC.getSpAotuerpTreasureInfoCustom() != null
				&& spTreasureTaskC.getSpAotuerpTreasureInfoCustom().getSpAotuerpTreasureProductSkuCustoms() != null
				&& spTreasureTaskC.getSpAotuerpTreasureInfoCustom().getSpAotuerpTreasureProductSkuCustoms().size() > 0) {
			buyProductId += spTreasureTaskC.getSpAotuerpTreasureInfoCustom().getSpAotuerpTreasureProductSkuCustoms().iterator().next().getSpId();
		}
		return buyProductId.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SpBuyProduct other = (SpBuyProduct) obj;
		if (spTreasureTaskC == null) {
			if (other.spTreasureTaskC != null)
				return false;
		} else if (!spTreasureTaskC.equals(other.spTreasureTaskC))
			return false;
		//sku�������ȷ���false
		if (spTreasureTaskC.getSpAotuerpTreasureInfoCustom().getSpAotuerpTreasureProductSkuCustoms().size() != other.spTreasureTaskC
				.getSpAotuerpTreasureInfoCustom().getSpAotuerpTreasureProductSkuCustoms().size()) {
			return false;
		}
		if (spTreasureTaskC.getSpAotuerpTreasureInfoCustom().getSpAotuerpTreasureProductSkuCustoms().size() > 0) {
			SpAotuerpTreasureProductSkuCustom spTreasureProductSkuC = spTreasureTaskC.getSpAotuerpTreasureInfoCustom()
					.getSpAotuerpTreasureProductSkuCustoms().iterator().next();
			SpAotuerpTreasureProductSkuCustom otherSpTreasureProductSkuC = other.spTreasureTaskC
					.getSpAotuerpTreasureInfoCustom().getSpAotuerpTreasureProductSkuCustoms().iterator().next();
			//sku���ȷ���false
			if (!spTreasureProductSkuC.equals(otherSpTreasureProductSkuC))
				return false;
		}
		return true;
	}
}
