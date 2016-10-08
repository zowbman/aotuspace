package com.aotuspace.web.spuser.mapper.user;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.aotuspace.web.spuser.model.po.user.SpUsersBinfo;
import com.aotuspace.web.spuser.model.po.user.SpUsersBinfoExample;
import com.aotuspace.web.spuser.model.po.user.SpUsersBinfoKey;

/**
 * 
 * Title:SpUsersBinfoMapper
 * Description:�û�������Ϣmapper
 * Company:aotuspace
 * @author    ΰ��
 * @date      2015-9-13 ����8:34:29
 *
 */
public interface SpUsersBinfoMapper {
    int countByExample(SpUsersBinfoExample example);

    int deleteByExample(SpUsersBinfoExample example);

    int deleteByPrimaryKey(SpUsersBinfoKey key);

    int insert(SpUsersBinfo record);

    int insertSelective(SpUsersBinfo record);

    List<SpUsersBinfo> selectByExample(SpUsersBinfoExample example);

    SpUsersBinfo selectByPrimaryKey(SpUsersBinfoKey key);

    int updateByExampleSelective(@Param("record") SpUsersBinfo record, @Param("example") SpUsersBinfoExample example);

    int updateByExample(@Param("record") SpUsersBinfo record, @Param("example") SpUsersBinfoExample example);

    int updateByPrimaryKeySelective(SpUsersBinfo record);

    int updateByPrimaryKey(SpUsersBinfo record);
}