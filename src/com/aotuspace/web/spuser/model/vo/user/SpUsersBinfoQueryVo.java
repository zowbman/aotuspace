package com.aotuspace.web.spuser.model.vo.user;

import com.aotuspace.web.spuser.model.po.user.SpUsersBinfo;
import com.aotuspace.web.spuser.model.po.user.custom.SpUsersBinfoCustom;

/**
 * 
 * Title:SpUsersBinfoQueryVo
 * Description:�û�������Ϣ��װ�ࣨǰ�˲�����po��
 * Company:aotuspace
 * @author    ΰ��
 * @date      2015-9-10 ����11:02:43
 *
 */
public class SpUsersBinfoQueryVo {
	
	private SpUsersBinfo spUser;
	
	//����ȷ������
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
