package com.aotuspace.web.spgoods.mapper.treasure;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.aotuspace.web.spgoods.model.po.treasure.SpAotuerpTreasureProductSku;
import com.aotuspace.web.spgoods.model.po.treasure.SpAotuerpTreasureProductSkuExample;

/**
 * 
 * Title:SpAotuerpTreasureProductSkuMapper
 * Description:±¦±´ÉÌÆ·skumapper
 * Company:aotuspace
 * @author    Î°±¦
 * @date      2015-11-30 ÏÂÎç6:08:49
 *
 */
public interface SpAotuerpTreasureProductSkuMapper {
    int countByExample(SpAotuerpTreasureProductSkuExample example);

    int deleteByExample(SpAotuerpTreasureProductSkuExample example);

    int deleteByPrimaryKey(Integer spId);

    int insert(SpAotuerpTreasureProductSku record);

    int insertSelective(SpAotuerpTreasureProductSku record);

    List<SpAotuerpTreasureProductSku> selectByExample(SpAotuerpTreasureProductSkuExample example);

    SpAotuerpTreasureProductSku selectByPrimaryKey(Integer spId);

    int updateByExampleSelective(@Param("record") SpAotuerpTreasureProductSku record, @Param("example") SpAotuerpTreasureProductSkuExample example);

    int updateByExample(@Param("record") SpAotuerpTreasureProductSku record, @Param("example") SpAotuerpTreasureProductSkuExample example);

    int updateByPrimaryKeySelective(SpAotuerpTreasureProductSku record);

    int updateByPrimaryKey(SpAotuerpTreasureProductSku record);
}