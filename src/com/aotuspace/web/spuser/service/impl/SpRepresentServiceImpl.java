package com.aotuspace.web.spuser.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aotuspace.web.spuser.mapper.application.SpAnchorApplicationDetailMapper;
import com.aotuspace.web.spuser.mapper.application.SpAnchorApplicationMapper;
import com.aotuspace.web.spuser.mapper.application.SpArtistApplicationMapper;
import com.aotuspace.web.spuser.model.po.application.custom.SpAnchorApplicationCustom;
import com.aotuspace.web.spuser.model.po.application.custom.SpArtistApplicationCustom;
import com.aotuspace.web.spuser.model.vo.user.SpUsersBinfoQueryVo;
import com.aotuspace.web.spuser.service.ISpRepresentService;


/**
 * 
 * Title:SpRepresentServiceImpl
 * Description:代言功能模块service实现类
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-9-10 下午1:30:28
 *
 */

@Transactional
@Service
public class SpRepresentServiceImpl implements ISpRepresentService {

	//申请主播代言基础信息mapper
	@Autowired
	SpAnchorApplicationMapper spAnchorApplicationMapper;
	//申请艺人代言基础信息mapper
	@Autowired
	SpArtistApplicationMapper spArtistApplicationMapper;
	
	//申请详细信息mapper
	@Autowired
	SpAnchorApplicationDetailMapper spAnchorApplicationDetailMapper;
	
	@Override
	public boolean saveRegisterAn(SpAnchorApplicationCustom spAnchorApplicationCustom) throws Exception {
		//插入详细返回id
		int insertRow=spAnchorApplicationDetailMapper.insertSelective(spAnchorApplicationCustom.getSpAnAppDetailC());
		if(insertRow>0){
			//设置基础信息设置详细信息id
			spAnchorApplicationCustom.setSpApplicationdetailid(spAnchorApplicationCustom.getSpAnAppDetailC().getSpId());
			insertRow=spAnchorApplicationMapper.insertSelective(spAnchorApplicationCustom);
			return true;
		}
		return false;
		
	}

	@Override
	public boolean saveRegisterAr(SpArtistApplicationCustom spArtistApplicationCustom) throws Exception {
		//插入详细返回id
		int insertRow=spAnchorApplicationDetailMapper.insertSelective(spArtistApplicationCustom.getSpArAppDetailC());
		if(insertRow>0){
			//设置基础信息设置详细信息id
			spArtistApplicationCustom.setSpApplicationdetailid(spArtistApplicationCustom.getSpArAppDetailC().getSpId());
			insertRow=spArtistApplicationMapper.insertSelective(spArtistApplicationCustom);
			return true;
		}
		return false;
	}

	
	@Override
	public void cancel() throws Exception {
		
	}


}
