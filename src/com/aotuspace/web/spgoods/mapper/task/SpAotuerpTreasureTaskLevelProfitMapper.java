package com.aotuspace.web.spgoods.mapper.task;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.aotuspace.web.spgoods.model.po.task.SpAotuerpTreasureTaskLevelProfit;
import com.aotuspace.web.spgoods.model.po.task.SpAotuerpTreasureTaskLevelProfitExample;

/**
 * 
 * Title:SpAotuerpTreasureTaskLevelProfitMapper
 * Description:���񼶽���mapper
 * Company:aotuspace
 * @author    ΰ��
 * @date      2015-11-30 ����6:07:08
 *
 */
public interface SpAotuerpTreasureTaskLevelProfitMapper {
    int countByExample(SpAotuerpTreasureTaskLevelProfitExample example);

    int deleteByExample(SpAotuerpTreasureTaskLevelProfitExample example);

    int deleteByPrimaryKey(Integer spId);

    int insert(SpAotuerpTreasureTaskLevelProfit record);

    int insertSelective(SpAotuerpTreasureTaskLevelProfit record);

    List<SpAotuerpTreasureTaskLevelProfit> selectByExample(SpAotuerpTreasureTaskLevelProfitExample example);

    SpAotuerpTreasureTaskLevelProfit selectByPrimaryKey(Integer spId);

    int updateByExampleSelective(@Param("record") SpAotuerpTreasureTaskLevelProfit record, @Param("example") SpAotuerpTreasureTaskLevelProfitExample example);

    int updateByExample(@Param("record") SpAotuerpTreasureTaskLevelProfit record, @Param("example") SpAotuerpTreasureTaskLevelProfitExample example);

    int updateByPrimaryKeySelective(SpAotuerpTreasureTaskLevelProfit record);

    int updateByPrimaryKey(SpAotuerpTreasureTaskLevelProfit record);
}