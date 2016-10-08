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
 * Description:������Ϣ��չ��
 * Company:aotuspace
 * @author    ΰ��
 * @date      2015-11-30 ����6:57:57
 *
 */
public class SpAotuerpTreasureInfoCustom extends SpAotuerpTreasureInfo {

	//==================��������
	//ͼƬ��ϵ
	//private Set<SpAotuerpTreasureImgRelationCustom> spAotuerpTreasureImgRelationCustoms;

	//ͼƬ
	private Set<SpAotuerpTreasureImg> spAotuerpTreasureImgs;

	//����״̬
	private SpAotuerpTreasureStatus spAotuerpTreasureStatus;

	//������ƷSku
	private Set<SpAotuerpTreasureProductSkuCustom> spAotuerpTreasureProductSkuCustoms=new HashSet<SpAotuerpTreasureProductSkuCustom>();

	//��Ʒ��Ϣ
	private SpProductBinfoCustom spProductBinfoCustom;

	//===================����

	//������ͼ
	//private SpAotuerpTreasureImg primaryImg;


	//����sku(name)����
	private List<SpProductPropertyNameCustom> spTreasureProNames=new ArrayList<SpProductPropertyNameCustom>();
	
	/**
	 * ���sku��sku����
	 * @param TreasureProSkuC
	 */
	public void addTreasureProSkuC(SpAotuerpTreasureProductSkuCustom TreasureProSkuC){
		if(!this.spAotuerpTreasureProductSkuCustoms.contains(TreasureProSkuC)){
			this.spAotuerpTreasureProductSkuCustoms.add(TreasureProSkuC);
		}
	}
	
	/**
	 * ����sku���
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
	 * ������Ʒ�ܿ��
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
	 * ��ȡ��ͼ
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
	 * ������ʾ�ļ۸�
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
	 * ������Ʒ��������
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
