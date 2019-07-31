package com.base.generic.demo1;

public class School<T> {
	
	private T t;

	public School(T t) {
		super();
		this.t = t;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	

}
