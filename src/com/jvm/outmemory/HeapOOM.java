package com.jvm.outmemory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CC on 2019/7/18.
 * ����java�����
 */
public class HeapOOM {
    static class OOMObject{

    }

    //δ����jvm����ʱ�������Զ���չ�������ڴ�����쳣��
    //                                                  ��Сֵ         �ڴ��ת���������
    //(idea)run - edit configuration - vm option������ -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
    //��i=810326  java.lang.OutOfMemoryError: Java heap space
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
