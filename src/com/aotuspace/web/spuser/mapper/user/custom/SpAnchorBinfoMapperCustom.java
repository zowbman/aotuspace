package com.aotuspace.web.spuser.mapper.user.custom;

import com.aotuspace.web.spuser.model.po.user.custom.SpAnchorBinfoCustom;


/**
 * 
 * Title:SpAnchorBinfoMapper��չ
 * Description:��������������Ϣmapper
 * Company:aotuspace
 * @author    ΰ��
 * @date      2015-12-14 ����12:00:09
 *
 */
public interface SpAnchorBinfoMapperCustom {
 
	/**
	 * ����id��ѯ������չ��Ϣ��
	 * @param spId
	 * @return
	 * @throws Exception
	 */
	SpAnchorBinfoCustom findSpAnchorBySpId(Integer spId) throws Exception;
}