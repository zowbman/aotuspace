package com.aotuspace.web.spgoods.mapper.task;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.aotuspace.web.spgoods.model.po.task.SpAotuerpTreasureTaskLevel;
import com.aotuspace.web.spgoods.model.po.task.SpAotuerpTreasureTaskLevelExample;

/**
 * 
 * Title:SpAotuerpTreasureTaskLevelMapper
 * Description:任务级mapper
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-11-30 下午6:06:45
 *
 */
public interface SpAotuerpTreasureTaskLevelMapper {
    int countByExample(SpAotuerpTreasureTaskLevelExample example);

    int deleteByExample(SpAotuerpTreasureTaskLevelExample example);

    int deleteByPrimaryKey(Integer spId);

    int insert(SpAotuerpTreasureTaskLevel record);

    int insertSelective(SpAotuerpTreasureTaskLevel record);

    List<SpAotuerpTreasureTaskLevel> selectByExample(SpAotuerpTreasureTaskLevelExample example);

    SpAotuerpTreasureTaskLevel selectByPrimaryKey(Integer spId);

    int updateByExampleSelective(@Param("record") SpAotuerpTreasureTaskLevel record, @Param("example") SpAotuerpTreasureTaskLevelExample example);

    int updateByExample(@Param("record") SpAotuerpTreasureTaskLevel record, @Param("example") SpAotuerpTreasureTaskLevelExample example);

    int updateByPrimaryKeySelective(SpAotuerpTreasureTaskLevel record);

    int updateByPrimaryKey(SpAotuerpTreasureTaskLevel record);
}