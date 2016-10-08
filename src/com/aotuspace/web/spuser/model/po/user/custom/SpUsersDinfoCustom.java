package com.aotuspace.web.spuser.model.po.user.custom;

import com.aotuspace.web.spuser.model.po.user.SpUsersAvatar;
import com.aotuspace.web.spuser.model.po.user.SpUsersDinfo;

/**
 * 
 * Title:SpUsersDinfoCustom
 * Description:��ϸ��Ϣ��չ��
 * Company:aotuspace
 * @author    ΰ��
 * @date      2015-12-26 ����11:59:16
 *
 */
public class SpUsersDinfoCustom extends SpUsersDinfo{
	
	private SpUsersAvatar spUsersAvatar;
	
	//���캯��
	public SpUsersDinfoCustom(){}
	
	public SpUsersDinfoCustom(Integer spId,Integer spAtuid,String spNickname){
		this.spId=spId;
		this.spAtuid=spAtuid;
		this.spNickname=spNickname;
	}

	public SpUsersAvatar getSpUsersAvatar() {
		return spUsersAvatar;
	}

	public void setSpUsersAvatar(SpUsersAvatar spUsersAvatar) {
		this.spUsersAvatar = spUsersAvatar;
	}
	
	
	
	
}
