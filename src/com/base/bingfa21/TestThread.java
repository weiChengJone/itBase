package com.base.bingfa21;

public class TestThread {

	public static void main(String[] args) {
		Thread t = new Thread(new MyRunner());
		t.start();
		System.out.println("wait");
	}
}
