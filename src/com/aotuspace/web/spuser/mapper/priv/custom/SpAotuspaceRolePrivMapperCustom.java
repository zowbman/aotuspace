package com.aotuspace.web.spuser.mapper.priv.custom;

import java.util.Set;

import com.aotuspace.web.spuser.model.po.priv.custom.SpAotuspacePrivCustom;

/**
 * 
 * Title:SpAotuspaceRolePrivMapper
 * Description:��ɫȨ����չmapper
 * Company:aotuspace
 * @author    ΰ��
 * @date      2015-9-13 ����8:38:30
 *
 */
public interface SpAotuspaceRolePrivMapperCustom {
	//Ȩ��ģ�����RoleId��ѯȨ��
	Set<SpAotuspacePrivCustom> findPrivsByRoleId() throws Exception;

}