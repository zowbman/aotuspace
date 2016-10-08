package com.aotuspace.web.listener;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * 
 * Title:SpSiteSesstionListener
 * Description:session监听器
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-12-19 上午11:27:57
 *
 */
public class SpSiteSesstionListener implements HttpSessionListener{
	
	private static Map<String, HttpSession> sessions=new HashMap<String, HttpSession>();

	//session创建
	@Override
	public void sessionCreated(HttpSessionEvent sessionEvent) {
		sessions.put(sessionEvent.getSession().getId(), sessionEvent.getSession());
	}

	//session销毁
	@Override
	public void sessionDestroyed(HttpSessionEvent sessionEvent) {
		//当session摧毁从map对象删除
		sessions.remove(sessionEvent.getSession().getId());
	}
	
	/**
	 * 获取session
	 * @param sessionId
	 * @return
	 */
	public static HttpSession getSession(String sessionId){
		return sessions.get(sessionId);
	}
	
	/**
	 * 删除cookie中的sessionid
	 * @param sessionID
	 */
	public static void removeSession(String sessionID){
		if(sessions.containsKey(sessionID))
			sessions.remove(sessionID);
	}
}
