package com.aotuspace.web.spgoods.model.po.shopping;

/**
 * 
 * Title:DeliverWay
 * Description:��ݷ�ʽ(ö������)
 * Company:autospace
 * @author    zwb
 * @date      2016��1��3�� ����5:58:47
 *
 */
public enum DeliverWay {
	/** ��ͨ��ݣ��˷ѣ�10.00*/
	GENERALPOST{
		public String getName(){
			return "��ͨ��ݣ��˷ѣ�10.00";
		}
	},
	/** ˳���ݣ��˷ѣ�15.00*/
	SF{
		public String getName(){
			return "˳���ݣ��˷ѣ�15.00";
		}
	};
	public abstract String getName();
}
