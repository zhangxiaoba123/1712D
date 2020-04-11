package com.zxy.common.utils;

import java.util.Calendar;
import java.util.Date;

/**
 * 
 * @ClassName: DateUtil 
 * @Description: 日期处理类
 * @author: admin
 * @date: 2020年3月27日 上午8:56:14
 */
public class DateUtil {


	
	/**
	 * 
	 * @Title: randomDate 
	 * @Description: 随机产生一个在startdate 和enddate的随机日期
	 * @param startDate
	 * @return
	 * @return: Date
	 */
	public static Date randomDate(Date startDate,Date endDate) {
		//从1970到startdate 的毫秒
		long t1 = startDate.getTime();
		long t2 = endDate.getTime();
		
		if(t1 > t2 )
			throw new RuntimeException("开始日期不能大于结束日期");
		
		//随机产生一个在t1和t2之间的毫秒数
		
		 long t = (long) (Math.random() *(t2 - t1 +1 )+t1);
		
		 
		return  new Date(t);
		
	}
	
	/**
	 * 
	 * @Title: getInitMonth 
	 * @Description: 返回指定日期的月初，比如 2020-02-28 , 返回 2020-02-01 00:00:00
	 * @param date
	 * @return
	 * @return: Date
	 */
	public  static Date  getInitMonth(Date date) {
		//获取一个日历类
		Calendar c = Calendar.getInstance();//获取当前系统时间的日历类
		//用传入的日期再初始化日历类
		c.setTime(date);
		//调用日历类的相关方法
		c.set(Calendar.DAY_OF_MONTH, 1);//让日期为当月的第一天
		c.set(Calendar.HOUR_OF_DAY, 0);//小时
		c.set(Calendar.MINUTE, 0);//分钟
		c.set(Calendar.SECOND, 0);//秒
		
		return c.getTime();
		
	}
	
	
	/**
	 * 
	 * @Title: getEndMonth 
	 * @Description: 返回一个月的月末   如 传入 2020/3/27 .返回 2020/3/31 23：59:59
	 * @param date
	 * @return
	 * @return: Date
	 */
	public static Date getEndMonth(Date date) {
		//先初始化日历类
		Calendar c = Calendar.getInstance();
		//用传入参数初始化日历类
		c.setTime(date);
		//整体思路： 让当日期的月份+1 变成 2020/4/27 ，变成 月初 2020/4/1 00：00:00，再减去1秒
		c.add(Calendar.MONTH, 1);//日期的月份+1 
		
		Date initMonth = getInitMonth(c.getTime());//变成 月初
		c.setTime(initMonth);//再次初始化日历类
		c.add(Calendar.SECOND, -1);//减去1秒
		return c.getTime();
	}
	
	
	  /**
	   * 
	   * @Title: getAgeByBirthday 
	   * @Description: 根据出生日期算年龄
	   * @param date
	   * @return
	   * @return: int
	   */
	  public static int getAgeByBirthday(Date birthday) {
		  Calendar c = Calendar.getInstance();//日期类
		  
		  int s_year =c.get(Calendar.YEAR);//系统的年
		  
		  int s_month =c.get(Calendar.MONTH);//系统的月
		  
		  int s_date =c.get(Calendar.DAY_OF_MONTH);//系统的日
		  
		  c.setTime(birthday);//日历类
		  
		  int b_year = c.get(Calendar.YEAR);//出生的年
		  
		  int b_month =c.get(Calendar.MONTH);//出生的月
		  
		  int b_date =c.get(Calendar.DAY_OF_MONTH);//出生的日
		  
		  //计算年龄
		 int age = s_year - b_year;
		 //如果系统月份小于b_month
		 if(s_month < b_month) {
			 age--; //年龄减一岁
		 } 
		 //如果月份相等但是系统的天小于出生的天
		 if(s_month == b_month &&s_date < b_date) {
			 age--; //年龄减一岁
		 }
		return age;
		  
	  }
}
