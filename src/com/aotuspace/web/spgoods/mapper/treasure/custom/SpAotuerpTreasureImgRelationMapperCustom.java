package com.aotuspace.web.spgoods.mapper.treasure.custom;

import java.util.Collection;

import com.aotuspace.web.spgoods.model.po.treasure.custom.SpAotuerpTreasureImgRelationCustom;

/**
 * 
 * Title:SpAotuerpTreasureImgRelationMapperCustom
 * Description:±¦±´Í¼Æ¬¹ØÏµÀ©Õ¹mapper
 * Company:aotuspace
 * @author    Î°±¦
 * @date      2015-12-1 ÉÏÎç10:23:42
 *
 */
public interface SpAotuerpTreasureImgRelationMapperCustom {
	Collection<SpAotuerpTreasureImgRelationCustom> findImgsByTreasureId();
}
