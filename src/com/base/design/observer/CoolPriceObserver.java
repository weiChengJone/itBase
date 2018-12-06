package com.base.design.observer;

import java.util.Observable;
import java.util.Observer;

public class CoolPriceObserver implements Observer{

	private String coolPrice = null;
	
	@Override
	public void update(Observable o, Object arg) {
		if(arg instanceof String){
			coolPrice = (String)arg;
			System.out.println("��Ʒ������:��Ϊ"+coolPrice);
			
			Product p = (Product)o;
			p.setName("�µ�һ��");
		}
		
	}

}
