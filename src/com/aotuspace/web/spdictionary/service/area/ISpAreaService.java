package com.aotuspace.web.spdictionary.service.area;

import java.util.List;

import com.aotuspace.web.spdictionary.model.po.area.SpDistrictInfo;


/**
 * 
 * Title:ISpAreaService
 * Description:ʡ�����ӿ�
 * Company:aotuspace
 * @author    ΰ��
 * @date      2015-12-4 ����3:46:26
 *
 */

public interface ISpAreaService {
	
	/**
	 * ����parentId��ѯ������Ϣ
	 * @param parentId ��0��Ϊʡ����0Ϊ�л�������
	 * @return
	 * @throws Exception
	 */
	List<SpDistrictInfo> findAreaList(Integer parentId)throws Exception;
	
	/**
	 * ����spid��ѯ������Ϣ
	 * @param spId
	 * @return
	 * @throws Exception
	 */
	SpDistrictInfo findAreaBySpId(Integer spId)throws Exception;

}
