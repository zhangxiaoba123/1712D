package com.zxy.common.utils;


import org.junit.Test;

public class RandomUtilTest {

	@Test
	public void testRandom() {
		//返回一个随机整数
		int i = RandomUtil.random(1, 120);
		System.out.println(i);
	}

	@Test
	public void testSubRandom() {
		//返回一个随机整数的数组
		int[] is = RandomUtil.subRandom(1, 3, 2);
		for (int i : is) {
			System.out.println(i);
		}
	}

	@Test
	public void testRandomCharacter() {
		char character = RandomUtil.randomCharacter();
		System.out.println(character);
	}

	@Test
	public void testRandomString() {
		//返回指定长度的字符
		String string = RandomUtil.randomString(6);
		System.out.println(string);
	}

}
