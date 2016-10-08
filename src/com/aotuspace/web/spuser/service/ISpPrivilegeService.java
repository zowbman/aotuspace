package com.aotuspace.web.spuser.service;

import java.util.Collection;

/**
 * 
 * Title:ISpCheckPrivilegeService
 * Description:权限业务service接口
 * Company:autospace
 * @author    zwb
 * @date      2015年9月12日 上午12:51:07
 *
 */
public interface ISpPrivilegeService {
	//获取全部权限
	Collection<String> findAllSpAotuspacePrivUrls();
	
}
