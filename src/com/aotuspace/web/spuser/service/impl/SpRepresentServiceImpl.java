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
 * Description:���Թ���ģ��serviceʵ����
 * Company:aotuspace
 * @author    ΰ��
 * @date      2015-9-10 ����1:30:28
 *
 */

@Transactional
@Service
public class SpRepresentServiceImpl implements ISpRepresentService {

	//�����������Ի�����Ϣmapper
	@Autowired
	SpAnchorApplicationMapper spAnchorApplicationMapper;
	//�������˴��Ի�����Ϣmapper
	@Autowired
	SpArtistApplicationMapper spArtistApplicationMapper;
	
	//������ϸ��Ϣmapper
	@Autowired
	SpAnchorApplicationDetailMapper spAnchorApplicationDetailMapper;
	
	@Override
	public boolean saveRegisterAn(SpAnchorApplicationCustom spAnchorApplicationCustom) throws Exception {
		//������ϸ����id
		int insertRow=spAnchorApplicationDetailMapper.insertSelective(spAnchorApplicationCustom.getSpAnAppDetailC());
		if(insertRow>0){
			//���û�����Ϣ������ϸ��Ϣid
			spAnchorApplicationCustom.setSpApplicationdetailid(spAnchorApplicationCustom.getSpAnAppDetailC().getSpId());
			insertRow=spAnchorApplicationMapper.insertSelective(spAnchorApplicationCustom);
			return true;
		}
		return false;
		
	}

	@Override
	public boolean saveRegisterAr(SpArtistApplicationCustom spArtistApplicationCustom) throws Exception {
		//������ϸ����id
		int insertRow=spAnchorApplicationDetailMapper.insertSelective(spArtistApplicationCustom.getSpArAppDetailC());
		if(insertRow>0){
			//���û�����Ϣ������ϸ��Ϣid
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
