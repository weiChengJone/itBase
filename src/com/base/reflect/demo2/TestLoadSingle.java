package com.base.reflect.demo2;

/**
 * ������ļ���˳�����
 * @author Administrator
 *
 */
public class TestLoadSingle {

    public static String name = "ywc2019/4/19";
    
    static {
        System.out.println("ywc��̬��");
    }

    public TestLoadSingle(){
        System.out.println("ywc�����");
    }
}
