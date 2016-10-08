package com.aotuspace.web.spuser.mapper.user.custom;

import com.aotuspace.web.spuser.model.po.user.custom.SpAnchorBinfoCustom;


/**
 * 
 * Title:SpAnchorBinfoMapper扩展
 * Description:代言主播基础信息mapper
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-12-14 下午12:00:09
 *
 */
public interface SpAnchorBinfoMapperCustom {
 
	/**
	 * 根据id查询主播扩展信息类
	 * @param spId
	 * @return
	 * @throws Exception
	 */
	SpAnchorBinfoCustom findSpAnchorBySpId(Integer spId) throws Exception;
}