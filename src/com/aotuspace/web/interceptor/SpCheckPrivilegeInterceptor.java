package com.aotuspace.web.interceptor;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.ModelAndView;

import com.aotuspace.web.listener.SpSiteSesstionListener;
import com.aotuspace.web.spgoods.model.po.shopping.SpBuyCar;
import com.aotuspace.web.spuser.model.po.user.custom.SpUsersBinfoCustom;
import com.aotuspace.web.util.WebUtil;

/**
 * 
 * Title:SpCheckPrivilegeInterceptor
 * Description:���Ȩ��������
 * Company:autospace
 * @author    zwb
 * @date      2015��9��12�� ����12:25:38
 *
 */
public class SpCheckPrivilegeInterceptor implements HandlerInterceptor {

	//����Handler����ǰ
	@Override
	public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
			Object handler) throws Exception {
		//׼����Ϣ
		//1.��ȡ��ǰaotuspace�û�(Session)
		SpUsersBinfoCustom spUsersBinfoCustom=(SpUsersBinfoCustom) httpServletRequest.getSession().getAttribute("spUser");
		if(spUsersBinfoCustom==null){//���session���ڿգ�����֮ǰ�Ƿ���session
			String sid = WebUtil.getCookieByName(httpServletRequest, "spUserId");
			if(sid!=null){
				HttpSession session = SpSiteSesstionListener.getSession(sid);
				if (session != null) {
					spUsersBinfoCustom = (SpUsersBinfoCustom) session.getAttribute("spUser");
					if (spUsersBinfoCustom != null) {
						SpSiteSesstionListener.removeSession(sid);
						httpServletRequest.getSession().setAttribute("spUser", spUsersBinfoCustom);
						WebUtil.addCookie(httpServletResponse, "spUserId", httpServletRequest.getSession().getId(), httpServletRequest.getSession().getMaxInactiveInterval());
					}
				}
			}
		}
		
		//System.out.println(httpServletRequest.getServletContext().getAttribute("allAotuspacePrivUrls"));
		//��ȡ������ַ
		Collection<String> pubUrls=(Collection<String>) httpServletRequest.getServletContext().getAttribute("pubUrls");
		//2.��ȡ�������·����Ϣ
		//��ȡ��ǰ��Ŀ��Ŀ¼
		//String _requestPath=httpServletRequest.getContextPath();
		//��ȡ����·��������Ŀ·����
		//String _requestUri=httpServletRequest.getRequestURI();
		//ȥ����Ŀ·�����������·��
		//String _url=_requestUri.substring(_requestPath.length());
		//���ƥ��·��
		String _url=null;
		if(handler instanceof HandlerMethod){
			_url = (String)httpServletRequest.getAttribute(
	                HandlerMapping.BEST_MATCHING_PATTERN_ATTRIBUTE);
		}
		//System.out.println(httpServletRequest.getRequestURI());
		//��־��¼
		//...
		//System.out.println("this url--->"+_url);
		//�ж�Session���û��Ƿ�Ϊ��
		if(spUsersBinfoCustom==null){//�û���ϢΪ��
			//�ж��Ƿ�ȥ��½
			//������ַ
			if(pubUrls.contains(_url)){
				//ȥ��½(����)
				return true;
			}else{//����ȥ��½��
				httpServletRequest.getRequestDispatcher("/u/login").forward(httpServletRequest, httpServletResponse);
			}
		}else{
			//�����û���Ϣ
			//�ж��Ƿ���Ȩ��
			if(spUsersBinfoCustom.hasPrivilegeByUrl(_url)){//�У����У�
				return true;
			}
		
		}
		//û�У����أ�����ת����ʾ��Ϣ��
		return false;
	}
	
	//ִ��Handler�������ڷ���ModelAndView֮ǰ
	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	//ִ����Handler����
	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		// TODO Auto-generated method stub

	}

	
	
	

}
