package com.base.design.simpleFactory;

public class SimpleFactoryTest {

	
	
	public static void main(String[] args) {
		Simple a = SimpleFactory.getSimple("A");
		Simple b = SimpleFactory.getSimple("B");
		System.out.println("a:"+a.introduce());
		System.out.println("b:"+b.introduce());
	}
	
}
