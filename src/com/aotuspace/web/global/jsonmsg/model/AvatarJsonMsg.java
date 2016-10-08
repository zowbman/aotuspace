package com.aotuspace.web.global.jsonmsg.model;

import java.util.List;

/**
 * �ϴ�ͷ�񣬷�������
 * Title:AvatarJsonMsg
 * Description:
 * Company:aotuspace
 * @author    ΰ��
 * @date      2015-12-28 ����2:21:28
 *
 */
public class AvatarJsonMsg {
	//�����Ƿ��ϴ��ɹ�
	private boolean success;
	//�Զ��帽����Ϣ
	private String msg;
	//ԭͼ�����ַ
	private String sourceUrl;
	//����ͷ��ͼƬ�ı����ַ
	private List<String> avatarUrls;
	
	public AvatarJsonMsg(){}
	
	public AvatarJsonMsg(boolean success, String msg) {
		this.success = success;
		this.msg = msg;
	}
	
	public static AvatarJsonMsg successAvatarJsonMsg() {
		return new AvatarJsonMsg(true, "����ɹ�");
	}

	public static AvatarJsonMsg errorAvatarJsonMsg() {
		return new AvatarJsonMsg(false, "����ʧ��");
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getSourceUrl() {
		return sourceUrl;
	}

	public void setSourceUrl(String sourceUrl) {
		this.sourceUrl = sourceUrl;
	}

	public List<String> getAvatarUrls() {
		return avatarUrls;
	}

	public void setAvatarUrls(List<String> avatarUrls) {
		this.avatarUrls = avatarUrls;
	}

}
