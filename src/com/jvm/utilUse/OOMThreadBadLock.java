package com.jvm.utilUse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by CC on 2019/7/18.
 * 演示线程死锁
 *
 */
public class OOMThreadBadLock {

    static class SynAddRunalbe implements Runnable{

        int a,b;

        public SynAddRunalbe(int a,int b){
            this.a = a;
            this.b = b;
        }

        @Override
        public void run() {
            synchronized ((Integer.valueOf(a))){
                synchronized (Integer.valueOf(b)){
                    System.out.println(a + b);
                }
            }
        }

        /**
         *
         * @param args
         * @throws IOException
         * 为什么会死锁？
         *
         */
        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            br.readLine();

            for (int i = 0; i < 100; i++){
                new Thread(new SynAddRunalbe(1,2)).start();
                new Thread(new SynAddRunalbe(2,1)).start();
            }
        }
    }
}
/*
编译后
常量池常量 5d  十进制表示 39 - 1个（从1计数）

 */
