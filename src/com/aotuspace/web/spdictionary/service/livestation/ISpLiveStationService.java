package com.aotuspace.web.spdictionary.service.livestation;

import java.util.List;

import com.aotuspace.web.spdictionary.model.po.livestation.SpLivestationInfo;

/**
 * 
 * Title:ISpLiveStationService
 * Description:直播平台service接口
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-12-7 上午11:05:04
 *
 */
public interface ISpLiveStationService {
	
	/**
	 * 查询所有直播平台
	 * @return
	 * @throws Exception
	 */
	List<SpLivestationInfo> findAllSpLiveStationInfo() throws Exception;
}
