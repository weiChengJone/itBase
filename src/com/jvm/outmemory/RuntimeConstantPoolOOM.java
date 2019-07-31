package com.jvm.outmemory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CC on 2019/7/18.
 * 运行时常量内存溢出
 * 虚拟机参数 -XX:PermSize=10M -XX:MaxPermSize=10M
 */
public class RuntimeConstantPoolOOM {


    public static void main(String[] args) {
        //保持引用，防止FULL GC回收
        List<String> list = new ArrayList<>();
        int i = 1;
        while (true){
            list.add(String.valueOf(i++).intern());
            System.out.println(i);
        }
    }
}
