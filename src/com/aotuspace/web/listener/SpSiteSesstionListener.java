package com.aotuspace.web.listener;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * 
 * Title:SpSiteSesstionListener
 * Description:session������
 * Company:aotuspace
 * @author    ΰ��
 * @date      2015-12-19 ����11:27:57
 *
 */
public class SpSiteSesstionListener implements HttpSessionListener{
	
	private static Map<String, HttpSession> sessions=new HashMap<String, HttpSession>();

	//session����
	@Override
	public void sessionCreated(HttpSessionEvent sessionEvent) {
		sessions.put(sessionEvent.getSession().getId(), sessionEvent.getSession());
	}

	//session����
	@Override
	public void sessionDestroyed(HttpSessionEvent sessionEvent) {
		//��session�ݻٴ�map����ɾ��
		sessions.remove(sessionEvent.getSession().getId());
	}
	
	/**
	 * ��ȡsession
	 * @param sessionId
	 * @return
	 */
	public static HttpSession getSession(String sessionId){
		return sessions.get(sessionId);
	}
	
	/**
	 * ɾ��cookie�е�sessionid
	 * @param sessionID
	 */
	public static void removeSession(String sessionID){
		if(sessions.containsKey(sessionID))
			sessions.remove(sessionID);
	}
}
