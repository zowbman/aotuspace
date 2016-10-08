package com.aotuspace.web.spuser.mapper.priv.custom;

import java.util.Set;

import com.aotuspace.web.spuser.model.po.priv.custom.SpAotuspaceUserPrivCustom;

/**
 * 
 * Title:SpAotuspaceUsersPrivMapper
 * Description:用户权限扩展mapper
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-9-13 下午8:38:52
 *
 */
public interface SpAotuspaceUserPrivMapperCustom {
	Set<SpAotuspaceUserPrivCustom> findPrivsByUserId() throws Exception;
}