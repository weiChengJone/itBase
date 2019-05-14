package com.base.reflect.demo5;

import java.lang.reflect.Constructor;

/**
 * new 对象  和  反射对象的区别
 * 反射：灵活
 * 
 * new : 效率更高
 * @author Administrator
 *
 */
public class demo5 {

	public static void main(String[] args) throws Exception {
		
//		consParam();
	}
	
	/**
	 * 反射对象有参数构造
	 * @throws Exception
	 */
	public static void consParam() throws Exception
	{
		Class personClass = Class.forName("com.base.reflect.demo5.Person");
		Constructor constructor = personClass.getConstructor(String.class,String.class,String.class);
		Person person = (Person) constructor.newInstance("1","小米","10");
		System.out.println(person.toString());
	}

}
