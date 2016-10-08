package com.aotuspace.web.spdictionary.service.bank.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.aotuspace.web.spdictionary.mapper.bank.SpBankBranchMapper;
import com.aotuspace.web.spdictionary.mapper.bank.SpBankRegionMapper;
import com.aotuspace.web.spdictionary.mapper.bank.SpBanksMapper;
import com.aotuspace.web.spdictionary.model.po.bank.SpBankBranch;
import com.aotuspace.web.spdictionary.model.po.bank.SpBankBranchExample;
import com.aotuspace.web.spdictionary.model.po.bank.SpBankRegion;
import com.aotuspace.web.spdictionary.model.po.bank.SpBankRegionExample;
import com.aotuspace.web.spdictionary.model.po.bank.SpBanks;
import com.aotuspace.web.spdictionary.service.bank.ISpBankService;

/**
 * 
 * Title:SpBankServiceImpl
 * Description:银行接口实现类
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-12-4 下午3:46:55
 *
 */
public class SpBankServiceImpl implements ISpBankService {

	@Autowired
	SpBanksMapper spBanksMapper;
	
	@Autowired
	SpBankRegionMapper spBankRegionMapper;
	
	@Autowired
	SpBankBranchMapper spBankBranchMapper;

	@Override
	public List<SpBanks> bankList() throws Exception {
		return spBanksMapper.selectByExample(null);
	}

	@Override
	public List<SpBankRegion> bankRegionListByLevelId(Integer levelId) throws Exception {
		SpBankRegionExample spBankRegionExample=new SpBankRegionExample();
		//通过criteria构造查询条件
		SpBankRegionExample.Criteria criteria=spBankRegionExample.createCriteria();
		criteria.andLevelEqualTo(levelId);
		return spBankRegionMapper.selectByExample(spBankRegionExample);
	}

	@Override
	public List<SpBankRegion> spBankRegionByPid(Integer pId) throws Exception {
		SpBankRegionExample spBankRegionExample=new SpBankRegionExample();
		//通过criteria构造查询条件
		SpBankRegionExample.Criteria criteria=spBankRegionExample.createCriteria();
		criteria.andPidEqualTo(pId);
		return spBankRegionMapper.selectByExample(spBankRegionExample);
	}

	@Override
	public List<SpBankBranch> spBankBranchByBankIdAndPidAndCityId(Integer bankId, Integer proId, Integer cityId)
			throws Exception {
		SpBankBranchExample spBankBranchExample=new SpBankBranchExample();
		//构造条件
		SpBankBranchExample.Criteria criteria=spBankBranchExample.createCriteria();
		criteria.andBankIdEqualTo(bankId);
		criteria.andProIdEqualTo(proId);
		criteria.andCityIdEqualTo(cityId);
		return spBankBranchMapper.selectByExample(spBankBranchExample);
	}
	
	
}
