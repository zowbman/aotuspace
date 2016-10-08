package com.aotuspace.web.spuser.mapper.priv;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.aotuspace.web.spuser.model.po.priv.SpAotuspaceUserPriv;
import com.aotuspace.web.spuser.model.po.priv.SpAotuspaceUserPrivExample;

/**
 * 
 * Title:SpAotuspaceUsersPrivMapper
 * Description:用户权限mapper
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-9-13 下午8:38:52
 *
 */
public interface SpAotuspaceUserPrivMapper {
    int countByExample(SpAotuspaceUserPrivExample example);

    int deleteByExample(SpAotuspaceUserPrivExample example);

    int deleteByPrimaryKey(Integer spId);

    int insert(SpAotuspaceUserPriv record);

    int insertSelective(SpAotuspaceUserPriv record);

    List<SpAotuspaceUserPriv> selectByExample(SpAotuspaceUserPrivExample example);

    SpAotuspaceUserPriv selectByPrimaryKey(Integer spId);

    int updateByExampleSelective(@Param("record") SpAotuspaceUserPriv record, @Param("example") SpAotuspaceUserPrivExample example);

    int updateByExample(@Param("record") SpAotuspaceUserPriv record, @Param("example") SpAotuspaceUserPrivExample example);

    int updateByPrimaryKeySelective(SpAotuspaceUserPriv record);

    int updateByPrimaryKey(SpAotuspaceUserPriv record);
}