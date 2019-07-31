package com.base.chapter.thread;

/**
 * Created by CC on 2019/7/25.
 */
public class TestThreadStatus {


    public static void main(String[] args) throws InterruptedException {

        test1();
    }

    /**
     * 出现了异常  sleep interrupted
     * @param args
     * @throws InterruptedException
     */
    static void test1() throws InterruptedException{
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    System.out.println(Thread.currentThread().isInterrupted());
                }
            }
        });
        thread.start();
        Thread.sleep(3000);
        thread.interrupt();

        Thread.sleep(10000);
    }
}


