package com.base.design.observer;

import java.util.Observable;
import java.util.Observer;

public class CoolPriceObserver implements Observer{

	private String coolPrice = null;
	
	@Override
	public void update(Observable o, Object arg) {
		if(arg instanceof String){
			coolPrice = (String)arg;
			System.out.println("商品降价啦:降为"+coolPrice);
			
			Product p = (Product)o;
			p.setName("新的一天");
		}
		
	}

}
