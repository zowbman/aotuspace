package com.aotuspace.web.spgoods.model.vo.task;

import com.aotuspace.web.spgoods.model.po.task.custom.SpAotuerpTreasureTaskCustom;

/**
 * 
 * Title:SpAotuerpTreasureTaskQueryVo
 * Description:任务宝贝包装类
 * Company:autospace
 * @author    zwb
 * @date      2015年12月10日 下午11:23:12
 *
 */
public class SpAotuerpTreasureTaskQueryVo {
	
	//任务宝贝扩展类
	private SpAotuerpTreasureTaskCustom spTreaTaskC=new SpAotuerpTreasureTaskCustom();
	
	//============ 立即购买
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
