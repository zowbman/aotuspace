package com.aotuspace.web.spgoods.mapper.product;

import com.aotuspace.web.spgoods.model.po.product.SpProductBproperties;
import com.aotuspace.web.spgoods.model.po.product.SpProductBpropertiesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 
 * Title:SpProductBpropertiesMapper
 * Description:商品属性mapper
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-12-11 下午3:07:57
 *
 */

public interface SpProductBpropertiesMapper {
    int countByExample(SpProductBpropertiesExample example);

    int deleteByExample(SpProductBpropertiesExample example);

    int deleteByPrimaryKey(Integer spId);

    int insert(SpProductBproperties record);

    int insertSelective(SpProductBproperties record);

    List<SpProductBproperties> selectByExample(SpProductBpropertiesExample example);

    SpProductBproperties selectByPrimaryKey(Integer spId);

    int updateByExampleSelective(@Param("record") SpProductBproperties record, @Param("example") SpProductBpropertiesExample example);

    int updateByExample(@Param("record") SpProductBproperties record, @Param("example") SpProductBpropertiesExample example);

    int updateByPrimaryKeySelective(SpProductBproperties record);

    int updateByPrimaryKey(SpProductBproperties record);
}