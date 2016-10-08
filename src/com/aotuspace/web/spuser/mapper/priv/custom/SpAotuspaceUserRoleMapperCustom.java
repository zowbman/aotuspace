package com.aotuspace.web.spuser.mapper.priv.custom;

import java.util.Set;

import com.aotuspace.web.spuser.model.po.priv.custom.SpAotuspaceUserRoleCustom;

/**
 * 
 * Title:SpAotuspaceUserRoleMapper
 * Description:用户角色扩展mapper
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-9-14 下午7:48:51
 *
 */
public interface SpAotuspaceUserRoleMapperCustom {
	//权限模块根据UserId查询Roles
	Set<SpAotuspaceUserRoleCustom> findRolesByUserId() throws Exception;
}