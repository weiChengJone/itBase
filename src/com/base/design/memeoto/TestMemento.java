package com.base.design.memeoto;

public class TestMemento {

	public static void main(String[] args) {
		test1();
	}
	
	public static void test1(){
		Originator ori = new Originator();
		Caretaker caretaker = new Caretaker(ori.createMemento());
		ori.setState("80");
		ori.setMeme("changed");
		
		//回头吧老弟
		
		ori.recoveryMemento(caretaker.getMementoList().get(0));
		System.out.println("恢复后的state:"+ori.getState());
		System.out.println("恢复后的memo:"+ori.getMeme());  		//memo并没有被恢复
	}
}
