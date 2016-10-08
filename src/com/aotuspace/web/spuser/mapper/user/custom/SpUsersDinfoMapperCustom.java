package com.aotuspace.web.spuser.mapper.user.custom;

import com.aotuspace.web.spuser.model.po.user.custom.SpUsersDinfoCustom;

/**
 * 
 * Title:SpUserDinfoMapper
 * Description:用户详细信息mapper扩展接口
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-12-26 上午11:33:43
 *
 */
public interface SpUsersDinfoMapperCustom {
	
	/**
	 * 根据凹凸id查询用户详细信息
	 * @param aotuId
	 * @return
	 * @throws Exception
	 */
	SpUsersDinfoCustom findSpUsersDInfoByAotuId(Integer aotuId) throws Exception;
}