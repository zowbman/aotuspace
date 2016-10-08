package com.aotuspace.web.spuser.mapper.application;

import com.aotuspace.web.spuser.model.po.application.SpArtistApplication;
import com.aotuspace.web.spuser.model.po.application.SpArtistApplicationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 
 * Title:SpArtistApplicationMapper
 * Description:艺人代言申请mapper
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-12-4 下午7:56:36
 *
 */
public interface SpArtistApplicationMapper {
    int countByExample(SpArtistApplicationExample example);

    int deleteByExample(SpArtistApplicationExample example);

    int deleteByPrimaryKey(Integer spId);

    int insert(SpArtistApplication record);

    int insertSelective(SpArtistApplication record);

    List<SpArtistApplication> selectByExample(SpArtistApplicationExample example);

    SpArtistApplication selectByPrimaryKey(Integer spId);

    int updateByExampleSelective(@Param("record") SpArtistApplication record, @Param("example") SpArtistApplicationExample example);

    int updateByExample(@Param("record") SpArtistApplication record, @Param("example") SpArtistApplicationExample example);

    int updateByPrimaryKeySelective(SpArtistApplication record);

    int updateByPrimaryKey(SpArtistApplication record);
}