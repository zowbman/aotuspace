package com.aotuspace.web.spuser.mapper.user;

import com.aotuspace.web.spuser.model.po.user.SpAnchorBinfo;
import com.aotuspace.web.spuser.model.po.user.SpAnchorBinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 
 * Title:SpAnchorBinfoMapper
 * Description:代言主播基础信息mapper
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-12-14 下午12:00:09
 *
 */
public interface SpAnchorBinfoMapper {
    int countByExample(SpAnchorBinfoExample example);

    int deleteByExample(SpAnchorBinfoExample example);

    int deleteByPrimaryKey(Integer spId);

    int insert(SpAnchorBinfo record);

    int insertSelective(SpAnchorBinfo record);

    List<SpAnchorBinfo> selectByExample(SpAnchorBinfoExample example);

    SpAnchorBinfo selectByPrimaryKey(Integer spId);

    int updateByExampleSelective(@Param("record") SpAnchorBinfo record, @Param("example") SpAnchorBinfoExample example);

    int updateByExample(@Param("record") SpAnchorBinfo record, @Param("example") SpAnchorBinfoExample example);

    int updateByPrimaryKeySelective(SpAnchorBinfo record);

    int updateByPrimaryKey(SpAnchorBinfo record);
}