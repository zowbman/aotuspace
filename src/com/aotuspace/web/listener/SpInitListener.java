package com.aotuspace.web.listener;

import java.util.Collection;
import java.util.ResourceBundle;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.aotuspace.web.spuser.service.ISpPrivilegeService;
import com.aotuspace.web.util.CustomUtil;

/**
 * 
 * Title:InitListener
 * Description:��ʼ��������
 * Company:autospace
 * @author    zwb
 * @date      2015��9��11�� ����11:57:27
 *
 */
public class SpInitListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		
		
	}
	
	//׼����ʼ������
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		//��ʼ��aotuspaceȨ������
		//��ȡspring������ص�service����
		ApplicationContext ac=WebApplicationContextUtils.getWebApplicationContext(sce.getServletContext());
		//��ȡȨ��service��javabean
		ISpPrivilegeService iSpPrivilegeService=(ISpPrivilegeService) ac.getBean("iSpPrivilegeService");
		//��ȡ����Ȩ��
		Collection<String> allAotuspacePrivUrls=iSpPrivilegeService.findAllSpAotuspacePrivUrls();
		sce.getServletContext().setAttribute("allAotuspacePrivUrls", allAotuspacePrivUrls);
		System.out.println("<!----��׼��allAotuspacePrivUrls----!>");
		//��ȡ�����ļ�������ַ
		ResourceBundle bundle = ResourceBundle.getBundle("pubUrls"); 
		String pubUrls=bundle.getString("aotuspace.pubUrls");
		//�ַ�������
		Collection<String> collection = CustomUtil.stringToCollection(pubUrls);
		sce.getServletContext().setAttribute("pubUrls", collection);
		System.out.println("<!----��׼��PubUrls----!>");
	}
}
