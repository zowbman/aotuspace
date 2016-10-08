package com.aotuspace.web.spgoods.mapper.product;

import com.aotuspace.web.spgoods.model.po.product.SpProductPropertyName;
import com.aotuspace.web.spgoods.model.po.product.SpProductPropertyNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 
 * Title:SpProductPropertyNameMapper
 * Description: Ù–‘√˚mapper
 * Company:aotuspace
 * @author    Œ∞±¶
 * @date      2015-12-11 œ¬ŒÁ3:38:16
 *
 */
public interface SpProductPropertyNameMapper {
    int countByExample(SpProductPropertyNameExample example);

    int deleteByExample(SpProductPropertyNameExample example);

    int deleteByPrimaryKey(Integer spId);

    int insert(SpProductPropertyName record);

    int insertSelective(SpProductPropertyName record);

    List<SpProductPropertyName> selectByExample(SpProductPropertyNameExample example);

    SpProductPropertyName selectByPrimaryKey(Integer spId);

    int updateByExampleSelective(@Param("record") SpProductPropertyName record, @Param("example") SpProductPropertyNameExample example);

    int updateByExample(@Param("record") SpProductPropertyName record, @Param("example") SpProductPropertyNameExample example);

    int updateByPrimaryKeySelective(SpProductPropertyName record);

    int updateByPrimaryKey(SpProductPropertyName record);
}