package com.aotuspace.web.global.jsonmsg.model;

/**
 * 
 * Title:JsonMsg
 * Description:返回json信息
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-11-30 下午3:13:05
 *
 */

public class JsonMsg {
	private Integer spCode;//代码
	private String spMsg;//信息
	private String spSkipUrl;//跳转地址
	private Object spData;//数据

	/**
	 * 
	 * @param spCode代码
	 * @param spMsg信息
	 * @param spSkipUrl 跳转地址
	 * @param spData 数据
	 */
	public JsonMsg(Integer spCode, String spMsg, String spSkipUrl, Object spData) {
		this.spCode = spCode;
		this.spMsg = spMsg;
		this.spSkipUrl = spSkipUrl;
		this.spData = spData;
	}

	public static JsonMsg successJsonMsg() {
		return new JsonMsg(100000, "请求成功", null, null);
	}

	public static JsonMsg errorJsonMsg() {
		return new JsonMsg(400000, "请求失败", null, null);
	}

	//private Object spData;//数据
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
