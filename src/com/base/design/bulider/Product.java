package com.base.design.bulider;

import java.util.ArrayList;
import java.util.List;

/**
 * 构造的产品
 * @author Administrator
 *
 */
public class Product {

	List<String> parts = new ArrayList<String>();
	
	public void add(String part){
		parts.add(part);
	}
	
	public void show(){
		for (String part : parts) {
			System.out.println("part:"+part);
		}
	}
}
