package com.aotuspace.web.spuser.mapper.user;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.aotuspace.web.spuser.model.po.user.SpUsersIdentity;
import com.aotuspace.web.spuser.model.po.user.SpUsersIdentityExample;

/**
 * 
 * Title:SpUsersIdentityMapper
 * Description:�û����mapper
 * Company:aotuspace
 * @author    ΰ��
 * @date      2015-9-13 ����8:34:42
 *
 */
public interface SpUsersIdentityMapper {
    int countByExample(SpUsersIdentityExample example);

    int deleteByExample(SpUsersIdentityExample example);

    int deleteByPrimaryKey(Byte spId);

    int insert(SpUsersIdentity record);

    int insertSelective(SpUsersIdentity record);

    List<SpUsersIdentity> selectByExample(SpUsersIdentityExample example);

    SpUsersIdentity selectByPrimaryKey(Byte spId);

    int updateByExampleSelective(@Param("record") SpUsersIdentity record, @Param("example") SpUsersIdentityExample example);

    int updateByExample(@Param("record") SpUsersIdentity record, @Param("example") SpUsersIdentityExample example);

    int updateByPrimaryKeySelective(SpUsersIdentity record);

    int updateByPrimaryKey(SpUsersIdentity record);
}