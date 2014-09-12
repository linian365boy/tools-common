package com.nian.tools.common; 

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;

/**
 * ClassName: MapUtils
 * Desc: 对map操作的工具类
 * date: 2014-9-12 上午11:26:12
 * @author li.n1 
 * @since JDK 1.6
 */
public class MapUtils {
	/**
	 * transMap2Bean:把map转换成某个bean 
	 * @author li.n1 
	 * @param <T>
	 * @param <T>
	 * @param map
	 * @param obj 
	 * @since JDK 1.6
	 */
	public static <T> T transMap2Bean(Map<String, Object> map, T t) {  
		if (map == null || t == null) {
            return t;
        }
		try{
			BeanUtils.populate(t, map);
		}catch(Exception e){
			e.printStackTrace();
		}
		return t;
	}
	
	/**
	 * transBean2Map:把bean转换成map对象 
	 * @author li.n1 
	 * @param t
	 * @return 
	 * @since JDK 1.6
	 */
	public static <T> Map<String,Object> transBean2Map(T t){
		if(t == null){
            return null;
        }
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(t.getClass());
            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
            for (PropertyDescriptor property : propertyDescriptors) {
                String key = property.getName();
                // 过滤class属性  
                if (!key.equals("class")) {
                    // 得到property对应的getter方法  
                    Method getter = property.getReadMethod();
                    Object value = getter.invoke(t);
                    map.put(key, value);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map; 
	}
	
}
