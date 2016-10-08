package com.aotuspace.web.spgoods.mapper.task;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.aotuspace.web.spgoods.model.po.task.SpAotuerpTreasureTask;
import com.aotuspace.web.spgoods.model.po.task.SpAotuerpTreasureTaskExample;

/**
 * 
 * Title:SpAotuerpTreasureTaskMapper
 * Description:ÈÎÎñmapper
 * Company:aotuspace
 * @author    Î°±¦
 * @date      2015-11-30 ÏÂÎç6:07:38
 *
 */
public interface SpAotuerpTreasureTaskMapper {
    int countByExample(SpAotuerpTreasureTaskExample example);

    int deleteByExample(SpAotuerpTreasureTaskExample example);

    int deleteByPrimaryKey(Integer spId);

    int insert(SpAotuerpTreasureTask record);

    int insertSelective(SpAotuerpTreasureTask record);

    List<SpAotuerpTreasureTask> selectByExample(SpAotuerpTreasureTaskExample example);

    SpAotuerpTreasureTask selectByPrimaryKey(Integer spId);

    int updateByExampleSelective(@Param("record") SpAotuerpTreasureTask record, @Param("example") SpAotuerpTreasureTaskExample example);

    int updateByExample(@Param("record") SpAotuerpTreasureTask record, @Param("example") SpAotuerpTreasureTaskExample example);

    int updateByPrimaryKeySelective(SpAotuerpTreasureTask record);

    int updateByPrimaryKey(SpAotuerpTreasureTask record);
}