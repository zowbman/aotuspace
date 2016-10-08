package com.aotuspace.web.spgoods.mapper.product;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.aotuspace.web.spgoods.model.po.product.SpProductBinfo;
import com.aotuspace.web.spgoods.model.po.product.SpProductBinfoExample;

/**
 * 
 * Title:SpProductBinfoMapper
 * Description:商品信息mapper
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-12-1 下午12:40:55
 *
 */
public interface SpProductBinfoMapper {
    int countByExample(SpProductBinfoExample example);

    int deleteByExample(SpProductBinfoExample example);

    int deleteByPrimaryKey(Integer spId);

    int insert(SpProductBinfo record);

    int insertSelective(SpProductBinfo record);

    List<SpProductBinfo> selectByExample(SpProductBinfoExample example);

    SpProductBinfo selectByPrimaryKey(Integer spId);

    int updateByExampleSelective(@Param("record") SpProductBinfo record, @Param("example") SpProductBinfoExample example);

    int updateByExample(@Param("record") SpProductBinfo record, @Param("example") SpProductBinfoExample example);

    int updateByPrimaryKeySelective(SpProductBinfo record);

    int updateByPrimaryKey(SpProductBinfo record);
}