package com.aotuspace.web.spuser.mapper.priv;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.aotuspace.web.spuser.model.po.priv.SpAotuspaceUserRole;
import com.aotuspace.web.spuser.model.po.priv.SpAotuspaceUserRoleExample;

/**
 * 
 * Title:SpAotuspaceUserRoleMapper
 * Description:用户角色mapper
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-9-14 下午7:48:51
 *
 */
public interface SpAotuspaceUserRoleMapper {
    int countByExample(SpAotuspaceUserRoleExample example);

    int deleteByExample(SpAotuspaceUserRoleExample example);

    int deleteByPrimaryKey(Integer spId);

    int insert(SpAotuspaceUserRole record);

    int insertSelective(SpAotuspaceUserRole record);

    List<SpAotuspaceUserRole> selectByExample(SpAotuspaceUserRoleExample example);

    SpAotuspaceUserRole selectByPrimaryKey(Integer spId);

    int updateByExampleSelective(@Param("record") SpAotuspaceUserRole record, @Param("example") SpAotuspaceUserRoleExample example);

    int updateByExample(@Param("record") SpAotuspaceUserRole record, @Param("example") SpAotuspaceUserRoleExample example);

    int updateByPrimaryKeySelective(SpAotuspaceUserRole record);

    int updateByPrimaryKey(SpAotuspaceUserRole record);
}