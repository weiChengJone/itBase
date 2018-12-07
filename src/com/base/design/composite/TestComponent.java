package com.base.design.composite;

public class TestComponent {

	public static void main(String[] args) {
		test1();
	}
	
	public static void test1(){
		Composite com = new Composite();//1
		com.addComposite(new Leaf());
		com.addComposite(new Leaf());
		
		Composite comChild1 = new Composite();
		comChild1.addComposite(new Leaf());
		comChild1.addComposite(new Leaf());
		comChild1.addComposite(new Leaf());
		
		Composite comChild2 = new Composite();
		comChild2.addComposite(new Leaf());
		comChild2.addComposite(new Leaf());
		comChild2.addComposite(new Leaf());
		
		Composite comChild1Child = new Composite();
		comChild1Child.addComposite(new Leaf());
		
		comChild1.addComposite(comChild1Child);//5
		com.addComposite(comChild1);//2
		com.addComposite(comChild2);//3
		com.addComposite(comChild2);//4
		
		com.addComposite(new Leaf());
		
		com.operation(0);
	}
}
