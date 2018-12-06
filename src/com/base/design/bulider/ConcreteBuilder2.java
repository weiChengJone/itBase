package com.base.design.bulider;

public class ConcreteBuilder2 extends Builder {

	@Override
	public void builderA() {
		product.add("A2");
	}

	@Override
	public void builderB() {
		product.add("B2");
	}

	@Override
	public Product getResult() {
		return product;
	}

}
