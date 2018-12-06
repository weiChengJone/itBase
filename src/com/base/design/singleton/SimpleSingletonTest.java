package com.base.design.singleton;

public class SimpleSingletonTest {
	/**
	 * 只创建了�?次对象啊....
	 * 为啥说每次生成对�?
	 * @param args
	 */
	public static void main(String[] args) {
		/*System.out.println(SimpleSingleton.getSimpleSingleton());
		System.out.println(SimpleSingleton.getSimpleSingleton());

		System.out.println(SimpleSingleton.getSimpleSingleton());
		System.out.println(SimpleSingleton.getSimpleSingleton());*/

		/**
		 * 没有用到的时候也生成了simpleSingleton(可能过早生成)
		 */
		System.out.println(SimpleSingleton.getNoSimpleSingleton());
		
	}
}
