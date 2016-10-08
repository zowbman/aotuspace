package com.aotuspace.web.global.clientinfo.service;

import javax.servlet.http.HttpServletRequest;

/**
 * 
 * Title:IGetClientInfoService
 * Description:获取客户端信息接口
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-9-15 下午2:59:54
 *
 */

public interface IGetClientInfoService {
	//获取客户端真实Ip
	String findClientIp(HttpServletRequest httpServletRequest) throws Exception;
	//根据客户端IP地址获取所在地
	void findClientAddress(String httpArg)throws Exception;
	
}
