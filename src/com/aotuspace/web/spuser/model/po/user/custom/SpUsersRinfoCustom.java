package com.aotuspace.web.spuser.model.po.user.custom;

import com.aotuspace.web.spuser.model.po.user.SpUsersRinfo;

/**
 * 
 * Title:SpUsersRinfoCustom
 * Description:�û���ʵ��Ϣ��չ��
 * Company:aotuspace
 * @author    ΰ��
 * @date      2015-12-26 ����12:44:28
 *
 */
public class SpUsersRinfoCustom extends SpUsersRinfo {
	//���캯��
	public SpUsersRinfoCustom(){};
	
	public SpUsersRinfoCustom(Integer spId,Integer spAtuid){
		this.spId=spId;
		this.spAtuid=spAtuid;
	};
	
}
