package com.aotuspace.web.spdictionary.service.area.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.aotuspace.web.spdictionary.mapper.area.SpDistrictInfoMapper;
import com.aotuspace.web.spdictionary.model.po.area.SpDistrictInfo;
import com.aotuspace.web.spdictionary.model.po.area.SpDistrictInfoExample;
import com.aotuspace.web.spdictionary.service.area.ISpAreaService;

/**
 * 
 * Title:SpAreaServiceImpl
 * Description:省市区接口实现类
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-12-4 下午3:46:55
 *
 */
public class SpAreaServiceImpl implements ISpAreaService {

	@Autowired
	SpDistrictInfoMapper spDistrictInfoMapper;
	
	@Override
	public List<SpDistrictInfo> findAreaList(Integer parentId) throws Exception {
		if(parentId!=null){
			SpDistrictInfoExample spDistrictInfoExample=new SpDistrictInfoExample();
			SpDistrictInfoExample.Criteria criteria=spDistrictInfoExample.createCriteria();
			criteria.andSpParentidEqualTo(parentId);
			return spDistrictInfoMapper.selectByExample(spDistrictInfoExample);
		}
		return null;
	}

	@Override
	public SpDistrictInfo findAreaBySpId(Integer spId) throws Exception {
		if(spId!=null){
			return spDistrictInfoMapper.selectByPrimaryKey(spId);
		}
		return null;
	}
	
	
}
