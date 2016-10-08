package com.aotuspace.web.spuser.mapper.user;

import com.aotuspace.web.spuser.model.po.user.SpUsersDinfo;
import com.aotuspace.web.spuser.model.po.user.SpUsersDinfoExample;
import com.aotuspace.web.spuser.model.po.user.SpUsersDinfoKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 
 * Title:SpUserDinfoMapper
 * Description:用户详细信息mapper接口
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-12-26 上午11:33:43
 *
 */
public interface SpUsersDinfoMapper {
    int countByExample(SpUsersDinfoExample example);

    int deleteByExample(SpUsersDinfoExample example);

    int deleteByPrimaryKey(SpUsersDinfoKey key);

    int insert(SpUsersDinfo record);

    int insertSelective(SpUsersDinfo record);

    List<SpUsersDinfo> selectByExample(SpUsersDinfoExample example);

    SpUsersDinfo selectByPrimaryKey(SpUsersDinfoKey key);

    int updateByExampleSelective(@Param("record") SpUsersDinfo record, @Param("example") SpUsersDinfoExample example);

    int updateByExample(@Param("record") SpUsersDinfo record, @Param("example") SpUsersDinfoExample example);

    int updateByPrimaryKeySelective(SpUsersDinfo record);

    int updateByPrimaryKey(SpUsersDinfo record);
}