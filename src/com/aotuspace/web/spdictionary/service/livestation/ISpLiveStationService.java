package com.aotuspace.web.spdictionary.service.livestation;

import java.util.List;

import com.aotuspace.web.spdictionary.model.po.livestation.SpLivestationInfo;

/**
 * 
 * Title:ISpLiveStationService
 * Description:ֱ��ƽ̨service�ӿ�
 * Company:aotuspace
 * @author    ΰ��
 * @date      2015-12-7 ����11:05:04
 *
 */
public interface ISpLiveStationService {
	
	/**
	 * ��ѯ����ֱ��ƽ̨
	 * @return
	 * @throws Exception
	 */
	List<SpLivestationInfo> findAllSpLiveStationInfo() throws Exception;
}
