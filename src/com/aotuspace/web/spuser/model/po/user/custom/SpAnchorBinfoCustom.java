package com.aotuspace.web.spuser.model.po.user.custom;

import com.aotuspace.web.spuser.model.po.user.SpAnchorBinfo;

/**
 * 
 * Title:SpAnchorBinfoCustom
 * Description:������Ϣ��չ��
 * Company:aotuspace
 * @author    ΰ��
 * @date      2015-12-28 ����6:26:46
 *
 */
public class SpAnchorBinfoCustom extends SpAnchorBinfo {
	//�û�������Ϣ
	private SpUsersBinfoCustom spUsersBinfoCustom;

	public SpUsersBinfoCustom getSpUsersBinfoCustom() {
		return spUsersBinfoCustom;
	}

	public void setSpUsersBinfoCustom(SpUsersBinfoCustom spUsersBinfoCustom) {
		this.spUsersBinfoCustom = spUsersBinfoCustom;
	}
	
	
}
