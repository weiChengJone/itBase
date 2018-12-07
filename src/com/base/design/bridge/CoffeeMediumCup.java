package com.base.design.bridge;

public class CoffeeMediumCup extends Coffee {

	@Override
	public void operateCup() {
		System.out.println("给罗老师冲一个中(小)杯咖啡");
		super.getCoffeeMike().operateMike();
	}

}
