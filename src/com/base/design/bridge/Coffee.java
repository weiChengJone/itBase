package com.base.design.bridge;

public abstract class Coffee {

	private CoffeeMike coffeeMike;
	
	
	
	public CoffeeMike getCoffeeMike() {
		return coffeeMike;
	}



	public void setCoffeeMike(CoffeeMike coffeeMike) {
		this.coffeeMike = coffeeMike;
	}



	public abstract void operateCup();
}
