package com.aotuspace.web.spgoods.model.po.shopping;

import java.util.ArrayList;
import java.util.List;



/**
 * 
 * Title:SpBuyCar
 * Description:购物车
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-12-18 下午2:25:54
 *
 */
public class SpBuyCar {
	
	private List<SpBuyProduct> products=new ArrayList<SpBuyProduct>();

	/**
	 *  添加购物项
	 * @param product
	 */
	public void addProduct(SpBuyProduct product){
		if(!products.contains(product)){
			products.add(product);
		}else{//如果存在该购物项，就累加其购买数量
			for (SpBuyProduct p : products) {
				if(p.equals(product)){
					p.setCount(p.getCount()+product.getCount());
					break;
				}
			}
		}
	}
	
	/**
	 * 清除所有购物项
	 */
	public void removeAll(){
		products.clear();
	}
	
	/**
	 * 删除购物项
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
	 * 更新购买数量
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
	 * 批量更新购买数量
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
	 * 计算总金额
	 * @return
	 */
	public Float getTolTalPrice(){
		float total=0;
		for (SpBuyProduct p : products) {
			//单价*购买数量
			total+=p.getSpTreasureTaskC().getSpAotuerpTreasureInfoCustom().getSpAotuerpTreasureProductSkuCustoms().iterator().next().getSpSalesprice()*p.getCount();
		}
		return total;
	}
	
	
	
	
	public List<SpBuyProduct> getProducts() {
		return products;
	}
	
	

}
