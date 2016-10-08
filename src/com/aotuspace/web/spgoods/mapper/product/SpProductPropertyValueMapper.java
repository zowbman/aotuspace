package com.aotuspace.web.spgoods.mapper.product;

import com.aotuspace.web.spgoods.model.po.product.SpProductPropertyValue;
import com.aotuspace.web.spgoods.model.po.product.SpProductPropertyValueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 
 * Title:SpProductPropertyValueMapper
 * Description: Ù–‘÷µmapper
 * Company:aotuspace
 * @author    Œ∞±¶
 * @date      2015-12-11 œ¬ŒÁ3:38:27
 *
 */
public interface SpProductPropertyValueMapper {
    int countByExample(SpProductPropertyValueExample example);

    int deleteByExample(SpProductPropertyValueExample example);

    int deleteByPrimaryKey(Integer spId);

    int insert(SpProductPropertyValue record);

    int insertSelective(SpProductPropertyValue record);

    List<SpProductPropertyValue> selectByExample(SpProductPropertyValueExample example);

    SpProductPropertyValue selectByPrimaryKey(Integer spId);

    int updateByExampleSelective(@Param("record") SpProductPropertyValue record, @Param("example") SpProductPropertyValueExample example);

    int updateByExample(@Param("record") SpProductPropertyValue record, @Param("example") SpProductPropertyValueExample example);

    int updateByPrimaryKeySelective(SpProductPropertyValue record);

    int updateByPrimaryKey(SpProductPropertyValue record);
}