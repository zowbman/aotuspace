package com.aotuspace.web.spgoods.service;

import com.aotuspace.web.spgoods.model.po.treasure.SpAotuerpTreasureImg;


/**
 * 
 * Title:ISpGoodsImgService
 * Description:��ƷͼƬ�ӿ�
 * Company:aotuspace
 * @author    ΰ��
 * @date      2015-12-25 ����7:54:32
 *
 */
public interface ISpGoodsImgService {
	
	/**
	 * ��������ͼ
	 * @param thumbnailImg
	 * @throws Exception
	 */
	void saveGoodsThumbnail(SpAotuerpTreasureImg thumbnailImg)throws Exception;
}
