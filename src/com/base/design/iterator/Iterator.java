package com.base.design.iterator;

public interface Iterator {

	public Object first();
	
	public Object next();
	
	public Object isDone();
	
	public Object currentItem();
}
