package com.base.design.adapter;

/**
 * ÊÊÅäÆ÷
 * @author Administrator
 *
 */
public class Adapter {

	private Adaptee adaptee = new Adaptee();
	
	private Target target;
	
	public Adapter(Target target){
		this.target = target;
	}
	
	public void showV(){
		adaptee.showV();
	}
}
