package com.aotuspace.web.spuser.model.po.user.custom;

import com.aotuspace.web.spuser.model.po.user.SpUsersAvatar;

/**
 * 
 * Title:SpUsersAvatarCustom
 * Description:ͷ����չ��
 * Company:aotuspace
 * @author    ΰ��
 * @date      2015-12-28 ����11:12:55
 *
 */
public class SpUsersAvatarCustom extends SpUsersAvatar {

	//���캯��
	public SpUsersAvatarCustom(){}
	public SpUsersAvatarCustom(String spAvatar){
		this.spAvatar=spAvatar;
	}
	public SpUsersAvatarCustom(String spAvatar,Integer spAvatarid ){
		this.spAvatar=spAvatar;
		this.spAvatarid=spAvatarid;
	}
}
