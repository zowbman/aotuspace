package com.aotuspace.web.spgoods.mapper.treasure.custom;

import java.util.Collection;

import com.aotuspace.web.spgoods.model.po.treasure.custom.SpAotuerpTreasureImgRelationCustom;

/**
 * 
 * Title:SpAotuerpTreasureImgRelationMapperCustom
 * Description:����ͼƬ��ϵ��չmapper
 * Company:aotuspace
 * @author    ΰ��
 * @date      2015-12-1 ����10:23:42
 *
 */
public interface SpAotuerpTreasureImgRelationMapperCustom {
	Collection<SpAotuerpTreasureImgRelationCustom> findImgsByTreasureId();
}
