package com.zxy.common.utils;

import java.util.Collection;

/**
 * 
 * @ClassName: CollectionUtil 
 * @Description:  集合的处理类
 * @author: admin
 * @date: 2020年3月26日 下午4:39:03
 */
public class CollectionUtil {

	/**
	 * 
	 * @Title: hasValue 
	 * @Description: 判断集合是否有值。。。
	 * @return
	 * @return: boolean
	 */
	public static boolean isEmpty(Collection<?> collection) {
		return collection==null || collection.isEmpty();
		
		
	}
}
