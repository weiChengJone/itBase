package com.jvm.outmemory;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by CC on 2019/7/18.
 * ����ջ�ڴ�
 * StackOverflowError �쳣���߳�����ջ��ȴ�������������ȣ�
 * OutOfMemoryError �쳣 ����չ�ռ䲻�㣩  --�˲��Զ��߳����л����
 */
public class JavaVmStackSOF {
    private int statckLength = 1;

    public void stackLeak(){
        statckLength++;
        stackLeak();
    }

    /**
     *
     * @param args
     * @throws Throwable
     * �޸�ǰ
     * stackLength:11413 ʱ���׳��쳣 java.lang.StackOverflowError
     * �޸�vm������ -Xss128k
     *stackLength:997                 java.lang.StackOverflowError
     */
    public static void main(String[] args) throws Throwable {
        JavaVmStackSOF oom = new JavaVmStackSOF();
        try {
            oom.stackLeak();
        }catch (Throwable e){
            System.out.println("stackLength:" + oom.statckLength);
            throw e;
        }
    }
}
