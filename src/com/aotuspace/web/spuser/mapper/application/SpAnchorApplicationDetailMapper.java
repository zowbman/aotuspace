package com.aotuspace.web.spuser.mapper.application;

import com.aotuspace.web.spuser.model.po.application.SpAnchorApplicationDetail;
import com.aotuspace.web.spuser.model.po.application.SpAnchorApplicationDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 
 * Title:SpAnchorApplicationDetailMapper
 * Description:代言主播申请信息详情mapper
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-12-4 下午7:55:31
 *
 */
public interface SpAnchorApplicationDetailMapper {
    int countByExample(SpAnchorApplicationDetailExample example);

    int deleteByExample(SpAnchorApplicationDetailExample example);

    int deleteByPrimaryKey(Integer spId);

    int insert(SpAnchorApplicationDetail record);

    int insertSelective(SpAnchorApplicationDetail record);

    List<SpAnchorApplicationDetail> selectByExample(SpAnchorApplicationDetailExample example);

    SpAnchorApplicationDetail selectByPrimaryKey(Integer spId);

    int updateByExampleSelective(@Param("record") SpAnchorApplicationDetail record, @Param("example") SpAnchorApplicationDetailExample example);

    int updateByExample(@Param("record") SpAnchorApplicationDetail record, @Param("example") SpAnchorApplicationDetailExample example);

    int updateByPrimaryKeySelective(SpAnchorApplicationDetail record);

    int updateByPrimaryKey(SpAnchorApplicationDetail record);
}