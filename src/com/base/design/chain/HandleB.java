package com.base.design.chain;

public class HandleB extends Handle {

	@Override
	public void handleRequest() {
		System.out.println("B来处理了");
		System.out.println("B:我处理掉了");
	}

}
