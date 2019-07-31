package com.jvm.outmemory;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by CC on 2019/7/18.
 * 测试栈内存
 * StackOverflowError 异常（线程请求栈深度大于虚拟机最大深度）
 * OutOfMemoryError 异常 （扩展空间不足）  --此测试多线程运行会出现
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
     * 修改前
     * stackLength:11413 时候抛出异常 java.lang.StackOverflowError
     * 修改vm参数后 -Xss128k
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
