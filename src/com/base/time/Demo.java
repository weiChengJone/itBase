package com.base.time;

import java.util.Calendar;
import java.util.Date;

public class Demo {
	public static void main(String[] args) {
		
		System.out.println(Calendar.getInstance().getTime());
		Date date = new Date();
		//date.getTime();
		System.out.println(date.getTime());
	}
}
