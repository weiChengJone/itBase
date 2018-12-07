package com.base.design.bridge;

public class CoffeeBigCup extends Coffee {

	@Override
	public void operateCup() {
		System.out.println("³åÒ»¸ö´ó±­¿§·È");
		super.getCoffeeMike().operateMike();
	}

}
