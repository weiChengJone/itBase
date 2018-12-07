package com.base.design.command;

public class Waiter {

	private Command command;
	
	public Waiter(Command command){
		this.command = command;
	}
	
	public void notifyCommand(){
		command.doExecude();
	}
}
