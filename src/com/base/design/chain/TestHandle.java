package com.base.design.chain;

public class TestHandle {
	public static void main(String[] args) {
		test1();
	}
	
	public static void test1(){
		HandleA a = new HandleA();
		HandleB b = new HandleB();
		a.setHandle(b);
		
		a.handleRequest();
	}
}
