package com.aotuspace.web.spuser.model.vo.deliver;

import com.aotuspace.web.spuser.model.po.deliver.custom.SpDeliverInfoCustom;

/**
 * 
 * Title:SpDeliverInfoQueryVo
 * Description:收货地址包装类
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-12-29 下午6:29:32
 *
 */
public class SpDeliverInfoQueryVo {
	
	//收货地址扩展类
	private SpDeliverInfoCustom spDeliverC;
	
	//收货地址spId
	private Integer spId;
	
	//aotuId
	private Integer aotuId;
	
	//默认值
	private Integer defaultValue;

	public SpDeliverInfoCustom getSpDeliverC() {
		return spDeliverC;
	}

	public void setSpDeliverC(SpDeliverInfoCustom spDeliverC) {
		this.spDeliverC = spDeliverC;
	}

	public Integer getSpId() {
		return spId;
	}

	public void setSpId(Integer spId) {
		this.spId = spId;
	}

	public Integer getAotuId() {
		return aotuId;
	}

	public void setAotuId(Integer aotuId) {
		this.aotuId = aotuId;
	}

	public Integer getDefaultValue() {
		return defaultValue;
	}

	public void setDefaultValue(Integer defaultValue) {
		this.defaultValue = defaultValue;
	}	
}
