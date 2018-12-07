package com.base.design.bridge;

public class TestBridge {

	public static void main(String[] args) {
		test1();
	}
	
	public static void test1(){
		//中杯有奶
		Coffee coffee = new CoffeeMediumCup();
		coffee.setCoffeeMike(new CoffeeMikeYes());
		coffee.operateCup();
		
		//大杯无奶
		Coffee coffee2 = new CoffeeBigCup();
		coffee2.setCoffeeMike(new CoffeeMikeNo());
		coffee2.operateCup();
	}
}
