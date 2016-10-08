package com.aotuspace.web.converter;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

/**
 * 
 * Title:CustomDateConverter
 * Description:����ת����
 * Company:aotuspace
 * @author    ΰ��
 * @date      2015-9-15 ����2:11:15
 *
 */
public class CustomDateConverter implements Converter<String, Date>{

	@Override
	public Date convert(String source) {
		//ʵ�ֽ����ڴ�ת���������� (��ʽΪyyyy-mm-dd HH:mm:ss)
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try{
			//ת���ɹ�ֱ�ӷ���
			return simpleDateFormat.parse(source);
		}catch (Exception e) {
			e.printStackTrace();
		}
		//��/�������ﶥʧ�ܷ���null
		return null;
	}
	

}
