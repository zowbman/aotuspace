package com.aotuspace.web.spgoods.mapper.treasure;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.aotuspace.web.spgoods.model.po.treasure.SpAotuerpTreasureImgRelation;
import com.aotuspace.web.spgoods.model.po.treasure.SpAotuerpTreasureImgRelationExample;

/**
 * 
 * Title:SpAotuerpTreasureImgRelationMapper
 * Description:����ͼƬmapper
 * Company:aotuspace
 * @author    ΰ��
 * @date      2015-12-1 ����10:06:36
 *
 */
public interface SpAotuerpTreasureImgRelationMapper {
    int countByExample(SpAotuerpTreasureImgRelationExample example);

    int deleteByExample(SpAotuerpTreasureImgRelationExample example);

    int deleteByPrimaryKey(Integer spId);

    int insert(SpAotuerpTreasureImgRelation record);

    int insertSelective(SpAotuerpTreasureImgRelation record);

    List<SpAotuerpTreasureImgRelation> selectByExample(SpAotuerpTreasureImgRelationExample example);

    SpAotuerpTreasureImgRelation selectByPrimaryKey(Integer spId);

    int updateByExampleSelective(@Param("record") SpAotuerpTreasureImgRelation record, @Param("example") SpAotuerpTreasureImgRelationExample example);

    int updateByExample(@Param("record") SpAotuerpTreasureImgRelation record, @Param("example") SpAotuerpTreasureImgRelationExample example);

    int updateByPrimaryKeySelective(SpAotuerpTreasureImgRelation record);

    int updateByPrimaryKey(SpAotuerpTreasureImgRelation record);
}