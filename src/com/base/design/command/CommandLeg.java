package com.base.design.command;

public class CommandLeg extends Command {

	@Override
	public void doExecude() {
		super.receiver.operateLeg();
	}

}
