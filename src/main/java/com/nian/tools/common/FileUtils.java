package com.nian.tools.common;  

import java.io.File;

/**
 * ClassName: FileUtils
 * Desc: 文件操作的工具类
 * date: 2014-9-12 上午11:06:37
 * @author li.n1 
 * @since JDK 1.6
 */
public class FileUtils {
	
	/**
	 * deleteFile:根据文件路径删除文件 
	 * @author li.n1 
	 * @param path
	 * @return 
	 * @since JDK 1.6
	 */
	public static boolean deleteFile(String path){
		File file = new File(path);
		boolean flag = false;
		if(file.exists()&&!file.isDirectory()){
			if(file.delete()){
				flag = true;
			}
		}
		return flag;
	}
	
	/**
	 * getRndFileName:取得随机主文件名，不包含文件后缀 
	 * @author li.n1 
	 * @return 
	 * @since JDK 1.6
	 */
	public synchronized static String getRndFileName(){
		return String.valueOf(System.currentTimeMillis());
	}
	
	/**
	 * getExtName:得到小写的文件后缀 （包括了.号）
	 * @author li.n1 
	 * @param fileName
	 * @return 
	 * @since JDK 1.6
	 */
	public static String getExtName(String fileName){
		return fileName.substring(fileName.lastIndexOf(".")).toLowerCase();
	}
	
	public static void main(String[] args) {
		System.out.println(getExtName("213423.txt"));
	}
}
