package com.aotuspace.web.spuser.service;

import java.util.List;

import com.aotuspace.web.spuser.model.po.deliver.SpDeliverInfo;
import com.aotuspace.web.spuser.model.po.deliver.custom.SpDeliverInfoCustom;
import com.aotuspace.web.spuser.model.vo.deliver.SpDeliverInfoQueryVo;



/**
 * 
 * Title:ISpUsersService
 * Description:收货地址模块Service接口
 * Company:Boundless
 * @author    伟宝
 * @date      2015-9-10 上午11:13:32
 *
 */
public interface ISpDeliverService {
	
	/**
	 * 根据凹凸id查询收货地址
	 * @param aotuId
	 * @return
	 * @throws Exception
	 */
	List<SpDeliverInfo> findDeliverInfoByAutoId(Integer aotuId)throws Exception;
	
	/**
	 * 根据spId查询收货地址
	 * @param spId
	 * @return
	 * @throws Exception
	 */
	SpDeliverInfoCustom findDeliverInfoBySpId(Integer spId)throws Exception;
	
	
	/**
	 * 插入快递信息
	 * @param spDeliverInfoQueryVo
	 * @throws Exception
	 */
	void saveDeliver(SpDeliverInfoQueryVo spDeliverInfoQueryVo)throws Exception;
	
	/**
	 * 更新快递信息
	 * @param spDeliverInfoQueryVo
	 * @throws Exception
	 */
	void updateDeliver(SpDeliverInfoQueryVo spDeliverInfoQueryVo)throws Exception;
	
	/**
	 * 删除快递信息
	 * @param spId
	 * @throws Exception
	 */
	void deleteDeliver(Integer spId)throws Exception;
	
	/**
	 * 设置默认地址
	 * @param spDeliverInfoQueryVo
	 * @throws Exception
	 */
	void updateSetDefaultDeliver(SpDeliverInfoQueryVo spDeliverInfoQueryVo) throws Exception; 
}
