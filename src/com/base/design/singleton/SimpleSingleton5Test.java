package com.base.design.singleton;

/**静�?�内部内。（建议使用�?
 * 
 * 只有当instance为null时，�?要获取同步锁，创建一次实例�?�当实例被创建，则无�?试图加锁�?
 * 
 * 用双重if判断，复杂，容易出错�?(当复杂时，代码不容易读和理解)
 * @author Administrator
 *
 */
public class SimpleSingleton5Test {

	public static void main(String[] args) {
		/*System.out.println(SimpleSingleton5.getSimpleSingleton());
		System.out.println(SimpleSingleton5.getSimpleSingleton());

		System.out.println(SimpleSingleton5.getSimpleSingleton());
		
		
		System.out.println(SimpleSingleton5.getSimpleSingleton());*/

		/**
		 * 没有用到的时�?  不会过早生成SimpleSingleton
		 */
		System.out.println(SimpleSingleton5.getNoSimpleSingleton());
		
	}
}
