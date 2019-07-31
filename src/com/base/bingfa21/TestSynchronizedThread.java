package com.base.bingfa21;

/**
 * Created by CC on 2019/7/21.
 * ���̲߳���synchronized
 * ˼��:ִ�н����ʲô
 *˼����showSynchronizedMenthod2 �� synchronized���ν����ʲô
 * 1.
 */
public class TestSynchronizedThread implements Runnable{


    static TestSynchronizedThread testSynchronizedThread = new TestSynchronizedThread();

    public static void main(String[] args) {
        Thread thread1 = new Thread(testSynchronizedThread);
        Thread thread2 = new Thread(testSynchronizedThread);
        thread1.start();
        thread2.start();
        while (thread1.isAlive()||thread2.isAlive()){

        }
        System.out.println("finish");
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        if (Thread.currentThread().getName().equals("Thread-0")){
            showSynchronizedMenthod();
        }else{
            showSynchronizedMenthod2();
        }
    }

    public synchronized void showSynchronizedMenthod(){
        System.out.println("����һ��synchronized����");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("synchronized�������");
    }

    public void showSynchronizedMenthod2(){
        System.out.println("����һ��synchronized����2");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("synchronized�������2");
    }

}
