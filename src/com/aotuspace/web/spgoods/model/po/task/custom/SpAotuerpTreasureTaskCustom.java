package com.aotuspace.web.spgoods.model.po.task.custom;

import java.util.Set;

import com.aotuspace.web.spgoods.model.po.task.SpAotuerpTreasureTask;
import com.aotuspace.web.spgoods.model.po.task.SpAotuerpTreasureTaskMode;
import com.aotuspace.web.spgoods.model.po.task.SpAotuerpTreasureTaskStatus;
import com.aotuspace.web.spgoods.model.po.treasure.custom.SpAotuerpTreasureInfoCustom;
import com.aotuspace.web.spgoods.model.po.treasure.custom.SpAotuerpTreasureProductSkuCustom;
import com.aotuspace.web.spuser.model.po.user.custom.SpAnchorBinfoCustom;

/**
 * 
 * Title:SpAotuerpTreasureTaskCustom
 * Description:宝贝任务扩展
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-11-30 下午6:44:06
 *
 */
public class SpAotuerpTreasureTaskCustom extends SpAotuerpTreasureTask {
	//任务利润级（一对多）
	Set<SpAotuerpTreasureTaskLevelCustom> spAotuerpTreasureTaskLevelCustoms;
	//任务模式(一对一)
	SpAotuerpTreasureTaskMode spAotuerpTreasureTaskMode;
	//任务状态(一对一)
	SpAotuerpTreasureTaskStatus spAotuerpTreasureTaskStatus;
	//宝贝（一对一）
	SpAotuerpTreasureInfoCustom spAotuerpTreasureInfoCustom = new SpAotuerpTreasureInfoCustom();

	//宝贝Sku
	Set<SpAotuerpTreasureProductSkuCustom> spAotuerpTreasureProductSkuCustoms;

	//代言主播信息
	SpAnchorBinfoCustom spAnchorBinfoCustom;
	
	//=====================非级联关系=============================
	

	public Set<SpAotuerpTreasureTaskLevelCustom> getSpAotuerpTreasureTaskLevelCustoms() {
		return spAotuerpTreasureTaskLevelCustoms;
	}

	public void setSpAotuerpTreasureTaskLevelCustoms(
			Set<SpAotuerpTreasureTaskLevelCustom> spAotuerpTreasureTaskLevelCustoms) {
		this.spAotuerpTreasureTaskLevelCustoms = spAotuerpTreasureTaskLevelCustoms;
	}

	public SpAotuerpTreasureTaskMode getSpAotuerpTreasureTaskMode() {
		return spAotuerpTreasureTaskMode;
	}

	public void setSpAotuerpTreasureTaskMode(SpAotuerpTreasureTaskMode spAotuerpTreasureTaskMode) {
		this.spAotuerpTreasureTaskMode = spAotuerpTreasureTaskMode;
	}

	public SpAotuerpTreasureTaskStatus getSpAotuerpTreasureTaskStatus() {
		return spAotuerpTreasureTaskStatus;
	}

	public void setSpAotuerpTreasureTaskStatus(SpAotuerpTreasureTaskStatus spAotuerpTreasureTaskStatus) {
		this.spAotuerpTreasureTaskStatus = spAotuerpTreasureTaskStatus;
	}

	public SpAotuerpTreasureInfoCustom getSpAotuerpTreasureInfoCustom() {
		return spAotuerpTreasureInfoCustom;
	}

	public void setSpAotuerpTreasureInfoCustom(SpAotuerpTreasureInfoCustom spAotuerpTreasureInfoCustom) {
		this.spAotuerpTreasureInfoCustom = spAotuerpTreasureInfoCustom;
	}

	public Set<SpAotuerpTreasureProductSkuCustom> getSpAotuerpTreasureProductSkuCustoms() {
		return spAotuerpTreasureProductSkuCustoms;
	}

	public void setSpAotuerpTreasureProductSkuCustoms(
			Set<SpAotuerpTreasureProductSkuCustom> spAotuerpTreasureProductSkuCustoms) {
		this.spAotuerpTreasureProductSkuCustoms = spAotuerpTreasureProductSkuCustoms;
	}

	public SpAnchorBinfoCustom getSpAnchorBinfoCustom() {
		return spAnchorBinfoCustom;
	}

	public void setSpAnchorBinfoCustom(SpAnchorBinfoCustom spAnchorBinfoCustom) {
		this.spAnchorBinfoCustom = spAnchorBinfoCustom;
	}
}
