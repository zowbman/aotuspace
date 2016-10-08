package com.aotuspace.web.spuser.service;

import com.aotuspace.web.spuser.model.po.application.custom.SpAnchorApplicationCustom;
import com.aotuspace.web.spuser.model.po.application.custom.SpArtistApplicationCustom;
import com.aotuspace.web.spuser.model.vo.user.SpUsersBinfoQueryVo;

/**
 * 
 * Title:ISpRepresentService
 * Description:���Թ���ģ��service�ӿ�
 * Company:aotuspace
 * @author    ΰ��
 * @date      2015-9-10 ����1:21:23
 *
 */
public interface ISpRepresentService {

	/**
	 * �����������
	 * @param spAnchorApplicationCustom
	 * @throws Exception
	 */
	public boolean saveRegisterAn(SpAnchorApplicationCustom spAnchorApplicationCustom) throws Exception;

	/**
	 * �����������
	 * @param spAnchorApplicationCustom
	 * @throws Exception
	 */
	public boolean saveRegisterAr(SpArtistApplicationCustom spArtistApplicationCustom) throws Exception;

	/**
	 * ������ݽ�Լ
	 * @throws Exception
	 */
	public void cancel() throws Exception;

}
