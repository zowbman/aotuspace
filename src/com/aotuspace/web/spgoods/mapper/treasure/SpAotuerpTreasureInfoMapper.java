package com.aotuspace.web.spgoods.mapper.treasure;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.aotuspace.web.spgoods.model.po.treasure.SpAotuerpTreasureInfo;
import com.aotuspace.web.spgoods.model.po.treasure.SpAotuerpTreasureInfoExample;

/**
 * 
 * Title:SpAotuerpTreasureInfoMapper
 * Description:±¦±´ÐÅÏ¢mapper
 * Company:aotuspace
 * @author    Î°±¦
 * @date      2015-11-30 ÏÂÎç6:08:29
 *
 */
public interface SpAotuerpTreasureInfoMapper {
    int countByExample(SpAotuerpTreasureInfoExample example);

    int deleteByExample(SpAotuerpTreasureInfoExample example);

    int deleteByPrimaryKey(Integer spId);

    int insert(SpAotuerpTreasureInfo record);

    int insertSelective(SpAotuerpTreasureInfo record);

    List<SpAotuerpTreasureInfo> selectByExampleWithBLOBs(SpAotuerpTreasureInfoExample example);

    List<SpAotuerpTreasureInfo> selectByExample(SpAotuerpTreasureInfoExample example);

    SpAotuerpTreasureInfo selectByPrimaryKey(Integer spId);

    int updateByExampleSelective(@Param("record") SpAotuerpTreasureInfo record, @Param("example") SpAotuerpTreasureInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") SpAotuerpTreasureInfo record, @Param("example") SpAotuerpTreasureInfoExample example);

    int updateByExample(@Param("record") SpAotuerpTreasureInfo record, @Param("example") SpAotuerpTreasureInfoExample example);

    int updateByPrimaryKeySelective(SpAotuerpTreasureInfo record);

    int updateByPrimaryKeyWithBLOBs(SpAotuerpTreasureInfo record);

    int updateByPrimaryKey(SpAotuerpTreasureInfo record);
}