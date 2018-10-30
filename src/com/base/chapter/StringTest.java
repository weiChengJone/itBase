package com.base.chapter;

public class StringTest {

	public static void main(String[] args) {
		String s = "111";
		System.out.println(s.toString());
		String s1 = new String("111");
		
		String s2 = "111";
		
		System.out.println(s.toString());
		s = "222";
		System.out.println(s.toString());
		s = new String("222");
		System.out.println(s.toString());
		System.out.println(s.equals(s1));
		
	}
}
