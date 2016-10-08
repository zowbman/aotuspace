package com.aotuspace.web.spgoods.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.aotuspace.web.spgoods.mapper.treasure.SpAotuerpTreasureImgMapper;
import com.aotuspace.web.spgoods.model.po.treasure.SpAotuerpTreasureImg;
import com.aotuspace.web.spgoods.service.ISpGoodsImgService;

/**
 * 
 * Title:SpGoodsImgServiceImpl
 * Description:��ƷͼƬʵ����
 * Company:aotuspace
 * @author    ΰ��
 * @date      2015-12-25 ����7:54:56
 *
 */
public class SpGoodsImgServiceImpl implements ISpGoodsImgService {

	@Autowired
	SpAotuerpTreasureImgMapper spAotuerpTreasureImgMapper;
	
	@Override
	public void saveGoodsThumbnail(SpAotuerpTreasureImg thumbnailImg) throws Exception {
		spAotuerpTreasureImgMapper.insertSelective(thumbnailImg);
	}
}
