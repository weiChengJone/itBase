package com.base.design.simpleFactory;

public class SimpleFactory {

	public static Simple getSimple(String type){
		if("A".equals(type)){
			return new SimpleA();
		}
		if("B".equals(type)){
			return new SimpleB();
		}
		return null;
	}
}
