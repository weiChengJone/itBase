package com.base.design.singleton;

public class SimpleSingletonTest1 {
	/**
	 * 只创建了�?次对象啊....
	 * 为啥说每次生成对�?
	 * @param args
	 */
	public static void main(String[] args) {
		/*System.out.println(SimpleSingleton1.getSimpleSingleton());
		System.out.println(SimpleSingleton1.getSimpleSingleton());

		System.out.println(SimpleSingleton1.getSimpleSingleton());
		System.out.println(SimpleSingleton1.getSimpleSingleton());*/

		/**
		 * 没有用到的时�?  不会过早生成SimpleSingleton
		 */
		System.out.println(SimpleSingleton1.getNoSimpleSingleton());
		
	}
}
