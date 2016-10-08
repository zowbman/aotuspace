package com.aotuspace.web.spuser.service;

import java.util.List;

import com.aotuspace.web.spuser.model.po.deliver.SpDeliverInfo;
import com.aotuspace.web.spuser.model.po.deliver.custom.SpDeliverInfoCustom;
import com.aotuspace.web.spuser.model.vo.deliver.SpDeliverInfoQueryVo;



/**
 * 
 * Title:ISpUsersService
 * Description:�ջ���ַģ��Service�ӿ�
 * Company:Boundless
 * @author    ΰ��
 * @date      2015-9-10 ����11:13:32
 *
 */
public interface ISpDeliverService {
	
	/**
	 * ���ݰ�͹id��ѯ�ջ���ַ
	 * @param aotuId
	 * @return
	 * @throws Exception
	 */
	List<SpDeliverInfo> findDeliverInfoByAutoId(Integer aotuId)throws Exception;
	
	/**
	 * ����spId��ѯ�ջ���ַ
	 * @param spId
	 * @return
	 * @throws Exception
	 */
	SpDeliverInfoCustom findDeliverInfoBySpId(Integer spId)throws Exception;
	
	
	/**
	 * ��������Ϣ
	 * @param spDeliverInfoQueryVo
	 * @throws Exception
	 */
	void saveDeliver(SpDeliverInfoQueryVo spDeliverInfoQueryVo)throws Exception;
	
	/**
	 * ���¿����Ϣ
	 * @param spDeliverInfoQueryVo
	 * @throws Exception
	 */
	void updateDeliver(SpDeliverInfoQueryVo spDeliverInfoQueryVo)throws Exception;
	
	/**
	 * ɾ�������Ϣ
	 * @param spId
	 * @throws Exception
	 */
	void deleteDeliver(Integer spId)throws Exception;
	
	/**
	 * ����Ĭ�ϵ�ַ
	 * @param spDeliverInfoQueryVo
	 * @throws Exception
	 */
	void updateSetDefaultDeliver(SpDeliverInfoQueryVo spDeliverInfoQueryVo) throws Exception; 
}
