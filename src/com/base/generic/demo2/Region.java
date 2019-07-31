package com.base.generic.demo2;

public class Region {

	
	public static School handleInfo(School<?,?> school){
		
		return null;
	}
	
	public static <T> T genericMenthod(Class<T> tClass) throws InstantiationException, IllegalAccessException{
		T instance = tClass.newInstance();
		return instance;
	}
	
	public static void test_genericMenthod(){
		
		School genericMenthod = null;
		try {
			School<Teacher,Student> school = new School<Teacher,Student>();
			genericMenthod = genericMenthod(school.getClass());
			Student s = new Student();
			s.setAge("1");
			genericMenthod.setS(s);
			
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("genericMenthod:" + genericMenthod);
	}
	
	public static void main(String[] args) {
		test_genericMenthod();
	}
	
}
