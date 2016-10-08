package com.aotuspace.web.spdictionary.service.livestation.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.aotuspace.web.spdictionary.mapper.livestation.SpLivestationInfoMapper;
import com.aotuspace.web.spdictionary.model.po.livestation.SpLivestationInfo;
import com.aotuspace.web.spdictionary.service.livestation.ISpLiveStationService;

/**
 * 
 * Title:SpLiveStationServiceImpl
 * Description:ֱ��ƽ̨�ӿ�ʵ����
 * Company:aotuspace
 * @author    ΰ��
 * @date      2015-12-7 ����11:05:15
 *
 */
public class SpLiveStationServiceImpl implements ISpLiveStationService {

	@Autowired
	SpLivestationInfoMapper spLivestationInfoMapper;
	
	@Override
	public List<SpLivestationInfo> findAllSpLiveStationInfo() throws Exception {
		return spLivestationInfoMapper.selectByExample(null);
	}

	
}
