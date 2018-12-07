package com.base.design.iterator;

public class TestIterator {

	public static void main(String[] args) {
		test1();
	}
	
	public static void test1(){
		ConcreteAggregate gte = new ConcreteAggregate();
		gte.getList().add(0, "����0��");
		gte.getList().add(1, "����2��");
		gte.getList().add(2, "����3��");
		gte.getList().add(3, "����4��");
		gte.getList().add(4, "����5��");
		gte.getList().add(5, "����6��");
		gte.getList().add(6, "����7��");
		gte.getList().add(7, "����8��");
		gte.getList().add(8, "����9��");
		
		Iterator iterator = gte.createIterator();
		String first = (String)iterator.first();
		System.out.println("first:"+first);
		while(!(Boolean)iterator.isDone()){
			String current = (String)iterator.currentItem();
			System.out.println("current:"+current);
			iterator.next();
		}
	}
}
