package com.aotuspace.web.spuser.mapper.priv.custom;

import java.util.Set;

import com.aotuspace.web.spuser.model.po.priv.custom.SpAotuspaceUserRoleCustom;

/**
 * 
 * Title:SpAotuspaceUserRoleMapper
 * Description:�û���ɫ��չmapper
 * Company:aotuspace
 * @author    ΰ��
 * @date      2015-9-14 ����7:48:51
 *
 */
public interface SpAotuspaceUserRoleMapperCustom {
	//Ȩ��ģ�����UserId��ѯRoles
	Set<SpAotuspaceUserRoleCustom> findRolesByUserId() throws Exception;
}