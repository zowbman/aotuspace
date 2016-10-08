package com.aotuspace.web.spuser.mapper.priv.custom;

import java.util.Collection;
import java.util.Set;


public interface SpAotuspacePrivMapperCustom {
	//查询
	Collection<String> findAllSpAotuspacePrivUrls();
	
	//用户查询权限
	Set<SpAotuspacePrivMapperCustom> findPrivsByUserId();
	
}
