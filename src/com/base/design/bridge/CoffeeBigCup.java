package com.base.design.bridge;

public class CoffeeBigCup extends Coffee {

	@Override
	public void operateCup() {
		System.out.println("��һ���󱭿���");
		super.getCoffeeMike().operateMike();
	}

}
