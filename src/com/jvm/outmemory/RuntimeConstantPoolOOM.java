package com.jvm.outmemory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CC on 2019/7/18.
 * ����ʱ�����ڴ����
 * ��������� -XX:PermSize=10M -XX:MaxPermSize=10M
 */
public class RuntimeConstantPoolOOM {


    public static void main(String[] args) {
        //�������ã���ֹFULL GC����
        List<String> list = new ArrayList<>();
        int i = 1;
        while (true){
            list.add(String.valueOf(i++).intern());
            System.out.println(i);
        }
    }
}
