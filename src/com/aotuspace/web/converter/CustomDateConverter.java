package com.aotuspace.web.converter;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

/**
 * 
 * Title:CustomDateConverter
 * Description:日期转换器
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-9-15 下午2:11:15
 *
 */
public class CustomDateConverter implements Converter<String, Date>{

	@Override
	public Date convert(String source) {
		//实现将日期串转成日期类型 (格式为yyyy-mm-dd HH:mm:ss)
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try{
			//转换成功直接返回
			return simpleDateFormat.parse(source);
		}catch (Exception e) {
			e.printStackTrace();
		}
		//如/果参数帮顶失败返回null
		return null;
	}
	

}
