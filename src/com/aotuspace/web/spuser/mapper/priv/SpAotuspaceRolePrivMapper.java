package com.aotuspace.web.spuser.mapper.priv;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.aotuspace.web.spuser.model.po.priv.SpAotuspaceRolePriv;
import com.aotuspace.web.spuser.model.po.priv.SpAotuspaceRolePrivExample;

/**
 * 
 * Title:SpAotuspaceRolePrivMapper
 * Description:角色权限mapper
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-9-13 下午8:38:30
 *
 */
public interface SpAotuspaceRolePrivMapper {
    int countByExample(SpAotuspaceRolePrivExample example);

    int deleteByExample(SpAotuspaceRolePrivExample example);

    int deleteByPrimaryKey(Integer spId);

    int insert(SpAotuspaceRolePriv record);

    int insertSelective(SpAotuspaceRolePriv record);

    List<SpAotuspaceRolePriv> selectByExample(SpAotuspaceRolePrivExample example);

    SpAotuspaceRolePriv selectByPrimaryKey(Integer spId);

    int updateByExampleSelective(@Param("record") SpAotuspaceRolePriv record, @Param("example") SpAotuspaceRolePrivExample example);

    int updateByExample(@Param("record") SpAotuspaceRolePriv record, @Param("example") SpAotuspaceRolePrivExample example);

    int updateByPrimaryKeySelective(SpAotuspaceRolePriv record);

    int updateByPrimaryKey(SpAotuspaceRolePriv record);
}