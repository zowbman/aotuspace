package com.aotuspace.web.spgoods.mapper.treasure;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.aotuspace.web.spgoods.model.po.treasure.SpAotuerpTreasureStatus;
import com.aotuspace.web.spgoods.model.po.treasure.SpAotuerpTreasureStatusExample;

/**
 * 
 * Title:SpAotuerpTreasureStatusMapper
 * Description:±¦±´×´Ì¬mapper
 * Company:aotuspace
 * @author    Î°±¦
 * @date      2015-11-30 ÏÂÎç6:09:02
 *
 */
public interface SpAotuerpTreasureStatusMapper {
    int countByExample(SpAotuerpTreasureStatusExample example);

    int deleteByExample(SpAotuerpTreasureStatusExample example);

    int deleteByPrimaryKey(Integer spId);

    int insert(SpAotuerpTreasureStatus record);

    int insertSelective(SpAotuerpTreasureStatus record);

    List<SpAotuerpTreasureStatus> selectByExample(SpAotuerpTreasureStatusExample example);

    SpAotuerpTreasureStatus selectByPrimaryKey(Integer spId);

    int updateByExampleSelective(@Param("record") SpAotuerpTreasureStatus record, @Param("example") SpAotuerpTreasureStatusExample example);

    int updateByExample(@Param("record") SpAotuerpTreasureStatus record, @Param("example") SpAotuerpTreasureStatusExample example);

    int updateByPrimaryKeySelective(SpAotuerpTreasureStatus record);

    int updateByPrimaryKey(SpAotuerpTreasureStatus record);
}