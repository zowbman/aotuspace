package com.aotuspace.web.spuser.model.po.user.custom;

import com.aotuspace.web.spuser.model.po.user.SpUsersAvatar;

/**
 * 
 * Title:SpUsersAvatarCustom
 * Description:头像扩展类
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-12-28 上午11:12:55
 *
 */
public class SpUsersAvatarCustom extends SpUsersAvatar {

	//构造函数
	public SpUsersAvatarCustom(){}
	public SpUsersAvatarCustom(String spAvatar){
		this.spAvatar=spAvatar;
	}
	public SpUsersAvatarCustom(String spAvatar,Integer spAvatarid ){
		this.spAvatar=spAvatar;
		this.spAvatarid=spAvatarid;
	}
}
