package com.aotuspace.web.spgoods.mapper.task.custom;

import java.util.List;

import com.aotuspace.web.spgoods.model.po.task.custom.SpAotuerpTreasureTaskCustom;
import com.aotuspace.web.spgoods.model.vo.task.SpAotuerpTreasureTaskQueryVo;

/**
 * 
 * Title:SpAotuerpTreasureTaskMapperCustom
 * Description:��������mapper��չ
 * Company:aotuspace
 * @author    ΰ��
 * @date      2015-11-30 ����6:45:49
 *
 */
public interface SpAotuerpTreasureTaskMapperCustom {
	
	/**
	 * ��ѯ���񱦱�����������״̬��ѯ
	 * @param spStatusId
	 * 1�� δ���� 2�������� 3���ѽ���
	 * @return
	 * @throws Exception
	 */
	List<SpAotuerpTreasureTaskCustom> findSpAotuerpTreasureTaskBySpStatusId(Integer spStatusId) throws Exception;
	
	/**
	 * ��ѯ���񱦱�����������id������״̬��ѯ
	 * @param spTreaTaskV
	 * @param spId ����id
	 * @param spStatusId ״̬id
	 * @return
	 * @throws Exception
	 */
	SpAotuerpTreasureTaskCustom findSpAotuerpTreasureTaskBySpIdAndSpStatusId(SpAotuerpTreasureTaskQueryVo spTreaTaskV)throws Exception;
	
	
	/**
	 * ��ѯ���񱦱������ݱ���id�ʹ�����id������״̬��ѯ
	 * @param spTreaTaskV
	 * @param spId ����id
	 * @param anId ������id
	 * @param spStatusId ״̬id
	 * @return
	 * @throws Exception
	 */
	SpAotuerpTreasureTaskCustom findSpAotuerpTreasureTaskByAnIdAndSpStatusId(SpAotuerpTreasureTaskQueryVo spTreaTaskV)throws Exception;


	/**
	 * ��ѯ���񱦱������ݱ���id�ʹ�����id������״̬��ѯ
	 * @param spTreaTaskV
	 * @param spId ����id
	 * @param anId ������id
	 * @param spStatusId ״̬id
	 * @return
	 * @throws Exception
	 */
	SpAotuerpTreasureTaskCustom findSpAotuerpTreasureTaskSkuJsonByAnIdAndSpStatusId(SpAotuerpTreasureTaskQueryVo spTreaTaskV)throws Exception;
	
}
