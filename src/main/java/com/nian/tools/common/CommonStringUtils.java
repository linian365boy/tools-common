package com.nian.tools.common;

import java.util.List;

/**
 * ClassName: StringUtils
 * Desc: 对字符串的工具类
 * date: 2014-9-12 上午10:31:01
 * @author li.n1 
 * @since JDK 1.6
 */
public class CommonStringUtils {
	/**
	 * 使用分隔连接数组
	 * ["9998890", "9998891", "9998892"] ==> "9998890,9998891,9998892"
	 * 
	 * @param arry
	 * @param separate
	 * @return
	 */
	public static String join(String[] arry, String separate) {
		if (null == arry) return null;
		
		StringBuilder sb = new StringBuilder();
		for (String string : arry) {
			sb.append(string).append(separate);
		}
		
		if (sb.length() > 1)
			return sb.substring(0, sb.length() - 1);
		
		return sb.toString();
	}
	
	/**
	 * 使用分隔连接list
	 * ["9998890", "9998891", "9998892"] ==> "9998890,9998891,9998892"
	 * @param list
	 * @param separate
	 * @return
	 */
	public static String listToString(List<String> list, String separator) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < list.size(); i++) {
			sb.append(list.get(i));
			if (i < list.size() - 1) {
				sb.append(separator);
			}
		}
		return sb.toString();
	}
	
	
	
}
