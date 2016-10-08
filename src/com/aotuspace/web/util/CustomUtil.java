package com.aotuspace.web.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * 
 * Title:CustomUtil
 * Description:�Զ��幤����
 * Company:aotuspace
 * @author    ΰ��
 * @date      2015-9-15 ����3:04:19
 *
 */
public class CustomUtil {
	
	//��String�Զ���','�������ַ���תΪList
	public static List<String> stringToList(String string) {
		List<String> list = new ArrayList<String>();
		String[] s = string.split(",");
		//System.out.println(s[0]);
		for (String s1 : s) {
			list.add(s1);
		}
		return list;
	}

	//��String�Զ���','�������ַ���תΪCollection
	public static Collection<String> stringToCollection(String string) {
		Collection<String> collection = new HashSet<String>();
		String[] s = string.split(",");
		for (String s1 : s) {
			collection.add(s1);
		}
		return collection;
	}
	
	/**
	 * ��string�ַ�����'splitStr'����תΪList<Integer>
	 * @param string �ַ�������
	 * @param splitStr �ָ���
	 * @return
	 */
	public static List<Integer> stringToListI(String string, String splitStr) {
		List<Integer> list = new ArrayList<Integer>();
		String[] s = string.split(splitStr);
		for (String s1 : s) {
			list.add(Integer.valueOf(s1));
		}
		return list;
	}
	
	/**
	 * ��String[]��'splitStr'�������ַ���תΪstring
	 * @param strings �ַ�������
	 * @param splitStr �ָ���
	 * @return
	 */
	public static String stringsToString(String[] strings,String splitStr) {
		if (strings == null&&splitStr==null) {
			return null;
		}
		StringBuilder result = new StringBuilder();
		boolean flag = false;
		for (String string : strings) {
			if (flag) {
				result.append(splitStr);
			} else {
				flag = true;
			}
			result.append(string);
		}
		return result.toString();
	}
	
	/**
	 * ��List<String>��'splitStr'�������ַ���תΪstring
	 * @param integers
	 * @param splitStr
	 * @return
	 */
	public static String listSToString(List<String> strings,String splitStr){
		if (strings == null&&splitStr==null) {
			return null;
		}
		StringBuilder result = new StringBuilder();
		boolean flag = false;
		for (String string : strings) {
			if (flag) {
				result.append(splitStr);
			} else {
				flag = true;
			}
			result.append(string);
		}
		return result.toString();
	}
	
	/**
	 * ��List<Integer>��'splitStr'�������ַ���תΪstring
	 * @param integers
	 * @param splitStr
	 * @return
	 */
	public static String listIToString(List<Integer> integers,String splitStr){
		if (integers == null&&splitStr==null) {
			return null;
		}
		StringBuilder result = new StringBuilder();
		boolean flag = false;
		for (Integer integer : integers) {
			if (flag) {
				result.append(splitStr);
			} else {
				flag = true;
			}
			result.append(integer);
		}
		return result.toString();
	}
	
	/**
	 * ����
	 * @param src
	 * @return
	 */
	public static String escape(String src) {  
        int i;  
        char j;  
        StringBuffer tmp = new StringBuffer();  
        tmp.ensureCapacity(src.length() * 6);  
        for (i = 0; i < src.length(); i++) {  
            j = src.charAt(i);  
            if (Character.isDigit(j) || Character.isLowerCase(j)  
                    || Character.isUpperCase(j))  
                tmp.append(j);  
            else if (j < 256) {  
                tmp.append("%");  
                if (j < 16)  
                    tmp.append("0");  
                tmp.append(Integer.toString(j, 16));  
            } else {  
                tmp.append("%u");  
                tmp.append(Integer.toString(j, 16));  
            }  
        }  
        return tmp.toString();  
    }  
 
	/**
	 * ����
	 * @param src
	 * @return
	 */
    public static String unescape(String src) {  
        StringBuffer tmp = new StringBuffer();  
        tmp.ensureCapacity(src.length());  
        int lastPos = 0, pos = 0;  
        char ch;  
        while (lastPos < src.length()) {  
            pos = src.indexOf("%", lastPos);  
            if (pos == lastPos) {  
                if (src.charAt(pos + 1) == 'u') {  
                    ch = (char) Integer.parseInt(src  
                            .substring(pos + 2, pos + 6), 16);  
                    tmp.append(ch);  
                    lastPos = pos + 6;  
                } else {  
                    ch = (char) Integer.parseInt(src  
                            .substring(pos + 1, pos + 3), 16);  
                    tmp.append(ch);  
                    lastPos = pos + 3;  
                }  
            } else {  
                if (pos == -1) {  
                    tmp.append(src.substring(lastPos));  
                    lastPos = src.length();  
                } else {  
                    tmp.append(src.substring(lastPos, pos));  
                    lastPos = pos;  
                }  
            }  
        }  
        return tmp.toString();  
    }  
    
	 /**
	  * ɾ��������ָ��Ԫ�أ�������
	  * @param <T> �����е�Ԫ������
	  * @param arrs ��Ҫɾ��Ԫ�ص����顣
	  * @param index ��Ҫɾ����Ԫ�ص�����������ʱ���쳣����
	  * @return ָ�����͵������顣
	  */
	 public static <T> T[] removeArrayItem(T[] arrs, int index) {
	     int len = arrs.length;
	     if(index < 0 || index >= len) {
	         throw new IllegalArgumentException("��������");
	     }
	     List<T> list = new LinkedList<T>();
	     for(int i = 0; i < len; i++) {
	         if(i != index) {
	             list.add(arrs[i]);
	         }
	     }
	     // ���ｫ�ı䴫���������� arrs ��ֵ
	     arrs = list.toArray(arrs);
	     return java.util.Arrays.copyOf(arrs, arrs.length - 1);
	 }
	 
	
}
