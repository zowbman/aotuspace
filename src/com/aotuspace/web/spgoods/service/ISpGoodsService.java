package com.aotuspace.web.spgoods.service;

import java.util.List;
import java.util.Map;

import com.aotuspace.web.spgoods.model.po.task.SpAotuerpTreasureTask;
import com.aotuspace.web.spgoods.model.po.task.custom.SpAotuerpTreasureTaskCustom;
import com.aotuspace.web.spgoods.model.vo.task.SpAotuerpTreasureTaskQueryVo;

public interface ISpGoodsService {
	
	/**
	 * ���������б�ȫ����Ʒ����Ҫ����
	 * ���ݱ�������״̬��ѯ����
	 * @param spStatusId
	 * @return
	 * @throws Exception
	 */
	public List<SpAotuerpTreasureTaskCustom> findTreasureTaskListByspStatusId(Integer spStatusId) throws Exception;
	
	/**
	 * ��Ҫ����ϸҳ
	 * ���ݱ�������id��״̬��ѯ
	 * @param spId ��������id
	 * @param spStatusId ��������״̬
	 * @return
	 * @throws Exception
	 */
	public SpAotuerpTreasureTaskCustom findTreasureTaskDetailBySpIdAndSpStatus(SpAotuerpTreasureTaskQueryVo spTreaTaskV)throws Exception;
	
	/**
	 * ���ݱ�������id��ѯ
	 * @param spId ��������id
	 * @return
	 */
	public SpAotuerpTreasureTask findTreasureTaskBySpId(Integer spId)throws Exception;
	
	/**
	 * ��ʼ����
	 * @param treasureTask ���ı���������Ϣ
	 * @return
	 * @throws Exception
	 */
	public boolean updateTreasureTaskForBegin(SpAotuerpTreasureTask treasureTask)throws Exception;
	
	
	/**
	 * ��Ʒ��ϸҳ
	 * @param spTreaTaskV
	 * @return
	 * @throws Exception
	 */
	public SpAotuerpTreasureTaskCustom findTreasureDetailByAnIdAndSpIdAndSpStatus(SpAotuerpTreasureTaskQueryVo spTreaTaskV)throws Exception;

	/**
	 * ��Ʒ��ϸҳ��sku��Ϣ��json����
	 * sku���ԣ��۸�����
	 * @param spTreaTaskV
	 * @throws Exception
	 */
	public Map<String, Map<String, Long>> findTreasureDetailSkuJsonByAnIdAndSpIdAndSpStatus(SpAotuerpTreasureTaskQueryVo spTreaTaskV)throws Exception;
	
	
	/**
	 * ����������Ʒ��ѯ��Ʒ��ϸ
	 * @param spTreaTaskV
	 * @return
	 * @throws Exception
	 */
	public SpAotuerpTreasureTaskCustom findBuyTreasureDetailBySpIdAndSpStatus(SpAotuerpTreasureTaskQueryVo spTreaTaskV)throws Exception;
	
	/**
	 * ����skuString���ԺͲ�Ʒid��ѯskuid
	 * @param skuProp
	 * @param pdId
	 * @return
	 * @throws Exception
	 */
	public Integer findSkuIdBySkuPropAndPdId(String skuProp,Integer pdId)throws Exception;
	
	/**
	 * ����skuid��treasureid��ѯtreasureSKUid 
	 * @param skuId skuid
	 * @param treasureId treasure id
	 * @return
	 * @throws Exception
	 */
	public Integer findTreasureSkuIdBySkuIdAndTreasureId(Integer skuId,Integer treasureId)throws Exception;
	
	
	
}
