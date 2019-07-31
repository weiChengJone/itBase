package com.base.chapter.collection;

import com.base.chapter.Bird;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by CC on 2019/7/31.
 * ������չ��ΪʲôHashtable��initialCapacity��11����HashMap�е�DEFAULT_INITIAL_CAPACITY��16��
 * ��Ҫ2���ݣ�ΪʲôHashtable��initialCapacity��11��HashMap�е�DEFAULT_INITIAL_CAPACITY��16������Ҫ2���ݣ�
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
     * �̰߳�ȫ
     * ΪʲôHashTable�ĳ�ʼ��11
     *http://www.it1352.com/846533.html
     */
    static void testHashTable(){
        Map<String,Bird> birdMap = new Hashtable<>();
        Long start = new Date().getTime();
        System.out.println("��ʼʱ��:" + start);
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
     * �̰߳�ȫ����������
     * ��������
     */
    static void testConCurrentHashMap(){
        Map<String,Bird> birdMap = new ConcurrentHashMap<>();

    }

    /**
     *treeMap��HashMap����
     * https://www.cnblogs.com/williamjie/p/9099130.html
     */
    static void testTreeMap(){
        Map<String,Bird> birdMap = new TreeMap<>();
        Long start = new Date().getTime();
        System.out.println("��ʼʱ��:" + start);
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
