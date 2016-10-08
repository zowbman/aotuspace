package com.aotuspace.web.spgoods.mapper.task;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.aotuspace.web.spgoods.model.po.task.SpAotuerpTreasureTaskStatus;
import com.aotuspace.web.spgoods.model.po.task.SpAotuerpTreasureTaskStatusExample;

/**
 * 
 * Title:SpAotuerpTreasureTaskStatusMapper
 * Description:ÈÎÎñ×´Ì¬mapper
 * Company:aotuspace
 * @author    Î°±¦
 * @date      2015-11-30 ÏÂÎç6:08:01
 *
 */
public interface SpAotuerpTreasureTaskStatusMapper {
    int countByExample(SpAotuerpTreasureTaskStatusExample example);

    int deleteByExample(SpAotuerpTreasureTaskStatusExample example);

    int deleteByPrimaryKey(Integer spId);

    int insert(SpAotuerpTreasureTaskStatus record);

    int insertSelective(SpAotuerpTreasureTaskStatus record);

    List<SpAotuerpTreasureTaskStatus> selectByExample(SpAotuerpTreasureTaskStatusExample example);

    SpAotuerpTreasureTaskStatus selectByPrimaryKey(Integer spId);

    int updateByExampleSelective(@Param("record") SpAotuerpTreasureTaskStatus record, @Param("example") SpAotuerpTreasureTaskStatusExample example);

    int updateByExample(@Param("record") SpAotuerpTreasureTaskStatus record, @Param("example") SpAotuerpTreasureTaskStatusExample example);

    int updateByPrimaryKeySelective(SpAotuerpTreasureTaskStatus record);

    int updateByPrimaryKey(SpAotuerpTreasureTaskStatus record);
}