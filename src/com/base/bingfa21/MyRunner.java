package com.base.bingfa21;

public class MyRunner implements Runnable{

	@Override
	public void run() {
		int i = 10;
		while(i-->0){
			System.out.println(i);
			Thread.yield();
		}
		
	}

}
