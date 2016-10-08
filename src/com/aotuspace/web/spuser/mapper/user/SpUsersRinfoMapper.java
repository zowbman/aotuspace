package com.aotuspace.web.spuser.mapper.user;

import com.aotuspace.web.spuser.model.po.user.SpUsersRinfo;
import com.aotuspace.web.spuser.model.po.user.SpUsersRinfoExample;
import com.aotuspace.web.spuser.model.po.user.SpUsersRinfoKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 
 * Title:SpUsersRinfoMapper
 * Description:用户真实信息mapper
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-12-26 下午12:43:21
 *
 */
public interface SpUsersRinfoMapper {
    int countByExample(SpUsersRinfoExample example);

    int deleteByExample(SpUsersRinfoExample example);

    int deleteByPrimaryKey(SpUsersRinfoKey key);

    int insert(SpUsersRinfo record);

    int insertSelective(SpUsersRinfo record);

    List<SpUsersRinfo> selectByExample(SpUsersRinfoExample example);

    SpUsersRinfo selectByPrimaryKey(SpUsersRinfoKey key);

    int updateByExampleSelective(@Param("record") SpUsersRinfo record, @Param("example") SpUsersRinfoExample example);

    int updateByExample(@Param("record") SpUsersRinfo record, @Param("example") SpUsersRinfoExample example);

    int updateByPrimaryKeySelective(SpUsersRinfo record);

    int updateByPrimaryKey(SpUsersRinfo record);
}