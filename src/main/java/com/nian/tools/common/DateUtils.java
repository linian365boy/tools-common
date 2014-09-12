package com.nian.tools.common;  

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang.StringUtils;

/**
 * ClassName: DateUtils
 * Desc: 对日期的工具类
 * date: 2014-9-12 上午10:31:23
 * @author li.n1 
 * @since JDK 1.6
 */
public class DateUtils {
	public static final SimpleDateFormat yd_mm_dd = new SimpleDateFormat("MM'月'dd'日'");
	public static final SimpleDateFormat ymd = new SimpleDateFormat("yyyy-MM-dd");
	public static final SimpleDateFormat ymd_time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	/**
	 * getYd_mm_dd:把日期转换成月日,eg:3月20日 
	 * @author li.n1 
	 * @param date
	 * @return 
	 * @since JDK 1.6
	 */
	public static String getYd_mm_dd(Date date){
		if(date!=null){
			return yd_mm_dd.format(date);
		}
		return null;
	}
	
	/**
	 * getYmd:把日期转换成yyyy-MM-dd,eg:2014-03-20 
	 * @author li.n1 
	 * @param date
	 * @return 
	 * @since JDK 1.6
	 */
	public static String getYmd(Date date){
		if(date!=null){
			return ymd.format(date);
		}
		return null;
	}
	
	/**
	 * getYmd_time:把日期转换成yyyy-MM-dd HH:mm:ss,eg:2014-03-20 03:22:34 
	 * @author li.n1 
	 * @param date
	 * @return 
	 * @since JDK 1.6
	 */
	public static String getYmd_time(Date date){
		if(date!=null){
			return ymd_time.format(date);
		}
		return null;
	}
	
	/**
	 * formatStringToDate:把日期字符串转换成java.util.Date类型 
	 * @author li.n1 
	 * @param dateStr
	 * @return 
	 * @since JDK 1.6
	 */
	public static Date formatStringToDate(String dateStr){
		if(StringUtils.isBlank(dateStr)){
			try {
				return ymd_time.parse(dateStr);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
}
