package com.base.design.state;

public class TestState {
	
	public static void main(String[] args) {
		
		Context context = new Context(new ConcreteStateA());
		
		for (int i = 0; i < 20; i++) {
			context.request();
		}	
	}
}
