package com.zxy.common.utils;


import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testHasLength() {
		
		String str = "abc";
		boolean b = StringUtil.hasLength(str);
		System.out.println(b);
	}

	@Test
	public void testHasText() {
		
		String str = " ";
		boolean b = StringUtil.hasText(str);
		System.out.println(b);	
	}

	@Test
	public void testRandomChineseString() {
		
		String string = StringUtil.randomChineseString(500);
		System.out.println(string);
	}

	@Test
	public void testGenerateChineseName() {
		String string = StringUtil.generateChineseName();
		System.out.println(string);
	}

}
