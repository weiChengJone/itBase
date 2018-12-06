package com.base.design.observer;

public class TestObserver {

	public static void main(String[] args) {
		test1();
	}
	
	public static void test1(){
		Product product = new Product();
		product.setPrice("10");
		product.setCoolPrice("8");
		product.addObserver(new CoolPriceObserver());
		product.setCoolPrice("6");
		product.setCoolPrice("6");
		product.setCoolPrice("4");
		product.setPrice("10");
		
		System.out.println(product.getName());
	}
}
