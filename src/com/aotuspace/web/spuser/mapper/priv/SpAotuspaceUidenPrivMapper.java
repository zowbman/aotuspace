package com.aotuspace.web.spuser.mapper.priv;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.aotuspace.web.spuser.model.po.priv.SpAotuspaceUidenPriv;
import com.aotuspace.web.spuser.model.po.priv.SpAotuspaceUidenPrivExample;

/**
 * 
 * Title:SpAotuspaceUidenPrivMapper
 * Description:身份权限mapper
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-9-13 下午8:38:42
 *
 */
public interface SpAotuspaceUidenPrivMapper {
    int countByExample(SpAotuspaceUidenPrivExample example);

    int deleteByExample(SpAotuspaceUidenPrivExample example);

    int deleteByPrimaryKey(Integer spId);

    int insert(SpAotuspaceUidenPriv record);

    int insertSelective(SpAotuspaceUidenPriv record);

    List<SpAotuspaceUidenPriv> selectByExample(SpAotuspaceUidenPrivExample example);

    SpAotuspaceUidenPriv selectByPrimaryKey(Integer spId);

    int updateByExampleSelective(@Param("record") SpAotuspaceUidenPriv record, @Param("example") SpAotuspaceUidenPrivExample example);

    int updateByExample(@Param("record") SpAotuspaceUidenPriv record, @Param("example") SpAotuspaceUidenPrivExample example);

    int updateByPrimaryKeySelective(SpAotuspaceUidenPriv record);

    int updateByPrimaryKey(SpAotuspaceUidenPriv record);
}