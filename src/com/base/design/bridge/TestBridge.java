package com.base.design.bridge;

public class TestBridge {

	public static void main(String[] args) {
		test1();
	}
	
	public static void test1(){
		//�б�����
		Coffee coffee = new CoffeeMediumCup();
		coffee.setCoffeeMike(new CoffeeMikeYes());
		coffee.operateCup();
		
		//������
		Coffee coffee2 = new CoffeeBigCup();
		coffee2.setCoffeeMike(new CoffeeMikeNo());
		coffee2.operateCup();
	}
}
