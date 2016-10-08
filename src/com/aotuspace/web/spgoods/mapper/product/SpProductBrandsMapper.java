package com.aotuspace.web.spgoods.mapper.product;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.aotuspace.web.spgoods.model.po.product.SpProductBrands;
import com.aotuspace.web.spgoods.model.po.product.SpProductBrandsExample;

/**
 * 
 * Title:SpProductBrandsMapper
 * Description:商品品牌mapper
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-12-1 下午12:41:17
 *
 */
public interface SpProductBrandsMapper {
    int countByExample(SpProductBrandsExample example);

    int deleteByExample(SpProductBrandsExample example);

    int deleteByPrimaryKey(Integer spId);

    int insert(SpProductBrands record);

    int insertSelective(SpProductBrands record);

    List<SpProductBrands> selectByExample(SpProductBrandsExample example);

    SpProductBrands selectByPrimaryKey(Integer spId);

    int updateByExampleSelective(@Param("record") SpProductBrands record, @Param("example") SpProductBrandsExample example);

    int updateByExample(@Param("record") SpProductBrands record, @Param("example") SpProductBrandsExample example);

    int updateByPrimaryKeySelective(SpProductBrands record);

    int updateByPrimaryKey(SpProductBrands record);
}