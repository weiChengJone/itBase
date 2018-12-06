package com.base.design.observer;

import java.util.Observable;

public class Product extends Observable{

	private String name;
	private String price;
	/**
	 * 活动价格
	 */
	private String coolPrice;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getCoolPrice() {
		return coolPrice;
	}
	public void setCoolPrice(String coolPrice) {
		setChanged();
		notifyObservers(coolPrice);
		this.coolPrice = coolPrice;
	}
	
	
}
