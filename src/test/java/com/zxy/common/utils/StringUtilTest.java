package com.zxy.common.utils;


import org.junit.Test;

public class StringUtilTest {
	
	@Test
	public void testGetValue() {
		 String value = StringUtil.getValue("八维教育学院", 2);
		 int x=1/0;
		 System.out.println(value);
		
	}
	@Test
	public void testNumber() {
		boolean b = StringUtil.isNumber("-123.123");
		System.out.println(b);
		
	}
	
	
	
	@Test
	public void testEmain() {
		boolean b = StringUtil.isEMail("348828809@qq.com");
		System.out.println(b);
		
	}
	
	@Test
	public void testPhone() {
		boolean b = StringUtil.isPhone("19710137879");
		System.out.println(b);
		
	}
	
	
//1
	@Test
	public void testHasLength() {
		
		String str = "abc";
		boolean b = StringUtil.hasLength(str);
		System.out.println(b);
	}
//2
	@Test
	public void testHasText() {
		
		String str = " ";
		boolean b = StringUtil.hasText(str);
		System.out.println(b);	
	}
//3
	@Test
	public void testRandomChineseString() {
		
		String string = StringUtil.randomChineseString(500);
		System.out.println(string);
	}
//4
	@Test
	public void testGenerateChineseName() {
		String string = StringUtil.generateChineseName();
		System.out.println(string);
	}
	@Test
	public void testUrl() {
		//String url ="https://www.baidu.com/";
		String url ="adfsdfdsfsa";
		boolean b = StringUtil.isHttpUrl(url);
		if(b)
		System.out.println("url合法");
		else 
		System.out.println("url不合法");	
		
		
	}

}
