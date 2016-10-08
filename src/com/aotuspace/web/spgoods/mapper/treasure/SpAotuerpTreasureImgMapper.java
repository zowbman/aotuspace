package com.aotuspace.web.spgoods.mapper.treasure;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.aotuspace.web.spgoods.model.po.treasure.SpAotuerpTreasureImg;
import com.aotuspace.web.spgoods.model.po.treasure.SpAotuerpTreasureImgExample;

/**
 * 
 * Title:SpAotuerpTreasureImgMapper
 * Description:±¦±´Í¼Æ¬mapper
 * Company:aotuspace
 * @author    Î°±¦
 * @date      2015-11-30 ÏÂÎç6:08:17
 *
 */
public interface SpAotuerpTreasureImgMapper {
    int countByExample(SpAotuerpTreasureImgExample example);

    int deleteByExample(SpAotuerpTreasureImgExample example);

    int deleteByPrimaryKey(Integer spId);

    int insert(SpAotuerpTreasureImg record);

    int insertSelective(SpAotuerpTreasureImg record);

    List<SpAotuerpTreasureImg> selectByExample(SpAotuerpTreasureImgExample example);

    SpAotuerpTreasureImg selectByPrimaryKey(Integer spId);

    int updateByExampleSelective(@Param("record") SpAotuerpTreasureImg record, @Param("example") SpAotuerpTreasureImgExample example);

    int updateByExample(@Param("record") SpAotuerpTreasureImg record, @Param("example") SpAotuerpTreasureImgExample example);

    int updateByPrimaryKeySelective(SpAotuerpTreasureImg record);

    int updateByPrimaryKey(SpAotuerpTreasureImg record);
}