package com.aotuspace.web.spdictionary.controller.bank;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aotuspace.web.spdictionary.model.po.bank.SpBankBranch;
import com.aotuspace.web.spdictionary.model.po.bank.SpBankRegion;
import com.aotuspace.web.spdictionary.model.vo.bank.SpBankRegionQueryVo;
import com.aotuspace.web.spdictionary.service.bank.ISpBankService;

/**
 * 
 * Title:SpRepresentController
 * Description:银行功能模块controller
 * Company:Boundless
 * @author    伟宝
 * @date      2015-9-10 下午12:54:47
 *
 */

@Controller
@RequestMapping("/bank")
public class SpBankController {

	@Autowired
	ISpBankService iSpBankService;

	/**
	 * 银行地域请求市
	 * @param spBankRegionQueryV
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/region/citys")
	public @ResponseBody
	List<SpBankRegion> citys(SpBankRegionQueryVo spBankRegionQueryV) throws Exception {
		List<SpBankRegion> spBankRegions = iSpBankService.spBankRegionByPid(spBankRegionQueryV.getSpBankR().getPid());
		return spBankRegions;
	}

	/**
	 * 银行支行
	 * @param bankId 总行id
	 * @param proId 省id
	 * @param cityId 市id
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/region/branchs")
	public @ResponseBody
	List<SpBankBranch> branchs(@RequestParam(defaultValue = "1") Integer bankId,
			@RequestParam(defaultValue = "2") Integer proId, @RequestParam(defaultValue = "585") Integer cityId)
			throws Exception {
		List<SpBankBranch> spBankBranchs=iSpBankService.spBankBranchByBankIdAndPidAndCityId(bankId, proId, cityId);	
		return spBankBranchs;

	}
}
