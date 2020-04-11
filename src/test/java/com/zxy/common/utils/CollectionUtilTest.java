package com.zxy.common.utils;


import java.util.ArrayList;

import org.junit.Test;

public class CollectionUtilTest {

	@Test
	public void testIsEmpty() {
	
		ArrayList<Object> list = new ArrayList<Object>();
		
		boolean b = CollectionUtil.isEmpty(list);
		System.out.println(b);
	}

}
