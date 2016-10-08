package com.aotuspace.web.spuser.mapper.user.custom;

import com.aotuspace.web.spuser.model.po.user.custom.SpUsersBinfoCustom;
import com.aotuspace.web.spuser.model.vo.user.SpUsersBinfoQueryVo;

/**
 * 
 * Title:SpUsersBinfoMapperCustom
 * Description:�û�������Ϣ��չmapper
 * Company:aotuspace
 * @author    ΰ��
 * @date      2015-9-12 ����7:16:35
 *
 */
public interface SpUsersBinfoMapperCustom {
	//��ѯ���aotuId
	Integer findSpUserMaxAotuId() throws Exception;

	//����û���
	Integer findSpUserByAccount(String SpAccount) throws Exception;

	//��¼
	SpUsersBinfoCustom findSpUserBySpAccountAndSpPassword(
			SpUsersBinfoQueryVo spUsersBinfoQueryVo) throws Exception;

	//ע��
	void saveSpUser() throws Exception;
	
	/**
	 * ��ѯ�û�������Ϣ���ɹ�����
	 * @param aotuId
	 * @return
	 * @throws Exception
	 */
	SpUsersBinfoCustom findSpUserBaseInfoByAotuId(Integer aotuId)throws Exception;

}
