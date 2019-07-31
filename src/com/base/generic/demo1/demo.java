package com.base.generic.demo1;

import java.util.ArrayList;
import java.util.List;

public class demo {

	public static void main(String[] args) {
		
		School<Integer> school_i = new School<Integer>(1);
		school_i.setT(11);
		
		School<String> school_s = new School<String>("2");
		school_s.setT("21");
		
		Student student = new Student();
		student.setName("davie");
		School<Student> school_o = new School<Student>(student);

		List<School> list = new ArrayList<School>();
		list.add(school_i);
		list.add(school_s);
		list.add(school_o);

		
		for (School school : list) {
			System.out.println(school.toString());
			System.out.println(school.getT());
		}
	}
}
