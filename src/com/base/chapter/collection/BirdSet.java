package com.base.chapter.collection;

import com.base.chapter.Bird;

import java.util.*;

/**
 * Created by CC on 2019/7/31.
 */
public class BirdSet {
    public static void main(String[] args) {
//        testHashSet();
//        testTreeSet();
        testLinkedHashSet();
    }

    /**
     * HashSet��Set�ӿڵĵ���ʵ�֣�HashSetʹ��HASH�㷨���洢�����е�Ԫ�أ���˾������õĴ�ȡ�Ͳ������ܡ�����HashSet�����д���һ��Ԫ��ʱ��HashSet����øö����hashCode()�������õ��ö����hashCodeֵ��
     * Ȼ����ݸ�HashCodeֵ�����ö�����HashSet�еĴ洢λ�á�
     * �򻯰��hashMap
     */
    static void testHashSet(){
        Set<Bird> birds = new HashSet<>();
        Long start = new Date().getTime();
        System.out.println("��ʼʱ��:" + start);
        for (int i = 0; i<100 ;i++){
            Bird bird = new Bird();
            bird.setId(String.valueOf(i));
            bird.setNoise(String.valueOf(i));
            birds.add(bird);
        }

        System.out.println(birds.size());


        Bird bird = new Bird();
        bird.setId(String.valueOf(1));
        bird.setNoise(String.valueOf(1));
        birds.add(bird);

        Long end = new Date().getTime();
        System.out.println("����ʱ��:" + end);
        System.out.println("��ʱ:" + (end - start));
        System.out.println(birds.size());

        for (Bird birdItem:
             birds) {
            System.out.println(birdItem.getId());
        }
    }

    /**
     * TreeSet��ʵ����SortedSet�ӿڣ��ܹ��Լ����еĶ����������
     */
    static void testTreeSet(){
        Set<Bird> birds = new TreeSet<>();
        Long start = new Date().getTime();
        System.out.println("��ʼʱ��:" + start);
        //Exception in thread "main" java.lang.ClassCastException: com.base.chapter.Bird cannot be cast to java.lang.Comparable
        //��Ҫ��д����
        for (int i = 0; i<100 ;i++){
            Bird bird = new Bird();
            bird.setId(String.valueOf(i));
            bird.setNoise(String.valueOf(i));
            birds.add(bird);
        }

        for (Bird birdItem:
                birds) {
            System.out.println(birdItem.getId());
        }

        System.out.println(birds.size());
    }

    static void testLinkedHashSet(){
        Set<Bird> birds = new LinkedHashSet<>();
        Long start = new Date().getTime();
        System.out.println("��ʼʱ��:" + start);
        for (int i = 0; i<100 ;i++){
            Bird bird = new Bird();
            bird.setId(String.valueOf(i));
            bird.setNoise(String.valueOf(i));
            birds.add(bird);
        }

        Long end = new Date().getTime();
        System.out.println("����ʱ��:" + end);
        System.out.println("��ʱ:" + (end - start));
        System.out.println(birds.size());

        for (Bird birdItem:
                birds) {
            System.out.println(birdItem.getId());
        }
    }

}
