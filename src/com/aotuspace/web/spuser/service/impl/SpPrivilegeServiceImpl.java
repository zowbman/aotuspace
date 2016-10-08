package com.aotuspace.web.spuser.service.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;

import com.aotuspace.web.spuser.mapper.priv.custom.SpAotuspacePrivMapperCustom;
import com.aotuspace.web.spuser.service.ISpPrivilegeService;

/**
 * 
 * Title:SpPrivilegeServiceImpl
 * Description:Ȩ��ҵ��serviceʵ����
 * Company:autospace
 * @author    zwb
 * @date      2015��9��12�� ����12:53:47
 *
 */
public class SpPrivilegeServiceImpl implements ISpPrivilegeService {

	@Autowired
	SpAotuspacePrivMapperCustom spAotuspacePrivMapperCustom;

	//��ȡaotuspaceȫ��url�ǿ�Ȩ��
	@Override
	public Collection<String> findAllSpAotuspacePrivUrls() {
		return spAotuspacePrivMapperCustom.findAllSpAotuspacePrivUrls();
	}

}
