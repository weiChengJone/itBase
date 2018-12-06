package com.base.design.singleton;

/**加同步锁时，前后两次判断实例是否存在（可行）
 * 
 * 只有当instance为null时，�?要获取同步锁，创建一次实例�?�当实例被创建，则无�?试图加锁�?
 * 
 * 用双重if判断，复杂，容易出错�?(当复杂时，代码不容易读和理解)
 * @author Administrator
 *
 */
public class SimpleSingleton3 {

	private SimpleSingleton3(){
		System.out.println("1");
	};
	
	private static SimpleSingleton3 simpleSingleton = null;
	
	private static final String  NO_SIM = "i don't want get simpleSingleton";
	
	public static SimpleSingleton3 getSimpleSingleton(){
		if(null == simpleSingleton){
			synchronized (simpleSingleton) {
				if(null == simpleSingleton){
						simpleSingleton = new SimpleSingleton3();
					}
				}		
		}
		return simpleSingleton;
	}
	
	public static String getNoSimpleSingleton(){
		return NO_SIM;
	}
}
