package com.base.reflect.demo3;

/**
 * 2. 继承的情况 类的加载  https://www.cnblogs.com/SirSmith/p/5536288.html

 * @author Administrator
 *
 */
public class demo {

	public static void main(String[] args) {
		
		/**
		 * 先父类静态 后子类静态
		 * 
		 */
//		System.out.println(Son.name);

		
		/**
		 * 静态的father
		静态的son
		这是father构造
		son的构造
		 */
		Son son = new Son();
		
		System.out.println("-----------");
		
		/**
		 * 子类加载过父类的静态块 父类不再加载  
		 */
		Father father = new Father();
	}
}
