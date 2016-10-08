package com.aotuspace.web.spdictionary.mapper.bank;

import com.aotuspace.web.spdictionary.model.po.bank.SpBanks;
import com.aotuspace.web.spdictionary.model.po.bank.SpBanksExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 
 * Title:SpBanksMapper
 * Description:×ÜÐÐmapper
 * Company:aotuspace
 * @author    Î°±¦
 * @date      2015-12-4 ÏÂÎç3:34:18
 *
 */
public interface SpBanksMapper {
    int countByExample(SpBanksExample example);

    int deleteByExample(SpBanksExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SpBanks record);

    int insertSelective(SpBanks record);

    List<SpBanks> selectByExample(SpBanksExample example);

    SpBanks selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SpBanks record, @Param("example") SpBanksExample example);

    int updateByExample(@Param("record") SpBanks record, @Param("example") SpBanksExample example);

    int updateByPrimaryKeySelective(SpBanks record);

    int updateByPrimaryKey(SpBanks record);
}