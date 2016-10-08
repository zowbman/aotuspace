package com.aotuspace.web.spuser.service.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;

import com.aotuspace.web.spuser.mapper.priv.custom.SpAotuspacePrivMapperCustom;
import com.aotuspace.web.spuser.service.ISpPrivilegeService;

/**
 * 
 * Title:SpPrivilegeServiceImpl
 * Description:权限业务service实现类
 * Company:autospace
 * @author    zwb
 * @date      2015年9月12日 上午12:53:47
 *
 */
public class SpPrivilegeServiceImpl implements ISpPrivilegeService {

	@Autowired
	SpAotuspacePrivMapperCustom spAotuspacePrivMapperCustom;

	//获取aotuspace全部url非空权限
	@Override
	public Collection<String> findAllSpAotuspacePrivUrls() {
		return spAotuspacePrivMapperCustom.findAllSpAotuspacePrivUrls();
	}

}
