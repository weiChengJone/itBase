package com.jvm.utilUse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by CC on 2019/7/18.
 * ��ʾ�߳�����
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
         * Ϊʲô��������
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
�����
�����س��� 5d  ʮ���Ʊ�ʾ 39 - 1������1������

 */
