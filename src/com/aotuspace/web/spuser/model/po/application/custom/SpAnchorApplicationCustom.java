package com.aotuspace.web.spuser.model.po.application.custom;

import com.aotuspace.web.spuser.model.po.application.SpAnchorApplication;

/**
 * 
 * Title:SpAnchorApplicationCustom
 * Description:代言主播申请扩展类
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-12-4 下午2:40:52
 *
 */
public class SpAnchorApplicationCustom extends SpAnchorApplication {

	//代言主播详情扩展类
	private SpAnchorApplicationDetailCustom spAnAppDetailC;

	public SpAnchorApplicationDetailCustom getSpAnAppDetailC() {
		return spAnAppDetailC;
	}

	public void setSpAnAppDetailC(SpAnchorApplicationDetailCustom spAnAppDetailC) {
		this.spAnAppDetailC = spAnAppDetailC;
	}

}
