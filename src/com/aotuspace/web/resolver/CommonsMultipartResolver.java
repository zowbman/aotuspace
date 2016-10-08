package com.aotuspace.web.resolver;

import javax.servlet.http.HttpServletRequest;

/**
 * 
 * Title:CommonsMultipartResolver
 * Description:Í¼Æ¬ÉÏ´«½âÎöÆ÷
 * Company:aotuspace
 * @author    Î°±¦
 * @date      2015-12-26 ÏÂÎç5:42:41
 *
 */
public class CommonsMultipartResolver extends org.springframework.web.multipart.commons.CommonsMultipartResolver {

	@Override
	public boolean isMultipart(HttpServletRequest request) {
		String uri=request.getRequestURI();
		if(uri.indexOf("/aotuspace/u/changeAvatar!upload")>=0)
			return false;
		return super.isMultipart(request);
	}
}
