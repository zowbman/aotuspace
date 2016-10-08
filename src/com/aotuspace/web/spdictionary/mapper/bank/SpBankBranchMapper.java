package com.aotuspace.web.spdictionary.mapper.bank;

import com.aotuspace.web.spdictionary.model.po.bank.SpBankBranch;
import com.aotuspace.web.spdictionary.model.po.bank.SpBankBranchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 
 * Title:SpBankBranchMapper
 * Description:Ö§ÐÐmapper
 * Company:aotuspace
 * @author    Î°±¦
 * @date      2015-12-4 ÏÂÎç3:33:50
 *
 */
public interface SpBankBranchMapper {
    int countByExample(SpBankBranchExample example);

    int deleteByExample(SpBankBranchExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SpBankBranch record);

    int insertSelective(SpBankBranch record);

    List<SpBankBranch> selectByExample(SpBankBranchExample example);

    SpBankBranch selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SpBankBranch record, @Param("example") SpBankBranchExample example);

    int updateByExample(@Param("record") SpBankBranch record, @Param("example") SpBankBranchExample example);

    int updateByPrimaryKeySelective(SpBankBranch record);

    int updateByPrimaryKey(SpBankBranch record);
}