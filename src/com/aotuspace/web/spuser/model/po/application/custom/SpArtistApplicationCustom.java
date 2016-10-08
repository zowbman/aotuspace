package com.aotuspace.web.spuser.model.po.application.custom;

import com.aotuspace.web.spuser.model.po.application.SpArtistApplication;

/**
 * 
 * Title:SpArtistApplicationCustom Description:申请艺人代言扩展类 Company:aotuspace
 * 
 * @author 伟宝
 * @date 2015-12-7 下午7:01:47
 *
 */
public class SpArtistApplicationCustom extends SpArtistApplication {

	// 详细
	private SpAnchorApplicationDetailCustom spArAppDetailC;

	public SpAnchorApplicationDetailCustom getSpArAppDetailC() {
		return spArAppDetailC;
	}

	public void setSpArAppDetailC(SpAnchorApplicationDetailCustom spArAppDetailC) {
		this.spArAppDetailC = spArAppDetailC;
	}

}
