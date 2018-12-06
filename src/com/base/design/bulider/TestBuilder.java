package com.base.design.bulider;

public class TestBuilder {

	public static void main(String[] args) {
		
		Director director = new Director();
		Builder builder1 = new ConcreteBuilder1();
		director.Construct(builder1);
		
		Product product1 = builder1.getResult();
		
		Builder builder2 = new ConcreteBuilder2();
		director.Construct(builder2);
		
		Product product2 = builder2.getResult();
		
		product1.show();
		product2.show();
		
		System.out.println("product1:"+product1.toString());
		System.out.println("product2:"+product2.toString());
	}
}
