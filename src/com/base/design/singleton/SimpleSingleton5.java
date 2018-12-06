package com.base.design.singleton;

/**静�?�内部内。（建议使用�?
 * 
 * 只有当instance为null时，�?要获取同步锁，创建一次实例�?�当实例被创建，则无�?试图加锁�?
 * 
 * 用双重if判断，复杂，容易出错�?(当复杂时，代码不容易读和理解)
 * @author Administrator
 *
 */
public class SimpleSingleton5 {

	private SimpleSingleton5(){
		System.out.println("1");
	};
	
	private static final String  NO_SIM = "i don't want get simpleSingleton";
	
	private static class SingletonHolder{
		
		private final static SimpleSingleton5 simpleSingleton = new SimpleSingleton5();
		
		private static void say(){
			System.out.println("this is in class! say");
		}
		
		private static void eat(){
			System.out.println("this is in class! eat");
		}
	}
	
	public static SimpleSingleton5 getSimpleSingleton(){
		SingletonHolder.say();
		SingletonHolder.eat();
		return SingletonHolder.simpleSingleton;
	}
	
	public static String getNoSimpleSingleton(){
		return NO_SIM;
	}
}
