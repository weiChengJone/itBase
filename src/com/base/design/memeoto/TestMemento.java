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
		
		//��ͷ���ϵ�
		
		ori.recoveryMemento(caretaker.getMementoList().get(0));
		System.out.println("�ָ����state:"+ori.getState());
		System.out.println("�ָ����memo:"+ori.getMeme());  		//memo��û�б��ָ�
	}
}
