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
 * Description:收货功能模块service实现类
 * Company:Boundless
 * @author    伟宝
 * @date      2015-9-10 上午11:13:52
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
		//判断传进来的参数
		SpDeliverInfo spDeliverInfo=spDeliverInfoMapper.selectByPrimaryKey(spDeliverInfoQueryVo.getSpId());
		if(spDeliverInfo!=null){
			spDeliverInfo.setSpReceiver(spDeliverInfoQueryVo.getSpDeliverC().getSpReceiver());//收货人
			spDeliverInfo.setSpMobie(spDeliverInfoQueryVo.getSpDeliverC().getSpMobie());//手机号码
			spDeliverInfo.setSpTelephone(spDeliverInfoQueryVo.getSpDeliverC().getSpTelephone());//固话
			spDeliverInfo.setSpPostcode(spDeliverInfoQueryVo.getSpDeliverC().getSpPostcode());//邮编
			spDeliverInfo.setSpArea(spDeliverInfoQueryVo.getSpDeliverC().getSpArea());//区域
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
		//查询原本设为默认地址的收货地址
		SpDeliverInfoExample spDeliverInfoExample=new SpDeliverInfoExample();
		SpDeliverInfoExample.Criteria criteria=spDeliverInfoExample.createCriteria();
		criteria.andSpAtuidEqualTo(spDeliverInfoQueryVo.getAotuId());
		criteria.andSpIsdefaultEqualTo(1);
		List<SpDeliverInfo> spDeliverInfos=spDeliverInfoMapper.selectByExample(spDeliverInfoExample);
		//设置他不是默认地址
		if(spDeliverInfos!=null&&spDeliverInfos.size()>0){
			spDeliverInfos.iterator().next().setSpIsdefault(0);
			spDeliverInfoMapper.updateByPrimaryKeySelective(spDeliverInfos.iterator().next());
		}
		//查询将要设置默认地址的地址
		SpDeliverInfo spDeliverInfo=spDeliverInfoMapper.selectByPrimaryKey(spDeliverInfoQueryVo.getSpId());
		spDeliverInfo.setSpIsdefault(spDeliverInfoQueryVo.getDefaultValue());
		spDeliverInfoMapper.updateByPrimaryKey(spDeliverInfo);
	}	
}
