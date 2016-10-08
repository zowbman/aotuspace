package com.aotuspace.web.global.clientinfo.service.impl;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.aotuspace.web.global.clientinfo.model.ClientInfo;
import com.aotuspace.web.global.clientinfo.service.IGetClientInfoService;
import com.aotuspace.web.util.CustomUtil;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 
 * Title:GetClientInfoServiceImpl
 * Description:��ȡ�ͻ�����Ϣ�ӿ�ʵ����
 * Company:aotuspace
 * @author    ΰ��
 * @date      2015-9-15 ����2:59:36
 *
 */
public class GetClientInfoServiceImpl implements IGetClientInfoService {

	@Override
	public String findClientIp(HttpServletRequest httpServletRequest)
			throws Exception {
		String _ipAddress = null;
		_ipAddress = httpServletRequest.getHeader("x-forwarded-for");
		if (_ipAddress == null || _ipAddress.length() == 0
				|| "unknown".equalsIgnoreCase(_ipAddress)) {
			_ipAddress = httpServletRequest.getHeader("Proxy-Client-IP");
		}
		if (_ipAddress == null || _ipAddress.length() == 0
				|| "unknown".equalsIgnoreCase(_ipAddress)) {
			_ipAddress = httpServletRequest.getHeader("WL-Proxy-Client-IP");
		}
		if (_ipAddress == null || _ipAddress.length() == 0
				|| "unknow".equalsIgnoreCase(_ipAddress)) {
			_ipAddress = httpServletRequest.getRemoteAddr();
			if (_ipAddress.equals("172.0.0.1")) {
				//��������ȡ�������õ�IP
				InetAddress inet = null;
				try {
					inet = inet.getLocalHost();
				} catch (UnknownHostException e) {
					e.printStackTrace();
				}
				_ipAddress = inet.getHostAddress();
			}
		}
		//���ڶ�������������һ��IPΪ�ͻ�����ʵIP�����IP����','�ָ�
		if (_ipAddress != null && _ipAddress.length() > 15) {
			if (_ipAddress.indexOf(",") > 0) {
				_ipAddress = _ipAddress.substring(0, _ipAddress.indexOf(","));
			}
		}
		//��String�Զ���','���������ַ�����תΪList��ȡ��һ��Ip
		List<String> _ipAddressList = CustomUtil.stringToList(_ipAddress);
		if(_ipAddressList!=null&&_ipAddressList.size()>0){
			return _ipAddressList.get(0);
		}
		return null;
	}

	//��ȡ�ͻ��˵�ַ
	@Override
	public void findClientAddress(String httpArg) throws Exception {
		//�ӿڵ�ַ
		String httpUrl="http://apis.baidu.com/apistore/iplookupservice/iplookup";
		//key
		String apiKey="ce409d1e9eddd486a2de1dc390f380a2";
		BufferedReader reader=null;
		String result=null;
		StringBuffer sbf=new StringBuffer();
		httpUrl=httpUrl+"?"+httpArg;
		try {
	        URL url = new URL(httpUrl);
	        HttpURLConnection connection = (HttpURLConnection) url
	                .openConnection();
	        connection.setRequestMethod("GET");
	        // ����apikey��HTTP header
	        connection.setRequestProperty("apikey",  apiKey);
	        connection.connect();
	        InputStream is = connection.getInputStream();
	        reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
	        String strRead = null;
	        while ((strRead = reader.readLine()) != null) {
	            sbf.append(strRead);
	            sbf.append("\r\n");
	        }
	        reader.close();
	        result = sbf.toString();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
		ObjectMapper objectMapper=new ObjectMapper();
		ClientInfo clientInfo=objectMapper.readValue(result, ClientInfo.class);
		System.out.println(result);
	}
	
	
}
