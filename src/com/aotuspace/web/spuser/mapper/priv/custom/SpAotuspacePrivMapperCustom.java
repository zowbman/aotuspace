package com.aotuspace.web.spuser.mapper.priv.custom;

import java.util.Collection;
import java.util.Set;


public interface SpAotuspacePrivMapperCustom {
	//��ѯ
	Collection<String> findAllSpAotuspacePrivUrls();
	
	//�û���ѯȨ��
	Set<SpAotuspacePrivMapperCustom> findPrivsByUserId();
	
}
