package com.aotuspace.web.spuser.mapper.priv.custom;

import java.util.Set;

import com.aotuspace.web.spuser.model.po.priv.custom.SpAotuspaceUidenPrivCustom;

/**
 * 
 * Title:SpAotuspaceUidenPrivMapper
 * Description:身份权限扩展mapper
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-9-13 下午8:38:42
 *
 */
public interface SpAotuspaceUidenPrivMapperCustom {
	Set<SpAotuspaceUidenPrivCustom> findPrivsByUidenId() throws Exception;
}