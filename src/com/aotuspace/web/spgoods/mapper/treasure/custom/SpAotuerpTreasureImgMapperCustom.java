package com.aotuspace.web.spgoods.mapper.treasure.custom;

import java.util.Collection;

import com.aotuspace.web.spgoods.model.po.treasure.SpAotuerpTreasureImg;


/**
 * 
 * Title:SpAotuerpTreasureImgMapper
 * Description:任务宝贝图片扩展mapper
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-11-30 下午6:08:17
 *
 */
public interface SpAotuerpTreasureImgMapperCustom {
	
	//获取图片
	Collection<SpAotuerpTreasureImg> findTreasureImg();
}