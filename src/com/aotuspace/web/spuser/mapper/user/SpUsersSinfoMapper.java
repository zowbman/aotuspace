package com.aotuspace.web.spuser.mapper.user;

import com.aotuspace.web.spuser.model.po.user.SpUsersSinfo;
import com.aotuspace.web.spuser.model.po.user.SpUsersSinfoExample;
import com.aotuspace.web.spuser.model.po.user.SpUsersSinfoKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 
 * Title:SpUsersSinfoMapper
 * Description:�û���ȫ��Ϣmapper
 * Company:aotuspace
 * @author    ΰ��
 * @date      2015-12-26 ����12:43:33
 *
 */
public interface SpUsersSinfoMapper {
    int countByExample(SpUsersSinfoExample example);

    int deleteByExample(SpUsersSinfoExample example);

    int deleteByPrimaryKey(SpUsersSinfoKey key);

    int insert(SpUsersSinfo record);

    int insertSelective(SpUsersSinfo record);

    List<SpUsersSinfo> selectByExample(SpUsersSinfoExample example);

    SpUsersSinfo selectByPrimaryKey(SpUsersSinfoKey key);

    int updateByExampleSelective(@Param("record") SpUsersSinfo record, @Param("example") SpUsersSinfoExample example);

    int updateByExample(@Param("record") SpUsersSinfo record, @Param("example") SpUsersSinfoExample example);

    int updateByPrimaryKeySelective(SpUsersSinfo record);

    int updateByPrimaryKey(SpUsersSinfo record);
}