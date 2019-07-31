package com.base.chapter.thread;

import com.base.chapter.Bird;

/**
 * Created by CC on 2019/7/25.
 * /**https://www.cnblogs.com/xzwblog/p/7227509.html
 * 　ThreadLocal的作用是提供线程内的局部变量，这种变量在线程的生命周期内起作用。
 * 作用：提供一个线程内公共变量（比如本次请求的用户信息），
 * 减少同一个线程内多个函数或者组件之间一些公共变量的传递的复杂度，或者为线程提供一个私有的变量副本
 * ，这样每一个线程都可以随意修改自己的变量副本，而不会对其他线程产生影响。
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
        System.out.println("外面：" + testThreadLocal.threadLocal_Bird.hashCode());
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

        System.out.println("外面："+testThreadLocal.threadLocal_Bird.hashCode());


    }
}
