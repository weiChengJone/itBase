package com.base.reflect.demo3;

public class Son extends Father{

	public static String name = "son";
	
	static{
		System.out.println("静态的son");
	}
	
	public Son(){
		System.out.println("son的构造");
	}
}
