package com.aotuspace.web.spuser.mapper.user.custom;

import com.aotuspace.web.spuser.model.po.user.custom.SpUsersDinfoCustom;

/**
 * 
 * Title:SpUserDinfoMapper
 * Description:�û���ϸ��Ϣmapper��չ�ӿ�
 * Company:aotuspace
 * @author    ΰ��
 * @date      2015-12-26 ����11:33:43
 *
 */
public interface SpUsersDinfoMapperCustom {
	
	/**
	 * ���ݰ�͹id��ѯ�û���ϸ��Ϣ
	 * @param aotuId
	 * @return
	 * @throws Exception
	 */
	SpUsersDinfoCustom findSpUsersDInfoByAotuId(Integer aotuId) throws Exception;
}