package com.aotuspace.web.spuser.service;

import java.util.Collection;

/**
 * 
 * Title:ISpCheckPrivilegeService
 * Description:Ȩ��ҵ��service�ӿ�
 * Company:autospace
 * @author    zwb
 * @date      2015��9��12�� ����12:51:07
 *
 */
public interface ISpPrivilegeService {
	//��ȡȫ��Ȩ��
	Collection<String> findAllSpAotuspacePrivUrls();
	
}
