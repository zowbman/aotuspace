package com.aotuspace.web.spgoods.mapper.task;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.aotuspace.web.spgoods.model.po.task.SpAotuerpTreasureTaskMode;
import com.aotuspace.web.spgoods.model.po.task.SpAotuerpTreasureTaskModeExample;

/**
 * 
 * Title:SpAotuerpTreasureTaskModeMapper
 * Description:任务模式mapper
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-11-30 下午6:07:50
 *
 */
public interface SpAotuerpTreasureTaskModeMapper {
    int countByExample(SpAotuerpTreasureTaskModeExample example);

    int deleteByExample(SpAotuerpTreasureTaskModeExample example);

    int deleteByPrimaryKey(Integer spId);

    int insert(SpAotuerpTreasureTaskMode record);

    int insertSelective(SpAotuerpTreasureTaskMode record);

    List<SpAotuerpTreasureTaskMode> selectByExample(SpAotuerpTreasureTaskModeExample example);

    SpAotuerpTreasureTaskMode selectByPrimaryKey(Integer spId);

    int updateByExampleSelective(@Param("record") SpAotuerpTreasureTaskMode record, @Param("example") SpAotuerpTreasureTaskModeExample example);

    int updateByExample(@Param("record") SpAotuerpTreasureTaskMode record, @Param("example") SpAotuerpTreasureTaskModeExample example);

    int updateByPrimaryKeySelective(SpAotuerpTreasureTaskMode record);

    int updateByPrimaryKey(SpAotuerpTreasureTaskMode record);
}