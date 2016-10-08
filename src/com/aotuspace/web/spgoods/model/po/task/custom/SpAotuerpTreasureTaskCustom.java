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
 * Description:����������չ
 * Company:aotuspace
 * @author    ΰ��
 * @date      2015-11-30 ����6:44:06
 *
 */
public class SpAotuerpTreasureTaskCustom extends SpAotuerpTreasureTask {
	//�������󼶣�һ�Զࣩ
	Set<SpAotuerpTreasureTaskLevelCustom> spAotuerpTreasureTaskLevelCustoms;
	//����ģʽ(һ��һ)
	SpAotuerpTreasureTaskMode spAotuerpTreasureTaskMode;
	//����״̬(һ��һ)
	SpAotuerpTreasureTaskStatus spAotuerpTreasureTaskStatus;
	//������һ��һ��
	SpAotuerpTreasureInfoCustom spAotuerpTreasureInfoCustom = new SpAotuerpTreasureInfoCustom();

	//����Sku
	Set<SpAotuerpTreasureProductSkuCustom> spAotuerpTreasureProductSkuCustoms;

	//����������Ϣ
	SpAnchorBinfoCustom spAnchorBinfoCustom;
	
	//=====================�Ǽ�����ϵ=============================
	

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
