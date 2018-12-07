package com.base.design.chain;

public class HandleA extends Handle {

	@Override
	public void handleRequest() {
		System.out.println("A来处理了");
		
		if(1 == 1){
			System.out.println("A:我除了不了");
			handle.handleRequest();
		}
	}

}
