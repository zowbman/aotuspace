package com.aotuspace.web.spuser.model.vo.deliver;

import com.aotuspace.web.spuser.model.po.deliver.custom.SpDeliverInfoCustom;

/**
 * 
 * Title:SpDeliverInfoQueryVo
 * Description:�ջ���ַ��װ��
 * Company:aotuspace
 * @author    ΰ��
 * @date      2015-12-29 ����6:29:32
 *
 */
public class SpDeliverInfoQueryVo {
	
	//�ջ���ַ��չ��
	private SpDeliverInfoCustom spDeliverC;
	
	//�ջ���ַspId
	private Integer spId;
	
	//aotuId
	private Integer aotuId;
	
	//Ĭ��ֵ
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
