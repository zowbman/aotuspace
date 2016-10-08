package com.aotuspace.web.spuser.mapper.priv.custom;

import java.util.Set;

import com.aotuspace.web.spuser.model.po.priv.custom.SpAotuspacePrivCustom;

/**
 * 
 * Title:SpAotuspaceRolePrivMapper
 * Description:角色权限扩展mapper
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-9-13 下午8:38:30
 *
 */
public interface SpAotuspaceRolePrivMapperCustom {
	//权限模块根据RoleId查询权限
	Set<SpAotuspacePrivCustom> findPrivsByRoleId() throws Exception;

}