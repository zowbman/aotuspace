package com.aotuspace.web.global.clientinfo.model;

/**
 * 
 * Title:ClientInfo
 * Description:����ip��ַ��ѯapi������Ϣ
 * Company:aotuspace
 * @author    ΰ��
 * @date      2015-9-15 ����3:51:51
 *
 */
public class ClientInfo {
	private int errNum;
	private String errMsg;
	private ClientAddressData retData;

	public int getErrNum() {
		return errNum;
	}

	public void setErrNum(int errNum) {
		this.errNum = errNum;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	public ClientAddressData getRetData() {
		return retData;
	}

	public void setRetData(ClientAddressData retData) {
		this.retData = retData;
	}

}
