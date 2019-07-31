package com.jvm.outmemory;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * Created by CC on 2019/7/18.
 * 直接内存溢出
 * 参数 -Xms20M -XX:MaxDirectMemorySize=10M
 */
public class DirectMemoryOOM {

    private static final int _1MB = 1024 * 1024;

    public static void main(String[] args) throws IllegalAccessException {
        Field unsafeField = Unsafe.class.getDeclaredFields()[0];
        unsafeField.setAccessible(true);
        Unsafe unsafe = (Unsafe)unsafeField.get(null);
        int i = 1;
        while(true){
            System.out.println(i);
            unsafe.allocateMemory(_1MB);
            i++;
        }
    }
}
