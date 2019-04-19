package com.base.reflect.demo3;

public class Father {

	public static String name = "father";

	static{
		System.out.println("静态的father");
	}
	
	public Father(){
		System.out.println("这是father构造");
	}
}
