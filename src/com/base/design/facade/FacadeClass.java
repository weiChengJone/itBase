package com.base.design.facade;

public class FacadeClass {
	
	public void buy(){
		Estate estate = new Estate();
		Shares shares = new Shares();
		estate.buy();
		shares.buy();
	}
	
	public void seller(){
		Estate estate = new Estate();
		Shares shares = new Shares();
		estate.seller();
		shares.seller();
	}

}
