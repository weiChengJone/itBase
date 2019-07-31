package com.base.chapter.collection;

import com.base.chapter.Bird;

import java.util.*;

/**
 * Created by CC on 2019/7/31.
 * https://blog.csdn.net/kuangsonghan/article/details/79861170
 */
public class BirdList {

    public static void main(String[] args) {
        testInitSize();
        testSizeAferSize();
    }

    static void testInsertTime(){
        //�������������⣬��Զ��һ����ʱ� ����һ����ʱ��Ҫ����࣬���һ��ֻ��Ҫ���ٺ���
        Bird bird = new Bird();

        testLinkedList();  //��ʱ�
        testVector();
        testArrayList();

        testLinkedList();  //��ʱ�
        testVector();
        testArrayList();
        /* ���1��
            ��ʼʱ��:1564564347634
            ����ʱ��:1564564347667
            ��ʱ:-33
            ��ʼʱ��:1564564347667
            ����ʱ��:1564564347713
            ��ʱ:-46
            ��ʼʱ��:1564564347714
            ����ʱ��:1564564347729
            ��ʱ:-15
         */

        /*
        ��ʼʱ��:1564564403268
        ����ʱ��:1564564403301
        ��ʱ:-33
        ��ʼʱ��:1564564403301
        ����ʱ��:1564564403349
        ��ʱ:-48
        ��ʼʱ��:1564564403349
        ����ʱ��:1564564403365
        ��ʱ:-16
         */

        /*
        ��ʼʱ��:1564564476525
        ����ʱ��:1564564476559
        ��ʱ:34
        ��ʼʱ��:1564564476559
        ����ʱ��:1564564476612
        ��ʱ:53
        ��ʼʱ��:1564564476612
        ����ʱ��:1564564476631
        ��ʱ:19
         */

        /*���ó�ʼ����100000���������ݣ����

         */
    }

    /**
     * ��Ӧ�ù㷺�Ķ�̬����ʵ�ֵļ����࣬�����̲߳���ȫ����������Ҫ�õĶ࣬Ҳ���Ը�����Ҫ��������������������
     Vector�ĵ����߼���ͬ��ArrayList����50%����Vector������1����
     */
    static void testArrayList(){
        List<Bird> birds = new ArrayList<>();
        Long start = new Date().getTime();
        System.out.println("��ʼʱ��:" + start);
        for (int i = 0; i<1000000 ;i++){
            Bird bird = new Bird();
            bird.setId(String.valueOf(i));
            bird.setNoise(String.valueOf(i));
            birds.add(bird);
        }
        Long end = new Date().getTime();
        System.out.println("����ʱ��:" + end);
        System.out.println("��ʱ:" + (end - start));
    }

    /**
     * �ǻ���˫������ʵ�֣�����Ҫ���ӳ��ȣ�Ҳ�����̰߳�ȫ��
     */
    static void testLinkedList(){
        List<Bird> birds = new LinkedList<>();
        Long start = new Date().getTime();
        System.out.println("��ʼʱ��:" + start);
        for (int i = 0; i<1000000 ;i++){
            Bird bird = new Bird();
            bird.setId(String.valueOf(i));
            bird.setNoise(String.valueOf(i));
            birds.add(bird);
        }
        Long end = new Date().getTime();
        System.out.println("����ʱ��:" + end);
        System.out.println("��ʱ:" + (end - start));
    }

    /**
     * Vector��Java���̰߳�ȫ�ļ����࣬������Ƿ�Ҫ�̰߳�ȫ������ѡ��ʹ�ã��Ͼ�ͬ����Ҫ���������
     �������ײ�ʵ��Ҳ�����������������������ʱ�����Զ�������Ҫ�������������ӳ������������ݣ�������ԭ����������
     */
    static void testVector(){
        List<Bird> birds = new Vector<>();
        Long start = new Date().getTime();
        System.out.println("��ʼʱ��:" + start);
        for (int i = 0; i<1000000 ;i++){
            Bird bird = new Bird();
            bird.setId(String.valueOf(i));
            bird.setNoise(String.valueOf(i));
            birds.add(bird);
        }
        Long end = new Date().getTime();
        System.out.println("����ʱ��:" + end);
        System.out.println("��ʱ:" + (end - start));
    }

    static void testInitSize(){
        List<Bird> birds1 = new ArrayList<>();
        List<Bird> birds2 = new Vector<>();
        List<Bird> birds3 = new LinkedList<>();

        System.out.println(birds1.size());
        System.out.println(birds2.size());
        System.out.println(birds3.size());
        System.out.println(birds2.size());
        System.out.println(birds3.size());
        /**
         0
         0
         0
         */
    }

    static void testSizeAferSize(){
        Bird bird = new Bird();
        List<Bird> birds1 = new ArrayList<>();
        birds1.add(bird);
        List<Bird> birds2 = new Vector<>();
        birds2.add(bird);
        List<Bird> birds3 = new LinkedList<>();
        birds3.add(bird);

        System.out.println(birds1.size());
        System.out.println(birds2.size());
        System.out.println(birds3.size());

    }
}
