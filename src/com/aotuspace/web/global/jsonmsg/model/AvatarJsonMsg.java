package com.aotuspace.web.global.jsonmsg.model;

import java.util.List;

/**
 * 上传头像，返回数据
 * Title:AvatarJsonMsg
 * Description:
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-12-28 下午2:21:28
 *
 */
public class AvatarJsonMsg {
	//代表是否上传成功
	private boolean success;
	//自定义附加信息
	private String msg;
	//原图保存地址
	private String sourceUrl;
	//所有头像图片的保存地址
	private List<String> avatarUrls;
	
	public AvatarJsonMsg(){}
	
	public AvatarJsonMsg(boolean success, String msg) {
		this.success = success;
		this.msg = msg;
	}
	
	public static AvatarJsonMsg successAvatarJsonMsg() {
		return new AvatarJsonMsg(true, "请求成功");
	}

	public static AvatarJsonMsg errorAvatarJsonMsg() {
		return new AvatarJsonMsg(false, "请求失败");
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
