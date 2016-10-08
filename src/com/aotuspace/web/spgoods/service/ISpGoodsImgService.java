package com.aotuspace.web.spgoods.service;

import com.aotuspace.web.spgoods.model.po.treasure.SpAotuerpTreasureImg;


/**
 * 
 * Title:ISpGoodsImgService
 * Description:商品图片接口
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-12-25 下午7:54:32
 *
 */
public interface ISpGoodsImgService {
	
	/**
	 * 保存缩略图
	 * @param thumbnailImg
	 * @throws Exception
	 */
	void saveGoodsThumbnail(SpAotuerpTreasureImg thumbnailImg)throws Exception;
}
