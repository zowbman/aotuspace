package com.aotuspace.web.spdictionary.service.bank;

import java.util.List;

import com.aotuspace.web.spdictionary.model.po.bank.SpBankBranch;
import com.aotuspace.web.spdictionary.model.po.bank.SpBankRegion;
import com.aotuspace.web.spdictionary.model.po.bank.SpBanks;

/**
 * 
 * Title:ISpBankService
 * Description:银行接口
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-12-4 下午3:46:26
 *
 */

public interface ISpBankService {

	/**
	 * 总行信息
	 * @return
	 * @throws Exception
	 */
	List<SpBanks> bankList() throws Exception;

	/**
	 * 银行地域
	 * @param LevelId （1:省,2:市）
	 * @return
	 * @throws Exception
	 */
	List<SpBankRegion> bankRegionListByLevelId(Integer levelId) throws Exception;

	/**
	 * 根据pId（根据省份）查询SpBankRegion原对象
	 * @param pId
	 * @return
	 * @throws Exception
	 */
	List<SpBankRegion> spBankRegionByPid(Integer pId) throws Exception;

	/**
	 * 根据总行id和省id以及市id查询分行
	 * @param bankId总行id
	 * @param proId省id
	 * @param cityId市id
	 * @return
	 * @throws Exception
	 */
	List<SpBankBranch> spBankBranchByBankIdAndPidAndCityId(Integer bankId, Integer proId, Integer cityId)
			throws Exception;

}
