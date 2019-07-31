package com.base.chapter.thread;

/**
 * Created by CC on 2019/7/25.
 */
public class MiloTheadLocal {
    ThreadLocal<Long> longLocal = new ThreadLocal<Long>();
    ThreadLocal<String> stringLocal = new ThreadLocal<String>();

    public void set() {
        longLocal.set(Thread.currentThread().getId());
        stringLocal.set(Thread.currentThread().getName());
    }

    public long getLong() {
        return longLocal.get();
    }

    public String getString() {
        return stringLocal.get();
    }

    public static void main(String[] args) throws InterruptedException {
        final MiloTheadLocal test = new MiloTheadLocal();

        test.set();
        System.out.println(test);
        System.out.println(test.hashCode());
        System.out.println(test.getLong());
        System.out.println(test.getString());


        for (int i = 0;i<3;i++){
            Thread thread=new Thread() {
                public void run() {
                    test.set();
                    System.out.println(test);
                    System.out.println(test.hashCode());
                    System.out.println(test.getLong());
                    System.out.println(test.getString());
                }
            };
            thread.start();
//            thread.join();

        }

        //thread.join():用来指定当前主线程等待其他线程执行完毕后,再来继续执行Thread.join()后面的代码
        System.out.println(test);
        System.out.println(test.hashCode());
        System.out.println(test.getLong());
        System.out.println(test.getString());
//        Thread.sleep(3000);
    }
}

