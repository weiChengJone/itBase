package com.base.chapter;

public class TestString {

	public static void main(String[] args) {
		String id = "111";
		String newId = new String("111");
		System.out.println(id.equals(newId)); //true

		Bird bird = new Bird();
		bird.setNoise("111");
		//��ô���111ֻ��洢�ڷ�������1��

		System.out.println(bird.getNoise().equals(id));
	}
}
