package com.aotuspace.web.spgoods.model.po.treasure.custom;

import java.util.Set;

import com.aotuspace.web.spgoods.model.po.treasure.SpAotuerpTreasureImg;
import com.aotuspace.web.spgoods.model.po.treasure.SpAotuerpTreasureImgRelation;

/**
 * 
 * Title:SpAotuerpTreasureImgRelationCustom
 * Description:����ͼƬ��ϵ��չ��
 * Company:aotuspace
 * @author    ΰ��
 * @date      2015-12-1 ����10:10:52
 *
 */
public class SpAotuerpTreasureImgRelationCustom extends SpAotuerpTreasureImgRelation {
	
	//ͼƬ��Ϣ
	Set<SpAotuerpTreasureImg> spAotuerpTreasureImgs;

	public Set<SpAotuerpTreasureImg> getSpAotuerpTreasureImgs() {
		return spAotuerpTreasureImgs;
	}

	public void setSpAotuerpTreasureImgs(Set<SpAotuerpTreasureImg> spAotuerpTreasureImgs) {
		this.spAotuerpTreasureImgs = spAotuerpTreasureImgs;
	}

}
