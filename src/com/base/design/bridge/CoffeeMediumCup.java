package com.base.design.bridge;

public class CoffeeMediumCup extends Coffee {

	@Override
	public void operateCup() {
		System.out.println("������ʦ��һ����(С)������");
		super.getCoffeeMike().operateMike();
	}

}
