package com.base.reflect.demo5;

import java.lang.reflect.Constructor;

/**
 * new ����  ��  ������������
 * ���䣺���
 * 
 * new : Ч�ʸ���
 * @author Administrator
 *
 */
public class demo5 {

	public static void main(String[] args) throws Exception {
		
//		consParam();
	}
	
	/**
	 * ��������в�������
	 * @throws Exception
	 */
	public static void consParam() throws Exception
	{
		Class personClass = Class.forName("com.base.reflect.demo5.Person");
		Constructor constructor = personClass.getConstructor(String.class,String.class,String.class);
		Person person = (Person) constructor.newInstance("1","С��","10");
		System.out.println(person.toString());
	}

}
