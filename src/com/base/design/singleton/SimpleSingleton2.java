package com.base.design.singleton;

/**懒汉�? 
 * 
 * 在解法一的基�?上加上了同步锁，使得在多线程的情况下可以用�??
 * 例如：当两个线程同时想创建实例，由于在一个时刻只有一个线程能得到同步锁，当第�?个线程加上锁以后，第二个线程只能等待�?
 * 第一个线程发现实例没有创建，创建之�?�第�?个线程释放同步锁，第二个线程才可以加上同步锁，执行下面的代码�?
 * 由于第一个线程已经创建了实例，所以第二个线程不需要创建实例�?�保证在多线程的环境下也只有�?个实例�??
 * 
 * 每次通过getInstance方法得到singleton实例的时候都有一个试图去获取同步锁的过程。�?�众�?周知，加锁是很�?�时的�?�能避免则避免�??
 * 当经常请求对象时，要等待同步锁释放，性能不好
 * @author Administrator
 *
 */
public class SimpleSingleton2 {

	private SimpleSingleton2(){
		System.out.println("1");
	};
	
	private static SimpleSingleton2 simpleSingleton = null;
	
	private static final String  NO_SIM = "i don't want get simpleSingleton";
	
	public static synchronized SimpleSingleton2 getSimpleSingleton(){
		if(null == simpleSingleton){
			simpleSingleton = new SimpleSingleton2();
		}
		return simpleSingleton;
	}
	
	public static String getNoSimpleSingleton(){
		return NO_SIM;
	}
}
