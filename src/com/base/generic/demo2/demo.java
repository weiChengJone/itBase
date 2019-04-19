package com.base.generic.demo2;

public class demo {
	public static void main(String[] args) {
		Teacher t = new Teacher();
		Student s = new Student();
		System.out.println("t之前:" + t.toString());
		System.out.println("s之前:" + s.toString());
		School<Teacher,Student> school = new School<Teacher, Student>();
		school.setS(s);
		school.setT(t);
		System.out.println("t之后:" + school.getT().toString());
		System.out.println("s之后:" + school.getS().toString());
		
		t = new Teacher(); t.setLevel("1");
		s = new Student(); s.setAge("20");

		System.out.println("t之后2:" + t.toString());
		System.out.println("s之后2:" + s.toString());
		
		System.out.println("t:" + school.getT().getLevel());
		System.out.println("s:" + school.getS().getAge());

	}
}
