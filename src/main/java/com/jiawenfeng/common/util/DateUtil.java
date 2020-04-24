package com.jiawenfeng.common.util;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;


public class DateUtil {
	
	
	
	  public static int getAgeByBirthday(Date birthday) {
		  Calendar c = Calendar.getInstance();
		  int s_year =c.get(Calendar.YEAR);
		  int s_month =c.get(Calendar.MONTH);
		  int s_date =c.get(Calendar.DAY_OF_MONTH);
		  c.setTime(birthday);
		  int b_year = c.get(Calendar.YEAR);
		  int b_month =c.get(Calendar.MONTH);
		  int b_date =c.get(Calendar.DAY_OF_MONTH);
		 
		 int age = s_year - b_year;
		
		 if(s_month < b_month) {
			 age--; 
		 } 
		
		 if(s_month == b_month &&s_date < b_date) {
			 age--; 
		 }
		return age;
		  
	  }
	
	
	public static Date getEndMonth(Date date) {
	
		Calendar c = Calendar.getInstance();
		
		c.setTime(date);
		
		c.add(Calendar.MONTH, 1);
		Date initMonth = getInitMonth(c.getTime());
		c.setTime(initMonth);
		c.add(Calendar.SECOND, -1);
		return c.getTime();
	}
	
	

	public static Date getInitMonth(Date date) {
		Calendar c = Calendar.getInstance();
		
		c.setTime(date);
		
		c.set(Calendar.DAY_OF_MONTH, 1);
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		return c.getTime();
		
	}
	
	
	
	public static Date randomDate(Date startDate,Date endDate) {
		
		long t1 = startDate.getTime();
		long t2 = endDate.getTime();
		if(t2<t1)
		throw new RuntimeException("时间");
		
		
		long t =(long) ((Math.random()* (t2-t1)) + t1);
		
		return new Date(t);
		
	}

}
