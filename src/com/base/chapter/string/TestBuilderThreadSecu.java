package com.base.chapter.string;

/**
 * Created by CC on 2019/7/24.
 * ���builder�߳��Ƿ�ȫ
 */
public class TestBuilderThreadSecu {

    /**
     *
     * һ�ν��  1434054
     * �ڶ��ν�� 1350098
     * @param args
     */
    public static void main(String[] args) {
        //StringBuffer stringBuffer = new StringBuffer();
        StringBuilder stringBuffer = new StringBuilder();

        for (int i = 0;i < 1000;i++){
            Thread thread1 = new Thread(new runableMenthod("aa",stringBuffer));
            thread1.start();
        }
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(stringBuffer.length());
    }

    static class runableMenthod implements Runnable{

        private String str;

        //private StringBuffer stringBuffer;
        private StringBuilder stringBuffer;

        public runableMenthod(){

        }

        //public runableMenthod(String str,StringBuffer stringBuffer){
        public runableMenthod(String str,StringBuilder stringBuffer){
            this.str = str;
            this.stringBuffer = stringBuffer;
        }

        @Override
        public void run() {
//            System.out.println("���:"+str);
            for (int i = 0;i < 1000;i++){
                stringBuffer.append(str);
            }
//            System.out.println("���:"+ str + "����");
//            System.out.println("��ӡ:"+ stringBuffer);
        }
    }
}
