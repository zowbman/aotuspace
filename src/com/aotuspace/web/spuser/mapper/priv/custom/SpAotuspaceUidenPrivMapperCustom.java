package com.aotuspace.web.spuser.mapper.priv.custom;

import java.util.Set;

import com.aotuspace.web.spuser.model.po.priv.custom.SpAotuspaceUidenPrivCustom;

/**
 * 
 * Title:SpAotuspaceUidenPrivMapper
 * Description:���Ȩ����չmapper
 * Company:aotuspace
 * @author    ΰ��
 * @date      2015-9-13 ����8:38:42
 *
 */
public interface SpAotuspaceUidenPrivMapperCustom {
	Set<SpAotuspaceUidenPrivCustom> findPrivsByUidenId() throws Exception;
}