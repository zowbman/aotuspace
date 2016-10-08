package com.aotuspace.web.spgoods.model.po.shopping;

/**
 * 
 * Title:DeliverWay
 * Description:快递方式(枚举类型)
 * Company:autospace
 * @author    zwb
 * @date      2016年1月3日 下午5:58:47
 *
 */
public enum DeliverWay {
	/** 普通快递：运费￥10.00*/
	GENERALPOST{
		public String getName(){
			return "普通快递：运费￥10.00";
		}
	},
	/** 顺丰快递：运费￥15.00*/
	SF{
		public String getName(){
			return "顺丰快递：运费￥15.00";
		}
	};
	public abstract String getName();
}
