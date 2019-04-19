package com.base.reflect.demo2;

/**
 * 类的加载顺序   https://www.cnblogs.com/SirSmith/p/5536288.html
 * @author Administrator
 *
 */
public class demo {

	public static void main(String[] args) throws ClassNotFoundException {
//		1.
//		testSingleClassLoad();
//		2.
//		testSingleClassCreate();
		
//		3.静态块只加载一次
//		testSingleClassLoad();
//		testSingleClassCreate();
		
//		4.
//		testSingleClassCreateByClass();
		
		testSingleClassLoadInit();
	}
	
	/**
	 * 单个类加载顺序   (加载静态块 --》 静态成员)
	 */
	public static void testSingleClassLoad(){
		System.out.println(TestLoadSingle.name);
	}
	
	/**
	 * 构造单个类   (加载静态块 --》 构造对象)
	 */
	public static void testSingleClassCreate(){
		TestLoadSingle t =  new TestLoadSingle();
		System.out.println(TestLoadSingle.name);
	}
	
	
	public static void testSingleClassCreateByClass() throws ClassNotFoundException{
        // 不会初始化静态块
        Class clazz1 = TestLoadSingle.class;
		System.out.println("--------------");
        // 会初始化
        Class clazz2 = Class.forName("com.base.reflect.demo2.TestLoadSingle");

	}
	
	
	/**
	 * 单个类加载顺序   (加载静态块 --》 静态成员)
	 */
	public static void testSingleClassLoadInit(){
//		System.out.println(TestLoadSingleInit.name);
		System.out.println(TestLoadSingleInit.age);

	}
}
