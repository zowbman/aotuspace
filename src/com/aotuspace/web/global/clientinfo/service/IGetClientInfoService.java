package com.aotuspace.web.global.clientinfo.service;

import javax.servlet.http.HttpServletRequest;

/**
 * 
 * Title:IGetClientInfoService
 * Description:��ȡ�ͻ�����Ϣ�ӿ�
 * Company:aotuspace
 * @author    ΰ��
 * @date      2015-9-15 ����2:59:54
 *
 */

public interface IGetClientInfoService {
	//��ȡ�ͻ�����ʵIp
	String findClientIp(HttpServletRequest httpServletRequest) throws Exception;
	//���ݿͻ���IP��ַ��ȡ���ڵ�
	void findClientAddress(String httpArg)throws Exception;
	
}
