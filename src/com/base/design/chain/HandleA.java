package com.base.design.chain;

public class HandleA extends Handle {

	@Override
	public void handleRequest() {
		System.out.println("A��������");
		
		if(1 == 1){
			System.out.println("A:�ҳ��˲���");
			handle.handleRequest();
		}
	}

}
