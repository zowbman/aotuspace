package com.aotuspace.web.spgoods.model.po.shopping;


/**
 * 
 * Title:SpFastBuy
 * Description:快速购买
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-12-19 上午10:06:26
 *
 */
public class SpFastBuy {

	private SpBuyProduct product;
	
	//private DeliverWay deliverWay;//送货方式
	
	/**
	 * 计算小计
	 * @return
	 */
	public Float getSubTotalPrice(){
		float total=0;
		//单价*购买数量
		total+=this.product.getSpTreasureTaskC().getSpAotuerpTreasureInfoCustom().getSpAotuerpTreasureProductSkuCustoms().iterator().next().getSpSalesprice()*this.product.getCount();
		return total;
	}
	

	public SpBuyProduct getProduct() {
		return product;
	}

	public void setProduct(SpBuyProduct product) {
		this.product = product;
	}
/*
	public DeliverWay getDeliverWay() {
		return deliverWay;
	}


	public void setDeliverWay(DeliverWay deliverWay) {
		this.deliverWay = deliverWay;
	}
	*/
}
