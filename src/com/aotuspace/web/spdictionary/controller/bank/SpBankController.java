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
 * Description:���й���ģ��controller
 * Company:Boundless
 * @author    ΰ��
 * @date      2015-9-10 ����12:54:47
 *
 */

@Controller
@RequestMapping("/bank")
public class SpBankController {

	@Autowired
	ISpBankService iSpBankService;

	/**
	 * ���е���������
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
	 * ����֧��
	 * @param bankId ����id
	 * @param proId ʡid
	 * @param cityId ��id
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
