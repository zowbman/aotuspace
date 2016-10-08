package com.aotuspace.web.spuser.service;

import com.aotuspace.web.spuser.model.po.application.custom.SpAnchorApplicationCustom;
import com.aotuspace.web.spuser.model.po.application.custom.SpArtistApplicationCustom;
import com.aotuspace.web.spuser.model.vo.user.SpUsersBinfoQueryVo;

/**
 * 
 * Title:ISpRepresentService
 * Description:代言功能模块service接口
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-9-10 下午1:21:23
 *
 */
public interface ISpRepresentService {

	/**
	 * 申请代言主播
	 * @param spAnchorApplicationCustom
	 * @throws Exception
	 */
	public boolean saveRegisterAn(SpAnchorApplicationCustom spAnchorApplicationCustom) throws Exception;

	/**
	 * 申请代言艺人
	 * @param spAnchorApplicationCustom
	 * @throws Exception
	 */
	public boolean saveRegisterAr(SpArtistApplicationCustom spArtistApplicationCustom) throws Exception;

	/**
	 * 代言身份解约
	 * @throws Exception
	 */
	public void cancel() throws Exception;

}
