package com.base.design.singleton;

/**
 * Singleton的静态属性instance中，只有instance为null的时候才创建�?个实例，构�?�函数私有，确保每次都只创建�?个，避免重复创建�?
 * 只在单线程的情况下正常运行，在多线程的情况下，就会出问题�?
 * 例如：当两个线程同时运行到判断instance是否为空的if语句，并且instance确实没有创建好时，那么两个线程都会创建一个实例�??
 * @author Administrator
 *
 */
public class SimpleSingleton1 {

	private SimpleSingleton1(){
		System.out.println("1");
	};
	
	private static SimpleSingleton1 simpleSingleton = null;
	
	private static final String  NO_SIM = "i don't want get simpleSingleton";
	
	public static SimpleSingleton1 getSimpleSingleton(){
		if(null == simpleSingleton){
			simpleSingleton = new SimpleSingleton1();
		}
		return simpleSingleton;
	}
	
	public static String getNoSimpleSingleton(){
		return NO_SIM;
	}
}
