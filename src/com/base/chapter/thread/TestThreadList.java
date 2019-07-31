package com.base.chapter.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by CC on 2019/7/24.
 * 如何保证线程有序的执行
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
     * 方案1(哎呀，还不好实现(需要知道线程的执行时间)，利用alive)
     */
    static void testThread1() throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("第一个执行线程");
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("第2个执行线程");
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("第3个执行线程");
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
     * 方案2 使用join阻塞主线程 ,
     * 新问题--》如果需求是线程thread1，线程2执行完之后再执行thread2呢？
     */
    static void testThread2() throws InterruptedException {


        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("第一个执行线程");
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("第2个执行线程");
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("第3个执行线程");
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
     * 使用Executors线程池实现
     * @throws InterruptedException
     */
    static void testThread3() throws InterruptedException {

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("第一个执行线程");
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("第2个执行线程");
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("第3个执行线程");
            }
        });

        executorService.submit(thread1);
        executorService.submit(thread2);
        executorService.submit(thread3);


    }
}
