package com.aotuspace.web.spgoods.model.vo.task;

import com.aotuspace.web.spgoods.model.po.task.custom.SpAotuerpTreasureTaskCustom;

/**
 * 
 * Title:SpAotuerpTreasureTaskQueryVo
 * Description:���񱦱���װ��
 * Company:autospace
 * @author    zwb
 * @date      2015��12��10�� ����11:23:12
 *
 */
public class SpAotuerpTreasureTaskQueryVo {
	
	//���񱦱���չ��
	private SpAotuerpTreasureTaskCustom spTreaTaskC=new SpAotuerpTreasureTaskCustom();
	
	//============ ��������
	private String[] skuProId;
	
	private Integer buyCount;
	
	public Integer getBuyCount() {
		return buyCount;
	}

	public void setBuyCount(Integer buyCount) {
		this.buyCount = buyCount;
	}

	public String[] getSkuProId() {
		return skuProId;
	}

	public void setSkuProId(String[] skuProId) {
		this.skuProId = skuProId;
	}

	public SpAotuerpTreasureTaskCustom getSpTreaTaskC() {
		return spTreaTaskC;
	}

	public void setSpTreaTaskC(SpAotuerpTreasureTaskCustom spTreaTaskC) {
		this.spTreaTaskC = spTreaTaskC;
	}
	
	
}
