package com.base.reflect.demo2;

public class TestLoadSingleInit {

	public static String name = "ywc2019/4/19";
    
	public static String age = "0";

    static {
        System.out.println("ywc��̬��");
        age = "18";
    }

    public TestLoadSingleInit(){
        System.out.println("ywc�����");
    }
    
}
