package com.aotuspace.web.spdictionary.mapper.livestation;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.aotuspace.web.spdictionary.model.po.livestation.SpLivestationInfo;
import com.aotuspace.web.spdictionary.model.po.livestation.SpLivestationInfoExample;

/**
 * 
 * Title:SpLivestationInfoMapper
 * Description:直播平台mapper
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-12-7 上午11:01:45
 *
 */
public interface SpLivestationInfoMapper {
	
    int countByExample(SpLivestationInfoExample example);

    int deleteByExample(SpLivestationInfoExample example);

    int deleteByPrimaryKey(Byte spId);

    int insert(SpLivestationInfo record);

    int insertSelective(SpLivestationInfo record);

    List<SpLivestationInfo> selectByExample(SpLivestationInfoExample example);

    SpLivestationInfo selectByPrimaryKey(Byte spId);

    int updateByExampleSelective(@Param("record") SpLivestationInfo record, @Param("example") SpLivestationInfoExample example);

    int updateByExample(@Param("record") SpLivestationInfo record, @Param("example") SpLivestationInfoExample example);

    int updateByPrimaryKeySelective(SpLivestationInfo record);

    int updateByPrimaryKey(SpLivestationInfo record);
}