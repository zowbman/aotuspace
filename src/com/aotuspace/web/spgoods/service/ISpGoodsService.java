package com.aotuspace.web.spgoods.service;

import java.util.List;
import java.util.Map;

import com.aotuspace.web.spgoods.model.po.task.SpAotuerpTreasureTask;
import com.aotuspace.web.spgoods.model.po.task.custom.SpAotuerpTreasureTaskCustom;
import com.aotuspace.web.spgoods.model.vo.task.SpAotuerpTreasureTaskQueryVo;

public interface ISpGoodsService {
	
	/**
	 * 宝贝任务列表（全部商品、我要代）
	 * 根据宝贝任务状态查询宝贝
	 * @param spStatusId
	 * @return
	 * @throws Exception
	 */
	public List<SpAotuerpTreasureTaskCustom> findTreasureTaskListByspStatusId(Integer spStatusId) throws Exception;
	
	/**
	 * 我要代详细页
	 * 根据宝贝任务id和状态查询
	 * @param spId 宝贝任务id
	 * @param spStatusId 宝贝任务状态
	 * @return
	 * @throws Exception
	 */
	public SpAotuerpTreasureTaskCustom findTreasureTaskDetailBySpIdAndSpStatus(SpAotuerpTreasureTaskQueryVo spTreaTaskV)throws Exception;
	
	/**
	 * 根据宝贝任务id查询
	 * @param spId 宝贝任务id
	 * @return
	 */
	public SpAotuerpTreasureTask findTreasureTaskBySpId(Integer spId)throws Exception;
	
	/**
	 * 开始任务
	 * @param treasureTask 更改宝贝任务信息
	 * @return
	 * @throws Exception
	 */
	public boolean updateTreasureTaskForBegin(SpAotuerpTreasureTask treasureTask)throws Exception;
	
	
	/**
	 * 商品详细页
	 * @param spTreaTaskV
	 * @return
	 * @throws Exception
	 */
	public SpAotuerpTreasureTaskCustom findTreasureDetailByAnIdAndSpIdAndSpStatus(SpAotuerpTreasureTaskQueryVo spTreaTaskV)throws Exception;

	/**
	 * 商品详细页（sku信息（json））
	 * sku属性，价格，数量
	 * @param spTreaTaskV
	 * @throws Exception
	 */
	public Map<String, Map<String, Long>> findTreasureDetailSkuJsonByAnIdAndSpIdAndSpStatus(SpAotuerpTreasureTaskQueryVo spTreaTaskV)throws Exception;
	
	
	/**
	 * 立即购买商品查询商品详细
	 * @param spTreaTaskV
	 * @return
	 * @throws Exception
	 */
	public SpAotuerpTreasureTaskCustom findBuyTreasureDetailBySpIdAndSpStatus(SpAotuerpTreasureTaskQueryVo spTreaTaskV)throws Exception;
	
	/**
	 * 根据skuString属性和产品id查询skuid
	 * @param skuProp
	 * @param pdId
	 * @return
	 * @throws Exception
	 */
	public Integer findSkuIdBySkuPropAndPdId(String skuProp,Integer pdId)throws Exception;
	
	/**
	 * 根据skuid和treasureid查询treasureSKUid 
	 * @param skuId skuid
	 * @param treasureId treasure id
	 * @return
	 * @throws Exception
	 */
	public Integer findTreasureSkuIdBySkuIdAndTreasureId(Integer skuId,Integer treasureId)throws Exception;
	
	
	
}
