package com.aotuspace.web.spuser.mapper.priv.custom;

import java.util.Set;

import com.aotuspace.web.spuser.model.po.priv.custom.SpAotuspaceUserPrivCustom;

/**
 * 
 * Title:SpAotuspaceUsersPrivMapper
 * Description:�û�Ȩ����չmapper
 * Company:aotuspace
 * @author    ΰ��
 * @date      2015-9-13 ����8:38:52
 *
 */
public interface SpAotuspaceUserPrivMapperCustom {
	Set<SpAotuspaceUserPrivCustom> findPrivsByUserId() throws Exception;
}