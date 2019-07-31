package com.jvm.outmemory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CC on 2019/7/18.
 * 测试java堆溢出
 */
public class HeapOOM {
    static class OOMObject{

    }

    //未设置jvm参数时，由于自动扩展，不会内存溢出异常。
    //                                                  最小值         内存堆转出储存快照
    //(idea)run - edit configuration - vm option中设置 -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
    //在i=810326  java.lang.OutOfMemoryError: Java heap space
    //            Dumping heap to java_pid9640.hprof ...
    public static void main(String[] args) throws InterruptedException {
        List<OOMObject> list = new ArrayList<>();
        int i = 1;
        while (true){
            Thread.sleep(5000L);
            System.out.println("i:"+i);
            i++;
            list.add(new OOMObject());
        }
    }
}
