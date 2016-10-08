package com.aotuspace.web.spgoods.model.po.shopping;

import java.util.ArrayList;
import java.util.List;



/**
 * 
 * Title:SpBuyCar
 * Description:���ﳵ
 * Company:aotuspace
 * @author    ΰ��
 * @date      2015-12-18 ����2:25:54
 *
 */
public class SpBuyCar {
	
	private List<SpBuyProduct> products=new ArrayList<SpBuyProduct>();

	/**
	 *  ��ӹ�����
	 * @param product
	 */
	public void addProduct(SpBuyProduct product){
		if(!products.contains(product)){
			products.add(product);
		}else{//������ڸù�������ۼ��乺������
			for (SpBuyProduct p : products) {
				if(p.equals(product)){
					p.setCount(p.getCount()+product.getCount());
					break;
				}
			}
		}
	}
	
	/**
	 * ������й�����
	 */
	public void removeAll(){
		products.clear();
	}
	
	/**
	 * ɾ��������
	 * @param product
	 */
	public boolean removeBuyProduct(SpBuyProduct product){
		if(products.contains(product)){
			products.remove(product);
			return true;
		}
		return false;
	}
	
	/**
	 * ���¹�������
	 * @param product
	 */
	public void updateCount(SpBuyProduct product){
		for (SpBuyProduct p : products) {
			if(p.equals(product)){
				p.setCount(product.getCount());
				break;
			}
		}
	}
	
	/**
	 * �������¹�������
	 * @param product
	 */
	public void updateCount(SpBuyProduct[] products){
		for (SpBuyProduct p : this.products) {
			for (SpBuyProduct p1 : products) {
				if(p.equals(p1)){
					p.setCount(p1.getCount());
					break;
				}
			}
		}
	}
	
	/**
	 * �����ܽ��
	 * @return
	 */
	public Float getTolTalPrice(){
		float total=0;
		for (SpBuyProduct p : products) {
			//����*��������
			total+=p.getSpTreasureTaskC().getSpAotuerpTreasureInfoCustom().getSpAotuerpTreasureProductSkuCustoms().iterator().next().getSpSalesprice()*p.getCount();
		}
		return total;
	}
	
	
	
	
	public List<SpBuyProduct> getProducts() {
		return products;
	}
	
	

}
