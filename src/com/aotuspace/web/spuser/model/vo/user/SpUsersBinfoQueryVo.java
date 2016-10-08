package com.aotuspace.web.spuser.model.vo.user;

import com.aotuspace.web.spuser.model.po.user.SpUsersBinfo;
import com.aotuspace.web.spuser.model.po.user.custom.SpUsersBinfoCustom;

/**
 * 
 * Title:SpUsersBinfoQueryVo
 * Description:用户基本信息包装类（前端参数绑定po）
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-9-10 上午11:02:43
 *
 */
public class SpUsersBinfoQueryVo {
	
	private SpUsersBinfo spUser;
	
	//二次确认密码
	private String repPass;

	private SpUsersBinfoCustom spUserC;

	public SpUsersBinfo getSpUser() {
		return spUser;
	}

	public void setSpUser(SpUsersBinfo spUser) {
		this.spUser = spUser;
	}

	public SpUsersBinfoCustom getSpUserC() {
		return spUserC;
	}

	public void setSpUserC(SpUsersBinfoCustom spUserC) {
		this.spUserC = spUserC;
	}

	public String getRepPass() {
		return repPass;
	}

	public void setRepPass(String repPass) {
		this.repPass = repPass;
	}
	
	
}
