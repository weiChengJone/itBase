package com.base.chapter.collection;

import com.base.chapter.Bird;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by CC on 2019/7/31.
 * 问题扩展：为什么Hashtable的initialCapacity是11，而HashMap中的DEFAULT_INITIAL_CAPACITY是16，
 * 需要2的幂（为什么Hashtable的initialCapacity是11而HashMap中的DEFAULT_INITIAL_CAPACITY是16并且需要2的幂）
 */
public class BirdMap {
    public static void main(String[] args) {
//        testTreeMap();
        testHashTable();
    }

    static void testHashMap(){
        Map<String,Bird> birdMap = new HashMap<>();

    }

    /**
     * 线程安全
     * 为什么HashTable的初始是11
     *http://www.it1352.com/846533.html
     */
    static void testHashTable(){
        Map<String,Bird> birdMap = new Hashtable<>();
        Long start = new Date().getTime();
        System.out.println("开始时间:" + start);
        int index = 0;
        for (int i = 0; i<100 ;i++){
            Bird bird = new Bird();
            bird.setId(String.valueOf(i));
            bird.setNoise(String.valueOf(i));
            birdMap.put(String.valueOf(index),bird);
            index ++;
        }

        System.out.println(birdMap.size());

        Iterator<String> iterator = birdMap.keySet().iterator();
        while (iterator.hasNext()){
            Bird bird = birdMap.get(iterator.next());
            System.out.println(bird.getId());
        }
    }

    /**
     * 线程安全，分区锁定
     * 两倍扩容
     */
    static void testConCurrentHashMap(){
        Map<String,Bird> birdMap = new ConcurrentHashMap<>();

    }

    /**
     *treeMap和HashMap区别
     * https://www.cnblogs.com/williamjie/p/9099130.html
     */
    static void testTreeMap(){
        Map<String,Bird> birdMap = new TreeMap<>();
        Long start = new Date().getTime();
        System.out.println("开始时间:" + start);
        int index = 0;
        for (int i = 0; i<100 ;i++){
            Bird bird = new Bird();
            bird.setId(String.valueOf(i));
            bird.setNoise(String.valueOf(i));
            birdMap.put(String.valueOf(index),bird);
            index ++;
        }

        System.out.println(birdMap.size());

        Iterator<String> iterator = birdMap.keySet().iterator();
        while (iterator.hasNext()){
            Bird bird = birdMap.get(iterator.next());
            System.out.println(bird.getId());
        }
    }
}
