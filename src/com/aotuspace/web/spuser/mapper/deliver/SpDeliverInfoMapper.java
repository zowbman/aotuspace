package com.aotuspace.web.spuser.mapper.deliver;

import com.aotuspace.web.spuser.model.po.deliver.SpDeliverInfo;
import com.aotuspace.web.spuser.model.po.deliver.SpDeliverInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 
 * Title:SpDeliverInfoMapper
 * Description:收货地址mapper
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-12-31 上午11:29:04
 *
 */
public interface SpDeliverInfoMapper {
    int countByExample(SpDeliverInfoExample example);

    int deleteByExample(SpDeliverInfoExample example);

    int deleteByPrimaryKey(Integer spId);

    int insert(SpDeliverInfo record);

    int insertSelective(SpDeliverInfo record);

    List<SpDeliverInfo> selectByExample(SpDeliverInfoExample example);

    SpDeliverInfo selectByPrimaryKey(Integer spId);

    int updateByExampleSelective(@Param("record") SpDeliverInfo record, @Param("example") SpDeliverInfoExample example);

    int updateByExample(@Param("record") SpDeliverInfo record, @Param("example") SpDeliverInfoExample example);

    int updateByPrimaryKeySelective(SpDeliverInfo record);

    int updateByPrimaryKey(SpDeliverInfo record);
}