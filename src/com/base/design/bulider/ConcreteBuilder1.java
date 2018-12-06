package com.base.design.bulider;

public class ConcreteBuilder1 extends Builder {

	
	
	@Override
	public void builderA() {
		product.add("A1");
	}

	@Override
	public void builderB() {
		product.add("B1");
	}

	@Override
	public Product getResult() {
		return product;
	}

}
