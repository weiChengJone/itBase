package com.base.design.adapter;

public class TestAdapter {

	public static void main(String[] args) {
		test1();
	}
	
	/**
	 * ��������ģʽ
	 */
	public static void test1(){
		Adapter adapter = new Adapter(new Target());
		adapter.showV();
	}
}
