package com.base.chapter.string;

/**
 * Created by CC on 2019/7/24.
 */
public class TestBufferThreadSecu {
    /**
     * ʹ��StringBuffer���� ��� 2000000.
     * main�̹߳ҵ�����ѭ��threadû�������棬��Ԫ����ͬ��
     *
     * @param args
     */
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();

        for (int i = 0;i < 1000;i++){
            Thread thread1 = new Thread(new runableMenthod("aa",stringBuffer));
            thread1.start();
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(stringBuffer.length());
    }

    static class runableMenthod implements Runnable{

        private String str;

        private StringBuffer stringBuffer;

        public runableMenthod(){

        }

        public runableMenthod(String str,StringBuffer stringBuffer){
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
