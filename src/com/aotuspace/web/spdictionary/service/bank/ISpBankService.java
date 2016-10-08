package com.aotuspace.web.spdictionary.service.bank;

import java.util.List;

import com.aotuspace.web.spdictionary.model.po.bank.SpBankBranch;
import com.aotuspace.web.spdictionary.model.po.bank.SpBankRegion;
import com.aotuspace.web.spdictionary.model.po.bank.SpBanks;

/**
 * 
 * Title:ISpBankService
 * Description:���нӿ�
 * Company:aotuspace
 * @author    ΰ��
 * @date      2015-12-4 ����3:46:26
 *
 */

public interface ISpBankService {

	/**
	 * ������Ϣ
	 * @return
	 * @throws Exception
	 */
	List<SpBanks> bankList() throws Exception;

	/**
	 * ���е���
	 * @param LevelId ��1:ʡ,2:�У�
	 * @return
	 * @throws Exception
	 */
	List<SpBankRegion> bankRegionListByLevelId(Integer levelId) throws Exception;

	/**
	 * ����pId������ʡ�ݣ���ѯSpBankRegionԭ����
	 * @param pId
	 * @return
	 * @throws Exception
	 */
	List<SpBankRegion> spBankRegionByPid(Integer pId) throws Exception;

	/**
	 * ��������id��ʡid�Լ���id��ѯ����
	 * @param bankId����id
	 * @param proIdʡid
	 * @param cityId��id
	 * @return
	 * @throws Exception
	 */
	List<SpBankBranch> spBankBranchByBankIdAndPidAndCityId(Integer bankId, Integer proId, Integer cityId)
			throws Exception;

}
