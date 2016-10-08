package com.aotuspace.web.spuser.model.po.user.custom;

import com.aotuspace.web.spuser.model.po.user.SpUsersRinfo;

/**
 * 
 * Title:SpUsersRinfoCustom
 * Description:用户真实信息扩展类
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-12-26 下午12:44:28
 *
 */
public class SpUsersRinfoCustom extends SpUsersRinfo {
	//构造函数
	public SpUsersRinfoCustom(){};
	
	public SpUsersRinfoCustom(Integer spId,Integer spAtuid){
		this.spId=spId;
		this.spAtuid=spAtuid;
	};
	
}
