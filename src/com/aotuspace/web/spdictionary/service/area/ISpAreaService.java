package com.aotuspace.web.spdictionary.service.area;

import java.util.List;

import com.aotuspace.web.spdictionary.model.po.area.SpDistrictInfo;


/**
 * 
 * Title:ISpAreaService
 * Description:省市区接口
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-12-4 下午3:46:26
 *
 */

public interface ISpAreaService {
	
	/**
	 * 根据parentId查询地域信息
	 * @param parentId （0：为省，非0为市或者区）
	 * @return
	 * @throws Exception
	 */
	List<SpDistrictInfo> findAreaList(Integer parentId)throws Exception;
	
	/**
	 * 根据spid查询地域信息
	 * @param spId
	 * @return
	 * @throws Exception
	 */
	SpDistrictInfo findAreaBySpId(Integer spId)throws Exception;

}
