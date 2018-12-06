package com.base.design.bulider;

/**
 * 定义建造对象的必要 操作
 * @author Administrator
 *
 */
public abstract class Builder {

	protected Product product = new Product();
	
	public abstract void builderA();
	
	public abstract void builderB();
	
	public abstract Product getResult();
}
