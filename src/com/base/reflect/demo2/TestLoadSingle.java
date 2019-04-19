package com.base.reflect.demo2;

/**
 * 单个类的加载顺序测试
 * @author Administrator
 *
 */
public class TestLoadSingle {

    public static String name = "ywc2019/4/19";
    
    static {
        System.out.println("ywc静态块");
    }

    public TestLoadSingle(){
        System.out.println("ywc构造块");
    }
}
