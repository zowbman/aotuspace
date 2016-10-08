package com.aotuspace.web.spgoods.mapper.task.custom;

import java.util.List;

import com.aotuspace.web.spgoods.model.po.task.custom.SpAotuerpTreasureTaskCustom;
import com.aotuspace.web.spgoods.model.vo.task.SpAotuerpTreasureTaskQueryVo;

/**
 * 
 * Title:SpAotuerpTreasureTaskMapperCustom
 * Description:宝贝任务mapper扩展
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-11-30 下午6:45:49
 *
 */
public interface SpAotuerpTreasureTaskMapperCustom {
	
	/**
	 * 查询任务宝贝，根据任务状态查询
	 * @param spStatusId
	 * 1： 未进行 2：进行中 3：已结束
	 * @return
	 * @throws Exception
	 */
	List<SpAotuerpTreasureTaskCustom> findSpAotuerpTreasureTaskBySpStatusId(Integer spStatusId) throws Exception;
	
	/**
	 * 查询任务宝贝，根据任务id和任务状态查询
	 * @param spTreaTaskV
	 * @param spId 任务id
	 * @param spStatusId 状态id
	 * @return
	 * @throws Exception
	 */
	SpAotuerpTreasureTaskCustom findSpAotuerpTreasureTaskBySpIdAndSpStatusId(SpAotuerpTreasureTaskQueryVo spTreaTaskV)throws Exception;
	
	
	/**
	 * 查询任务宝贝，根据宝贝id和代言人id和任务状态查询
	 * @param spTreaTaskV
	 * @param spId 任务id
	 * @param anId 代言人id
	 * @param spStatusId 状态id
	 * @return
	 * @throws Exception
	 */
	SpAotuerpTreasureTaskCustom findSpAotuerpTreasureTaskByAnIdAndSpStatusId(SpAotuerpTreasureTaskQueryVo spTreaTaskV)throws Exception;


	/**
	 * 查询任务宝贝，根据宝贝id和代言人id和任务状态查询
	 * @param spTreaTaskV
	 * @param spId 任务id
	 * @param anId 代言人id
	 * @param spStatusId 状态id
	 * @return
	 * @throws Exception
	 */
	SpAotuerpTreasureTaskCustom findSpAotuerpTreasureTaskSkuJsonByAnIdAndSpStatusId(SpAotuerpTreasureTaskQueryVo spTreaTaskV)throws Exception;
	
}
