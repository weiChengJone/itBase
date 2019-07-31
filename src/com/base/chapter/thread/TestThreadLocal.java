package com.base.chapter.thread;

import com.base.chapter.Bird;

/**
 * Created by CC on 2019/7/25.
 * /**https://www.cnblogs.com/xzwblog/p/7227509.html
 * ��ThreadLocal���������ṩ�߳��ڵľֲ����������ֱ������̵߳����������������á�
 * ���ã��ṩһ���߳��ڹ������������籾��������û���Ϣ����
 * ����ͬһ���߳��ڶ�������������֮��һЩ���������Ĵ��ݵĸ��Ӷȣ�����Ϊ�߳��ṩһ��˽�еı�������
 * ������ÿһ���̶߳����������޸��Լ��ı���������������������̲߳���Ӱ�졣
 */
public class TestThreadLocal {

    ThreadLocal<Bird> threadLocal_Bird = new ThreadLocal<>();

    void testInit(){
        Bird thread_Bird = new Bird();

        thread_Bird.setId("thread_Bird");
        threadLocal_Bird.set(thread_Bird);
    }

    public static void main(String[] args) {

        /*
        Bird bird = new Bird();
        bird.setId("common_bird");
        System.out.println("bird:" + bird);

        ThreadLocal<Bird> threadLocal_Bird = new ThreadLocal<>();
        Bird thread_Bird = new Bird();

        thread_Bird.setId("thread_Bird");
        threadLocal_Bird.set(thread_Bird);
        System.out.println("threadLocal_Bird:" + thread_Bird);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                ThreadLocal<Bird> threadLocal_Bird = new ThreadLocal<>();
//                threadLocal_Bird.set((Bird) thread_Bird);

            }
        });
    */
        testThreadLocal();
    }

    static void testThreadLocal(){
        final TestThreadLocal testThreadLocal = new TestThreadLocal();
        testThreadLocal.testInit();
        System.out.println("���棺" + testThreadLocal.threadLocal_Bird.hashCode());
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                testThreadLocal.testInit();
                System.out.println(testThreadLocal.threadLocal_Bird.hashCode());
            }
        });

        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("���棺"+testThreadLocal.threadLocal_Bird.hashCode());


    }
}
