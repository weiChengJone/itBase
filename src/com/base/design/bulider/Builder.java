package com.base.design.bulider;

/**
 * ���彨�����ı�Ҫ ����
 * @author Administrator
 *
 */
public abstract class Builder {

	protected Product product = new Product();
	
	public abstract void builderA();
	
	public abstract void builderB();
	
	public abstract Product getResult();
}
