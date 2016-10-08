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
 * Description:初始化监听器
 * Company:autospace
 * @author    zwb
 * @date      2015年9月11日 下午11:57:27
 *
 */
public class SpInitListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		
		
	}
	
	//准备初始化数据
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		//初始化aotuspace权限数据
		//获取spring容器相关的service对象
		ApplicationContext ac=WebApplicationContextUtils.getWebApplicationContext(sce.getServletContext());
		//获取权限service的javabean
		ISpPrivilegeService iSpPrivilegeService=(ISpPrivilegeService) ac.getBean("iSpPrivilegeService");
		//获取所有权限
		Collection<String> allAotuspacePrivUrls=iSpPrivilegeService.findAllSpAotuspacePrivUrls();
		sce.getServletContext().setAttribute("allAotuspacePrivUrls", allAotuspacePrivUrls);
		System.out.println("<!----已准备allAotuspacePrivUrls----!>");
		//获取配置文件公开地址
		ResourceBundle bundle = ResourceBundle.getBundle("pubUrls"); 
		String pubUrls=bundle.getString("aotuspace.pubUrls");
		//字符串操作
		Collection<String> collection = CustomUtil.stringToCollection(pubUrls);
		sce.getServletContext().setAttribute("pubUrls", collection);
		System.out.println("<!----已准备PubUrls----!>");
	}
}
