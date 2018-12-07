package com.base.design.iterator;

public class TestIterator {

	public static void main(String[] args) {
		test1();
	}
	
	public static void test1(){
		ConcreteAggregate gte = new ConcreteAggregate();
		gte.getList().add(0, "我是0号");
		gte.getList().add(1, "我是2号");
		gte.getList().add(2, "我是3号");
		gte.getList().add(3, "我是4号");
		gte.getList().add(4, "我是5号");
		gte.getList().add(5, "我是6号");
		gte.getList().add(6, "我是7号");
		gte.getList().add(7, "我是8号");
		gte.getList().add(8, "我是9号");
		
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
