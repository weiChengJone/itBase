package com.base.chapter.string;

/**
 * Created by CC on 2019/7/24.
 * 检查builder线程是否安全
 */
public class TestBuilderThreadSecu {

    /**
     *
     * 一次结果  1434054
     * 第二次结果 1350098
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
//            System.out.println("添加:"+str);
            for (int i = 0;i < 1000;i++){
                stringBuffer.append(str);
            }
//            System.out.println("添加:"+ str + "结束");
//            System.out.println("打印:"+ stringBuffer);
        }
    }
}
