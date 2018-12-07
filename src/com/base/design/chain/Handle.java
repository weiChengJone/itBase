package com.base.design.chain;

public abstract class Handle {

	protected Handle handle;

	public Handle getHandle() {
		return handle;
	}

	public void setHandle(Handle handle) {
		this.handle = handle;
	}
	
	public abstract void handleRequest();
	
}
