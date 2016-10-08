package com.aotuspace.web.util.sort.complarator;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.List;

import com.aotuspace.web.util.CustomUtil;
import com.aotuspace.web.util.sort.ISortObject;
import com.aotuspace.web.util.sort.rule.OrderRule;

public class SortObjectImp implements ISortObject {

	private List<OrderRule> orderRules;

	//���췽��
	public SortObjectImp(List<OrderRule> orderRules) {
		this.orderRules = orderRules;
	}

	public int compare(Object o1, Object o2) {
		int result = 0;
		try {
			for (OrderRule orderRule : orderRules) {
				Object v1 = getVaule(o1, orderRule.getPropertyName());
				Object v2 = getVaule(o2, orderRule.getPropertyName());
				result = sort(v1, v2, orderRule.getDataType());
				if (!orderRule.isAsc()) {
					result *= -1;
				}
				if (result != 0) {
					break;
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("����Ƚ��쳣");
		}
		return result;
	}

	private int sort(Object v1, Object v2, int dataType) {
		int result = 0;
		switch (dataType) {
		case OrderRule._STRING:
			String s1 = (String) v1;
			String s2 = (String) v2;
			result = s1.compareTo(s2);
			break;
		case OrderRule._BIGDECIMAL:
			BigDecimal d1 = (BigDecimal) v1;
			BigDecimal d2 = (BigDecimal) v2;
			result = d1.compareTo(d2);
			break;
		case OrderRule._LONG:
			Long l1 = (Long) v1;
			Long l2 = (Long) v2;
			result = l1.compareTo(l2);
			break;
		case OrderRule._Integer:
			Integer i1 = (Integer) v1;
			Integer i2 = (Integer) v2;
			result = i1.compareTo(i2);
			break;
		default:
			result = 0;
			break;
		}
		return result;
	}
	
	/**
	 * �ݹ鷴���ȡֵ
	 * @param obj
	 * @param propertyName
	 * @return
	 */
	private Object getVaule(Object obj, String propertyName) {
		Object result = null;
		//�ָ��ַ���
		String[] proNames=propertyName.split("\\.");
		try {
			Field field = getField(obj.getClass(), proNames[0]);
			result = field.get(obj);
			
			/*ԭʼ����
			Field field = getField(obj.getClass(), propertyName);
			result = field.get(obj);
			field=getField(result.getClass(),"spSort");
			result=field.get(result);			
			*/
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
		if(proNames.length==1){
			return result;
		}else{
			String[] newProNames=CustomUtil.removeArrayItem(proNames, 0);//ȥ����һ��
			String newPropertyName=CustomUtil.stringsToString(newProNames, ".");//stringתstring[],��"."�ָ�
			return getVaule(result,newPropertyName);
		}
		
	}

	/**
	 * ���������ԣ������಻���ڸ�������ݹ���ø�����ң�������ʼ�ղ����ڷ��ؿ�
	 * @author zwb
	 * @param clazz           �����
	 * @param methodName      ������
	 * @return �˷������Method�������ǿ��õ�
	 */
	public static Field getField(Class<?> clazz, String fieldName) {

		Field field = null;
		try {
			if (clazz == null)
				return null;

			field = clazz.getDeclaredField(fieldName);
			field.setAccessible(true);
			return field;
		} catch (NoSuchFieldException e) {
			return getField(clazz.getSuperclass(), fieldName);
		}

	}

	/**
	 * �����÷����������಻���ڸ÷�����ݹ���ø�����ң�������ʼ�ղ����ڷ��ؿ�
	 * @author zwb
	 * @param clazz           �����
	 * @param methodName      ������
	 * @param parameterTypes  ���������б�
	 * @return �˷������Method�������ǿ��õ�
	 */
	public static Method getMethod(Class<?> clazz, String methodName, Class<?>... parameterTypes) {
		Method method = null;
		try {
			if (clazz == null)
				return null;

			method = clazz.getDeclaredMethod(methodName, parameterTypes);
			method.setAccessible(true);

			return method;
		} catch (NoSuchMethodException e) {
			return getMethod(clazz.getSuperclass(), methodName, parameterTypes);
		}
	}

}
