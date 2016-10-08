package com.aotuspace.web.spdictionary.mapper.bank;

import com.aotuspace.web.spdictionary.model.po.bank.SpBankRegion;
import com.aotuspace.web.spdictionary.model.po.bank.SpBankRegionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 
 * Title:SpBankRegionMapper
 * Description:银行地域mapper
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-12-4 下午3:34:05
 *
 */
public interface SpBankRegionMapper {
    int countByExample(SpBankRegionExample example);

    int deleteByExample(SpBankRegionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SpBankRegion record);

    int insertSelective(SpBankRegion record);

    List<SpBankRegion> selectByExample(SpBankRegionExample example);

    SpBankRegion selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SpBankRegion record, @Param("example") SpBankRegionExample example);

    int updateByExample(@Param("record") SpBankRegion record, @Param("example") SpBankRegionExample example);

    int updateByPrimaryKeySelective(SpBankRegion record);

    int updateByPrimaryKey(SpBankRegion record);
}