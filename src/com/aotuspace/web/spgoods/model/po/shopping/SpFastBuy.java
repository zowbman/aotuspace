package com.aotuspace.web.spgoods.model.po.shopping;


/**
 * 
 * Title:SpFastBuy
 * Description:���ٹ���
 * Company:aotuspace
 * @author    ΰ��
 * @date      2015-12-19 ����10:06:26
 *
 */
public class SpFastBuy {

	private SpBuyProduct product;
	
	//private DeliverWay deliverWay;//�ͻ���ʽ
	
	/**
	 * ����С��
	 * @return
	 */
	public Float getSubTotalPrice(){
		float total=0;
		//����*��������
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
