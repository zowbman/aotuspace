package com.aotuspace.web.spuser.mapper.user;

import com.aotuspace.web.spuser.model.po.user.SpUsersAvatar;
import com.aotuspace.web.spuser.model.po.user.SpUsersAvatarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 
 * Title:SpUsersAvatarMapper
 * Description:用户头像mapper
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-12-28 上午11:09:12
 *
 */
public interface SpUsersAvatarMapper {
    int countByExample(SpUsersAvatarExample example);

    int deleteByExample(SpUsersAvatarExample example);

    int deleteByPrimaryKey(Integer spId);

    int insert(SpUsersAvatar record);

    int insertSelective(SpUsersAvatar record);

    List<SpUsersAvatar> selectByExample(SpUsersAvatarExample example);

    SpUsersAvatar selectByPrimaryKey(Integer spId);

    int updateByExampleSelective(@Param("record") SpUsersAvatar record, @Param("example") SpUsersAvatarExample example);

    int updateByExample(@Param("record") SpUsersAvatar record, @Param("example") SpUsersAvatarExample example);

    int updateByPrimaryKeySelective(SpUsersAvatar record);

    int updateByPrimaryKey(SpUsersAvatar record);
}