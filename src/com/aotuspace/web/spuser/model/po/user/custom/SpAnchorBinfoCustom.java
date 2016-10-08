package com.aotuspace.web.spuser.model.po.user.custom;

import com.aotuspace.web.spuser.model.po.user.SpAnchorBinfo;

/**
 * 
 * Title:SpAnchorBinfoCustom
 * Description:主播信息扩展类
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-12-28 下午6:26:46
 *
 */
public class SpAnchorBinfoCustom extends SpAnchorBinfo {
	//用户基本信息
	private SpUsersBinfoCustom spUsersBinfoCustom;

	public SpUsersBinfoCustom getSpUsersBinfoCustom() {
		return spUsersBinfoCustom;
	}

	public void setSpUsersBinfoCustom(SpUsersBinfoCustom spUsersBinfoCustom) {
		this.spUsersBinfoCustom = spUsersBinfoCustom;
	}
	
	
}
