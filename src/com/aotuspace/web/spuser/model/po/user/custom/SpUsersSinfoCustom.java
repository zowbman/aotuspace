package com.aotuspace.web.spuser.model.po.user.custom;

import com.aotuspace.web.spuser.model.po.user.SpUsersSinfo;

/**
 * 
 * Title:SpUsersRinfoCustom
 * Description:用户真实信息扩展类
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-12-26 下午12:44:28
 *
 */
public class SpUsersSinfoCustom extends SpUsersSinfo {
	//构造函数
	public SpUsersSinfoCustom(){};
	
	public SpUsersSinfoCustom(Integer spId,Integer spAtuid){
		this.spId=spId;
		this.spAtuid=spAtuid;
	};
	
}
