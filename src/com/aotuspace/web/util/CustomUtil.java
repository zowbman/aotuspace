package com.aotuspace.web.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * 
 * Title:CustomUtil
 * Description:自定义工具类
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-9-15 下午3:04:19
 *
 */
public class CustomUtil {
	
	//将String以逗号','隔开的字符串转为List
	public static List<String> stringToList(String string) {
		List<String> list = new ArrayList<String>();
		String[] s = string.split(",");
		//System.out.println(s[0]);
		for (String s1 : s) {
			list.add(s1);
		}
		return list;
	}

	//讲String以逗号','隔开的字符串转为Collection
	public static Collection<String> stringToCollection(String string) {
		Collection<String> collection = new HashSet<String>();
		String[] s = string.split(",");
		for (String s1 : s) {
			collection.add(s1);
		}
		return collection;
	}
	
	/**
	 * 将string字符串以'splitStr'隔开转为List<Integer>
	 * @param string 字符串数组
	 * @param splitStr 分隔符
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
	 * 将String[]以'splitStr'隔开的字符串转为string
	 * @param strings 字符串数组
	 * @param splitStr 分隔符
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
	 * 将List<String>以'splitStr'隔开的字符串转为string
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
	 * 将List<Integer>以'splitStr'隔开的字符串转为string
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
	 * 编码
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
	 * 解码
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
	  * 删除数组中指定元素（索引）
	  * @param <T> 数组中的元素类型
	  * @param arrs 需要删除元素的数组。
	  * @param index 需要删除的元素的索引（出界时抛异常）。
	  * @return 指定类型的新数组。
	  */
	 public static <T> T[] removeArrayItem(T[] arrs, int index) {
	     int len = arrs.length;
	     if(index < 0 || index >= len) {
	         throw new IllegalArgumentException("索引出界");
	     }
	     List<T> list = new LinkedList<T>();
	     for(int i = 0; i < len; i++) {
	         if(i != index) {
	             list.add(arrs[i]);
	         }
	     }
	     // 这里将改变传入的数组参数 arrs 的值
	     arrs = list.toArray(arrs);
	     return java.util.Arrays.copyOf(arrs, arrs.length - 1);
	 }
	 
	
}
