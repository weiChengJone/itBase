package com.base.design.command;

public class CommandWing extends Command {

	@Override
	public void doExecude() {
		super.receiver.operateWing();
	}


}
