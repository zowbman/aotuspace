package com.aotuspace.web.spgoods.model.po.treasure.custom;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.aotuspace.web.spgoods.model.po.product.custom.SpProductBinfoCustom;
import com.aotuspace.web.spgoods.model.po.product.custom.SpProductPropertyNameCustom;
import com.aotuspace.web.spgoods.model.po.treasure.SpAotuerpTreasureImg;
import com.aotuspace.web.spgoods.model.po.treasure.SpAotuerpTreasureInfo;
import com.aotuspace.web.spgoods.model.po.treasure.SpAotuerpTreasureStatus;

/**
 * 
 * Title:SpAotuerpTreasureInfoCustom
 * Description:宝贝信息扩展类
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-11-30 下午6:57:57
 *
 */
public class SpAotuerpTreasureInfoCustom extends SpAotuerpTreasureInfo {

	//==================关联对象
	//图片关系
	//private Set<SpAotuerpTreasureImgRelationCustom> spAotuerpTreasureImgRelationCustoms;

	//图片
	private Set<SpAotuerpTreasureImg> spAotuerpTreasureImgs;

	//宝贝状态
	private SpAotuerpTreasureStatus spAotuerpTreasureStatus;

	//宝贝商品Sku
	private Set<SpAotuerpTreasureProductSkuCustom> spAotuerpTreasureProductSkuCustoms=new HashSet<SpAotuerpTreasureProductSkuCustom>();

	//商品信息
	private SpProductBinfoCustom spProductBinfoCustom;

	//===================附加

	//宝贝主图
	//private SpAotuerpTreasureImg primaryImg;


	//宝贝sku(name)出发
	private List<SpProductPropertyNameCustom> spTreasureProNames=new ArrayList<SpProductPropertyNameCustom>();
	
	/**
	 * 添加sku到sku集合
	 * @param TreasureProSkuC
	 */
	public void addTreasureProSkuC(SpAotuerpTreasureProductSkuCustom TreasureProSkuC){
		if(!this.spAotuerpTreasureProductSkuCustoms.contains(TreasureProSkuC)){
			this.spAotuerpTreasureProductSkuCustoms.add(TreasureProSkuC);
		}
	}
	
	/**
	 * 查找sku库存
	 * @param TreasureProSkuC
	 * @return
	 */
	public Integer findStockBySku(SpAotuerpTreasureProductSkuCustom TreasureProSkuC){
		for (SpAotuerpTreasureProductSkuCustom spaotuerpTSC : this.spAotuerpTreasureProductSkuCustoms) {
			if(spaotuerpTSC.equals(TreasureProSkuC)){
				return spaotuerpTSC.getSpSalesorderquantity();
			}
		}
		return null;
	}
	
	/**
	 * 任务商品总库存
	 * @return
	 */
	public Integer findSumStock(){
		Integer rgoodsSum=0;
		for (SpAotuerpTreasureProductSkuCustom spAotuerpTreasureProductSkuCustom : this.spAotuerpTreasureProductSkuCustoms) {
			rgoodsSum+=spAotuerpTreasureProductSkuCustom.getSpSalesorderquantity();
		}
		return rgoodsSum;
	}
	
	/**
	 * 获取首图
	 * @return
	 */
	public SpAotuerpTreasureImg getTreasurePrimaryImg(){
		for (SpAotuerpTreasureImg treasureImg : this.spAotuerpTreasureImgs) {
			if(treasureImg.getSpIsprimary()==1){
				return treasureImg;
			}
		}
		return null;
	}
	/**
	 * 宝贝显示的价格
	 * @return
	 */
	public Long getGoodsShowPrice(){
		long minPrice = 0;
		boolean flag = true;
		for (SpAotuerpTreasureProductSkuCustom spAotuerpTreasureProductSkuCustom : this.spAotuerpTreasureProductSkuCustoms) {
			if (flag) {
				minPrice = spAotuerpTreasureProductSkuCustom.getSpSalesprice();
				flag = false;
				continue;
			}
			minPrice = (minPrice < spAotuerpTreasureProductSkuCustom.getSpSalesprice()) ? spAotuerpTreasureProductSkuCustom
					.getSpSalesprice() : minPrice;
		}
		return minPrice;
	}
	
	
	/**
	 * 宝贝商品代言总数
	 * @return
	 */
	public Integer getRgoodsSum(){
		Integer rgoodsSum=0;
		for (SpAotuerpTreasureProductSkuCustom spAotuerpTreasureProductSkuCustom : this.spAotuerpTreasureProductSkuCustoms) {
			rgoodsSum+=spAotuerpTreasureProductSkuCustom.getSpSalesorderquantity();
		}
		return rgoodsSum;
	}
	
	

	public SpAotuerpTreasureStatus getSpAotuerpTreasureStatus() {
		return spAotuerpTreasureStatus;
	}

	public void setSpAotuerpTreasureStatus(SpAotuerpTreasureStatus spAotuerpTreasureStatus) {
		this.spAotuerpTreasureStatus = spAotuerpTreasureStatus;
	}

	public Set<SpAotuerpTreasureProductSkuCustom> getSpAotuerpTreasureProductSkuCustoms() {
		return spAotuerpTreasureProductSkuCustoms;
	}

	public void setSpAotuerpTreasureProductSkuCustoms(
			Set<SpAotuerpTreasureProductSkuCustom> spAotuerpTreasureProductSkuCustoms) {
		this.spAotuerpTreasureProductSkuCustoms = spAotuerpTreasureProductSkuCustoms;
	}

	public Set<SpAotuerpTreasureImg> getSpAotuerpTreasureImgs() {
		return spAotuerpTreasureImgs;
	}

	public void setSpAotuerpTreasureImgs(Set<SpAotuerpTreasureImg> spAotuerpTreasureImgs) {
		this.spAotuerpTreasureImgs = spAotuerpTreasureImgs;
	}

	/*public Integer getRgoodsSum() {
		return rgoodsSum;
	}

	public void setRgoodsSum(Integer rgoodsSum) {
		this.rgoodsSum = rgoodsSum;
	}*/

	public SpProductBinfoCustom getSpProductBinfoCustom() {
		return spProductBinfoCustom;
	}

	public void setSpProductBinfoCustom(SpProductBinfoCustom spProductBinfoCustom) {
		this.spProductBinfoCustom = spProductBinfoCustom;
	}

	public List<SpProductPropertyNameCustom> getSpTreasureProNames() {
		return spTreasureProNames;
	}

	public void setSpTreasureProNames(List<SpProductPropertyNameCustom> spTreasureProNames) {
		this.spTreasureProNames = spTreasureProNames;
	}

}
