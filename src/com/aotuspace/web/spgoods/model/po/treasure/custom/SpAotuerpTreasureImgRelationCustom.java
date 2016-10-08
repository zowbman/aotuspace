package com.aotuspace.web.spgoods.model.po.treasure.custom;

import java.util.Set;

import com.aotuspace.web.spgoods.model.po.treasure.SpAotuerpTreasureImg;
import com.aotuspace.web.spgoods.model.po.treasure.SpAotuerpTreasureImgRelation;

/**
 * 
 * Title:SpAotuerpTreasureImgRelationCustom
 * Description:宝贝图片关系扩展类
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-12-1 上午10:10:52
 *
 */
public class SpAotuerpTreasureImgRelationCustom extends SpAotuerpTreasureImgRelation {
	
	//图片信息
	Set<SpAotuerpTreasureImg> spAotuerpTreasureImgs;

	public Set<SpAotuerpTreasureImg> getSpAotuerpTreasureImgs() {
		return spAotuerpTreasureImgs;
	}

	public void setSpAotuerpTreasureImgs(Set<SpAotuerpTreasureImg> spAotuerpTreasureImgs) {
		this.spAotuerpTreasureImgs = spAotuerpTreasureImgs;
	}

}
