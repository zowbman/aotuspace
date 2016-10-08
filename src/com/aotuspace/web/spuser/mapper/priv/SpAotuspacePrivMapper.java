package com.aotuspace.web.spuser.mapper.priv;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.aotuspace.web.spuser.model.po.priv.SpAotuspacePriv;
import com.aotuspace.web.spuser.model.po.priv.SpAotuspacePrivExample;

/**
 * 
 * Title:SpAotuspacePrivMapper
 * Description:È¨ÏÞmapper
 * Company:aotuspace
 * @author    Î°±¦
 * @date      2015-9-13 ÏÂÎç8:38:11
 *
 */
public interface SpAotuspacePrivMapper {
    int countByExample(SpAotuspacePrivExample example);

    int deleteByExample(SpAotuspacePrivExample example);

    int deleteByPrimaryKey(Integer spId);

    int insert(SpAotuspacePriv record);

    int insertSelective(SpAotuspacePriv record);

    List<SpAotuspacePriv> selectByExample(SpAotuspacePrivExample example);

    SpAotuspacePriv selectByPrimaryKey(Integer spId);

    int updateByExampleSelective(@Param("record") SpAotuspacePriv record, @Param("example") SpAotuspacePrivExample example);

    int updateByExample(@Param("record") SpAotuspacePriv record, @Param("example") SpAotuspacePrivExample example);

    int updateByPrimaryKeySelective(SpAotuspacePriv record);

    int updateByPrimaryKey(SpAotuspacePriv record);
}