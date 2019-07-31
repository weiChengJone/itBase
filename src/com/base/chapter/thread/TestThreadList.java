package com.base.chapter.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by CC on 2019/7/24.
 * ��α�֤�߳������ִ��
 */
public class TestThreadList {

    public static void main(String[] args) throws InterruptedException {

//        testThread1();
//        testThread2();
        testThread3();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * ����1(��ѽ��������ʵ��(��Ҫ֪���̵߳�ִ��ʱ��)������alive)
     */
    static void testThread1() throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("��һ��ִ���߳�");
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("��2��ִ���߳�");
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("��3��ִ���߳�");
            }
        });

        thread1.start();
        Thread.sleep(2000);
        while (!thread1.isAlive()&&!thread2.isAlive()){
            thread2.start();
        }
        Thread.sleep(2000);

        while (!thread2.isAlive()&&!thread3.isAlive()){
            thread3.start();
        }

    }

    /**
     * ����2 ʹ��join�������߳� ,
     * ������--������������߳�thread1���߳�2ִ����֮����ִ��thread2�أ�
     */
    static void testThread2() throws InterruptedException {


        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("��һ��ִ���߳�");
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("��2��ִ���߳�");
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("��3��ִ���߳�");
            }
        });

        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();
        thread3.start();
        thread3.join();

    }

    /**
     * ʹ��Executors�̳߳�ʵ��
     * @throws InterruptedException
     */
    static void testThread3() throws InterruptedException {

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("��һ��ִ���߳�");
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("��2��ִ���߳�");
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("��3��ִ���߳�");
            }
        });

        executorService.submit(thread1);
        executorService.submit(thread2);
        executorService.submit(thread3);


    }
}
