package com.zxy.common.utils;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateUtilTest {

	@Test
	public void testRandomDate() {

		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");

		Calendar c = Calendar.getInstance();
		
		c.set(2010, 0, 1);
		
		for (int i = 0; i < 100; i++) {
			Date date = DateUtil.randomDate(c.getTime(), new Date());
			
			System.out.println(df.format(date));
		}
		
		
	}

}
