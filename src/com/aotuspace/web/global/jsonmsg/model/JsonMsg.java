package com.aotuspace.web.global.jsonmsg.model;

/**
 * 
 * Title:JsonMsg
 * Description:����json��Ϣ
 * Company:aotuspace
 * @author    ΰ��
 * @date      2015-11-30 ����3:13:05
 *
 */

public class JsonMsg {
	private Integer spCode;//����
	private String spMsg;//��Ϣ
	private String spSkipUrl;//��ת��ַ
	private Object spData;//����

	/**
	 * 
	 * @param spCode����
	 * @param spMsg��Ϣ
	 * @param spSkipUrl ��ת��ַ
	 * @param spData ����
	 */
	public JsonMsg(Integer spCode, String spMsg, String spSkipUrl, Object spData) {
		this.spCode = spCode;
		this.spMsg = spMsg;
		this.spSkipUrl = spSkipUrl;
		this.spData = spData;
	}

	public static JsonMsg successJsonMsg() {
		return new JsonMsg(100000, "����ɹ�", null, null);
	}

	public static JsonMsg errorJsonMsg() {
		return new JsonMsg(400000, "����ʧ��", null, null);
	}

	//private Object spData;//����
	public Integer getSpCode() {
		return spCode;
	}

	public void setSpCode(Integer spCode) {
		this.spCode = spCode;
	}

	public String getSpMsg() {
		return spMsg;
	}

	public void setSpMsg(String spMsg) {
		this.spMsg = spMsg;
	}

	public String getSpSkipUrl() {
		return spSkipUrl;
	}

	public void setSpSkipUrl(String spSkipUrl) {
		this.spSkipUrl = spSkipUrl;
	}

	public Object getSpData() {
		return spData;
	}

	public void setSpData(Object spData) {
		this.spData = spData;
	}

}
