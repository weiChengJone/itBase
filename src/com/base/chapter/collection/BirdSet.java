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
     * HashSet是Set接口的典型实现，HashSet使用HASH算法来存储集合中的元素，因此具有良好的存取和查找性能。当向HashSet集合中存入一个元素时，HashSet会调用该对象的hashCode()方法来得到该对象的hashCode值，
     * 然后根据该HashCode值决定该对象在HashSet中的存储位置。
     * 简化版的hashMap
     */
    static void testHashSet(){
        Set<Bird> birds = new HashSet<>();
        Long start = new Date().getTime();
        System.out.println("开始时间:" + start);
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
        System.out.println("结束时间:" + end);
        System.out.println("耗时:" + (end - start));
        System.out.println(birds.size());

        for (Bird birdItem:
             birds) {
            System.out.println(birdItem.getId());
        }
    }

    /**
     * TreeSet类实现了SortedSet接口，能够对集合中的对象进行排序。
     */
    static void testTreeSet(){
        Set<Bird> birds = new TreeSet<>();
        Long start = new Date().getTime();
        System.out.println("开始时间:" + start);
        //Exception in thread "main" java.lang.ClassCastException: com.base.chapter.Bird cannot be cast to java.lang.Comparable
        //需要重写方法
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
        System.out.println("开始时间:" + start);
        for (int i = 0; i<100 ;i++){
            Bird bird = new Bird();
            bird.setId(String.valueOf(i));
            bird.setNoise(String.valueOf(i));
            birds.add(bird);
        }

        Long end = new Date().getTime();
        System.out.println("结束时间:" + end);
        System.out.println("耗时:" + (end - start));
        System.out.println(birds.size());

        for (Bird birdItem:
                birds) {
            System.out.println(birdItem.getId());
        }
    }

}
