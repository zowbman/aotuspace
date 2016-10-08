package com.aotuspace.web.spuser.mapper.application;

import com.aotuspace.web.spuser.model.po.application.SpAnchorApplication;
import com.aotuspace.web.spuser.model.po.application.SpAnchorApplicationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 
 * Title:SpAnchorApplicationMapper
 * Description:代言主播申请信息mapper
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-12-4 下午7:56:13
 *
 */
public interface SpAnchorApplicationMapper {
	
    int countByExample(SpAnchorApplicationExample example);

    int deleteByExample(SpAnchorApplicationExample example);

    int deleteByPrimaryKey(Integer spId);

    int insert(SpAnchorApplication record);

    int insertSelective(SpAnchorApplication record);

    List<SpAnchorApplication> selectByExample(SpAnchorApplicationExample example);

    SpAnchorApplication selectByPrimaryKey(Integer spId);

    int updateByExampleSelective(@Param("record") SpAnchorApplication record, @Param("example") SpAnchorApplicationExample example);

    int updateByExample(@Param("record") SpAnchorApplication record, @Param("example") SpAnchorApplicationExample example);

    int updateByPrimaryKeySelective(SpAnchorApplication record);

    int updateByPrimaryKey(SpAnchorApplication record);
}