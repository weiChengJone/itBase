package com.base.design.command;

public class TestCommand {

	public static void main(String[] args) {
		test1();
	}
	
	public static void test1(){
		Waiter waiter = new Waiter(new CommandLeg());
		waiter.notifyCommand();
	}
}
