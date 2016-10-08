package com.aotuspace.web.spdictionary.mapper.area;

import com.aotuspace.web.spdictionary.model.po.area.SpDistrictInfo;
import com.aotuspace.web.spdictionary.model.po.area.SpDistrictInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 
 * Title:SpDistrictInfoMapper
 * Description:省市区mapper
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-12-29 下午4:10:01
 *
 */
public interface SpDistrictInfoMapper {
    int countByExample(SpDistrictInfoExample example);

    int deleteByExample(SpDistrictInfoExample example);

    int deleteByPrimaryKey(Integer spId);

    int insert(SpDistrictInfo record);

    int insertSelective(SpDistrictInfo record);

    List<SpDistrictInfo> selectByExample(SpDistrictInfoExample example);

    SpDistrictInfo selectByPrimaryKey(Integer spId);

    int updateByExampleSelective(@Param("record") SpDistrictInfo record, @Param("example") SpDistrictInfoExample example);

    int updateByExample(@Param("record") SpDistrictInfo record, @Param("example") SpDistrictInfoExample example);

    int updateByPrimaryKeySelective(SpDistrictInfo record);

    int updateByPrimaryKey(SpDistrictInfo record);
}