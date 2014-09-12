package com.nian.tools.common;  

import java.io.FileInputStream;
import java.util.Properties;

/**
 * ClassName: PropertiesUtils
 * Desc: 对properties文件的操作
 * date: 2014-9-12 上午11:16:35
 * @author li.n1 
 * @since JDK 1.6
 */
public class PropertiesUtils {
	
	/**
	 * getProperties:根据路径，得到key的value值 
	 * @author li.n1 
	 * @param path
	 * @param key
	 * @return 
	 * @since JDK 1.6
	 */
	public static String getProperties(String path,String key){
		FileInputStream fis = null;
		try {
			Properties prop = new Properties();  
			fis = new FileInputStream(path);
			prop.load(fis);
			return prop.getProperty(key);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try{
				if(fis!=null){
					fis.close();
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		return null;
	}
}
