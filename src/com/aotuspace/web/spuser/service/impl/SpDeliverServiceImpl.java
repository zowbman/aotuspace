package com.aotuspace.web.spuser.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.aotuspace.web.spdictionary.mapper.area.SpDistrictInfoMapper;
import com.aotuspace.web.spdictionary.model.po.area.SpDistrictInfo;
import com.aotuspace.web.spuser.mapper.deliver.SpDeliverInfoMapper;
import com.aotuspace.web.spuser.model.po.deliver.SpDeliverInfo;
import com.aotuspace.web.spuser.model.po.deliver.SpDeliverInfoExample;
import com.aotuspace.web.spuser.model.po.deliver.custom.SpDeliverInfoCustom;
import com.aotuspace.web.spuser.model.vo.deliver.SpDeliverInfoQueryVo;
import com.aotuspace.web.spuser.service.ISpDeliverService;
import com.aotuspace.web.util.CustomUtil;

/**
 * 
 * Title:SpUsersServiceImpl
 * Description:�ջ�����ģ��serviceʵ����
 * Company:Boundless
 * @author    ΰ��
 * @date      2015-9-10 ����11:13:52
 *
 */

public class SpDeliverServiceImpl implements ISpDeliverService {

	@Autowired
	SpDeliverInfoMapper spDeliverInfoMapper;
	
	@Autowired
	SpDistrictInfoMapper spDistrictInfoMapper;
	
	@Override
	public List<SpDeliverInfo> findDeliverInfoByAutoId(Integer aotuId) throws Exception {
		if(aotuId!=null){
			SpDeliverInfoExample spDeliverInfoExample=new SpDeliverInfoExample();
			SpDeliverInfoExample.Criteria criteria=spDeliverInfoExample.createCriteria();
			criteria.andSpAtuidEqualTo(aotuId);
			return spDeliverInfoMapper.selectByExample(spDeliverInfoExample);
		}
		return null;
	}
	
	@Override
	public SpDeliverInfoCustom findDeliverInfoBySpId(Integer spId) throws Exception {
		if(spId!=null){
			SpDeliverInfo spDeliverInfo=spDeliverInfoMapper.selectByPrimaryKey(spId);
			if(spDeliverInfo!=null){
				SpDeliverInfoCustom spDeliverInfoCustom=new SpDeliverInfoCustom();
				BeanUtils.copyProperties(spDeliverInfo, spDeliverInfoCustom);
				List<Integer> areas = CustomUtil.stringToListI(spDeliverInfo.getSpArea(), "-");
				if(areas!=null&&areas.size()>=1){
					spDeliverInfoCustom.setProvince(spDistrictInfoMapper.selectByPrimaryKey(areas.get(0)));
				}
				if(areas!=null&&areas.size()>=2){
					spDeliverInfoCustom.setCity(spDistrictInfoMapper.selectByPrimaryKey(areas.get(1)));			
				}
				if(areas!=null&&areas.size()>=3){
					spDeliverInfoCustom.setDistrict(spDistrictInfoMapper.selectByPrimaryKey(areas.get(2)));	
				}
				if(areas!=null&&areas.size()>=4){
					spDeliverInfoCustom.setTown(spDistrictInfoMapper.selectByPrimaryKey(areas.get(3)));	
				}
				return spDeliverInfoCustom;
			}
		}
		return null;
	}

	@Override
	public void saveDeliver(SpDeliverInfoQueryVo spDeliverInfoQueryVo) throws Exception {
		spDeliverInfoMapper.insertSelective(spDeliverInfoQueryVo.getSpDeliverC());
	}

	@Override
	public void updateDeliver(SpDeliverInfoQueryVo spDeliverInfoQueryVo) throws Exception {
		//�жϴ������Ĳ���
		SpDeliverInfo spDeliverInfo=spDeliverInfoMapper.selectByPrimaryKey(spDeliverInfoQueryVo.getSpId());
		if(spDeliverInfo!=null){
			spDeliverInfo.setSpReceiver(spDeliverInfoQueryVo.getSpDeliverC().getSpReceiver());//�ջ���
			spDeliverInfo.setSpMobie(spDeliverInfoQueryVo.getSpDeliverC().getSpMobie());//�ֻ�����
			spDeliverInfo.setSpTelephone(spDeliverInfoQueryVo.getSpDeliverC().getSpTelephone());//�̻�
			spDeliverInfo.setSpPostcode(spDeliverInfoQueryVo.getSpDeliverC().getSpPostcode());//�ʱ�
			spDeliverInfo.setSpArea(spDeliverInfoQueryVo.getSpDeliverC().getSpArea());//����
			spDeliverInfoMapper.updateByPrimaryKeySelective(spDeliverInfo);
		}
	}
	
	

	@Override
	public void deleteDeliver(Integer spId) throws Exception {
		if(spId!=null){
			spDeliverInfoMapper.deleteByPrimaryKey(spId);
		}
	}

	@Override
	public void updateSetDefaultDeliver(SpDeliverInfoQueryVo spDeliverInfoQueryVo) throws Exception {
		//��ѯԭ����ΪĬ�ϵ�ַ���ջ���ַ
		SpDeliverInfoExample spDeliverInfoExample=new SpDeliverInfoExample();
		SpDeliverInfoExample.Criteria criteria=spDeliverInfoExample.createCriteria();
		criteria.andSpAtuidEqualTo(spDeliverInfoQueryVo.getAotuId());
		criteria.andSpIsdefaultEqualTo(1);
		List<SpDeliverInfo> spDeliverInfos=spDeliverInfoMapper.selectByExample(spDeliverInfoExample);
		//����������Ĭ�ϵ�ַ
		if(spDeliverInfos!=null&&spDeliverInfos.size()>0){
			spDeliverInfos.iterator().next().setSpIsdefault(0);
			spDeliverInfoMapper.updateByPrimaryKeySelective(spDeliverInfos.iterator().next());
		}
		//��ѯ��Ҫ����Ĭ�ϵ�ַ�ĵ�ַ
		SpDeliverInfo spDeliverInfo=spDeliverInfoMapper.selectByPrimaryKey(spDeliverInfoQueryVo.getSpId());
		spDeliverInfo.setSpIsdefault(spDeliverInfoQueryVo.getDefaultValue());
		spDeliverInfoMapper.updateByPrimaryKey(spDeliverInfo);
	}	
}
