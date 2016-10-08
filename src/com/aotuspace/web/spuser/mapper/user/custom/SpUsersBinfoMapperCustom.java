package com.aotuspace.web.spuser.mapper.user.custom;

import com.aotuspace.web.spuser.model.po.user.custom.SpUsersBinfoCustom;
import com.aotuspace.web.spuser.model.vo.user.SpUsersBinfoQueryVo;

/**
 * 
 * Title:SpUsersBinfoMapperCustom
 * Description:用户基本信息扩展mapper
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-9-12 下午7:16:35
 *
 */
public interface SpUsersBinfoMapperCustom {
	//查询最大aotuId
	Integer findSpUserMaxAotuId() throws Exception;

	//检查用户名
	Integer findSpUserByAccount(String SpAccount) throws Exception;

	//登录
	SpUsersBinfoCustom findSpUserBySpAccountAndSpPassword(
			SpUsersBinfoQueryVo spUsersBinfoQueryVo) throws Exception;

	//注册
	void saveSpUser() throws Exception;
	
	/**
	 * 查询用户基础信息（可公开）
	 * @param aotuId
	 * @return
	 * @throws Exception
	 */
	SpUsersBinfoCustom findSpUserBaseInfoByAotuId(Integer aotuId)throws Exception;

}
