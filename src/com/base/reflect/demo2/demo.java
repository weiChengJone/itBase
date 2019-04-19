package com.base.reflect.demo2;

/**
 * ��ļ���˳��   https://www.cnblogs.com/SirSmith/p/5536288.html
 * @author Administrator
 *
 */
public class demo {

	public static void main(String[] args) throws ClassNotFoundException {
//		1.
//		testSingleClassLoad();
//		2.
//		testSingleClassCreate();
		
//		3.��̬��ֻ����һ��
//		testSingleClassLoad();
//		testSingleClassCreate();
		
//		4.
//		testSingleClassCreateByClass();
		
		testSingleClassLoadInit();
	}
	
	/**
	 * ���������˳��   (���ؾ�̬�� --�� ��̬��Ա)
	 */
	public static void testSingleClassLoad(){
		System.out.println(TestLoadSingle.name);
	}
	
	/**
	 * ���쵥����   (���ؾ�̬�� --�� �������)
	 */
	public static void testSingleClassCreate(){
		TestLoadSingle t =  new TestLoadSingle();
		System.out.println(TestLoadSingle.name);
	}
	
	
	public static void testSingleClassCreateByClass() throws ClassNotFoundException{
        // �����ʼ����̬��
        Class clazz1 = TestLoadSingle.class;
		System.out.println("--------------");
        // ���ʼ��
        Class clazz2 = Class.forName("com.base.reflect.demo2.TestLoadSingle");

	}
	
	
	/**
	 * ���������˳��   (���ؾ�̬�� --�� ��̬��Ա)
	 */
	public static void testSingleClassLoadInit(){
//		System.out.println(TestLoadSingleInit.name);
		System.out.println(TestLoadSingleInit.age);

	}
}
