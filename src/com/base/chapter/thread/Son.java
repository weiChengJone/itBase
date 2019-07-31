package com.base.chapter.thread;

/**
 * Created by CC on 2019/7/25.
 */
public class Son implements Cloneable{
    public static void main(String[] args){
        Son p=new Son();
        System.out.println(p);
        try {
            p.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
//        Thread t = new Thread(new Runnable(){
//            public void run(){
//                ThreadLocal<Son> threadLocal = new ThreadLocal<>();
//                System.out.println(threadLocal);
//                threadLocal.set(p);
//                System.out.println(threadLocal.get());
//                threadLocal.remove();
//                try {
//                    threadLocal.set((Son) p.clone());
//                    System.out.println(threadLocal.get());
//                } catch (CloneNotSupportedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(threadLocal);
//            }});
//        t.start();
    }
}
