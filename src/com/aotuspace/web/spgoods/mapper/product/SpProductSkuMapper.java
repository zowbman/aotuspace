package com.aotuspace.web.spgoods.mapper.product;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.aotuspace.web.spgoods.model.po.product.SpProductSku;
import com.aotuspace.web.spgoods.model.po.product.SpProductSkuExample;

/**
 * 
 * Title:SpProductSkuMapper
 * Description:ÉÌÆ·skumapper
 * Company:aotuspace
 * @author    Î°±¦
 * @date      2015-12-1 ÏÂÎç12:41:26
 *
 */
public interface SpProductSkuMapper {
    int countByExample(SpProductSkuExample example);

    int deleteByExample(SpProductSkuExample example);

    int deleteByPrimaryKey(Integer spSkuid);

    int insert(SpProductSku record);

    int insertSelective(SpProductSku record);

    List<SpProductSku> selectByExample(SpProductSkuExample example);

    SpProductSku selectByPrimaryKey(Integer spSkuid);

    int updateByExampleSelective(@Param("record") SpProductSku record, @Param("example") SpProductSkuExample example);

    int updateByExample(@Param("record") SpProductSku record, @Param("example") SpProductSkuExample example);

    int updateByPrimaryKeySelective(SpProductSku record);

    int updateByPrimaryKey(SpProductSku record);
}