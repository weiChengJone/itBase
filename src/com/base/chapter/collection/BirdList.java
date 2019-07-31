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
        //这样测试有问题，永远第一个耗时最长 ，第一个耗时需要两秒多，最后一个只需要几百毫秒
        Bird bird = new Bird();

        testLinkedList();  //耗时最长
        testVector();
        testArrayList();

        testLinkedList();  //耗时最长
        testVector();
        testArrayList();
        /* 结果1：
            开始时间:1564564347634
            结束时间:1564564347667
            耗时:-33
            开始时间:1564564347667
            结束时间:1564564347713
            耗时:-46
            开始时间:1564564347714
            结束时间:1564564347729
            耗时:-15
         */

        /*
        开始时间:1564564403268
        结束时间:1564564403301
        耗时:-33
        开始时间:1564564403301
        结束时间:1564564403349
        耗时:-48
        开始时间:1564564403349
        结束时间:1564564403365
        耗时:-16
         */

        /*
        开始时间:1564564476525
        结束时间:1564564476559
        耗时:34
        开始时间:1564564476559
        结束时间:1564564476612
        耗时:53
        开始时间:1564564476612
        结束时间:1564564476631
        耗时:19
         */

        /*设置初始长度100000，避免扩容，结果

         */
    }

    /**
     * 是应用广泛的动态数组实现的集合类，不过线程不安全，所以性能要好的多，也可以根据需要增加数组容量，不过与
     Vector的调整逻辑不同，ArrayList增加50%，而Vector会扩容1倍。
     */
    static void testArrayList(){
        List<Bird> birds = new ArrayList<>();
        Long start = new Date().getTime();
        System.out.println("开始时间:" + start);
        for (int i = 0; i<1000000 ;i++){
            Bird bird = new Bird();
            bird.setId(String.valueOf(i));
            bird.setNoise(String.valueOf(i));
            birds.add(bird);
        }
        Long end = new Date().getTime();
        System.out.println("结束时间:" + end);
        System.out.println("耗时:" + (end - start));
    }

    /**
     * 是基于双向链表实现，不需要增加长度，也不是线程安全的
     */
    static void testLinkedList(){
        List<Bird> birds = new LinkedList<>();
        Long start = new Date().getTime();
        System.out.println("开始时间:" + start);
        for (int i = 0; i<1000000 ;i++){
            Bird bird = new Bird();
            bird.setId(String.valueOf(i));
            bird.setNoise(String.valueOf(i));
            birds.add(bird);
        }
        Long end = new Date().getTime();
        System.out.println("结束时间:" + end);
        System.out.println("耗时:" + (end - start));
    }

    /**
     * Vector是Java中线程安全的集合类，如果不是非要线程安全，不必选择使用，毕竟同步需要额外的性能
     开销，底部实现也是数组来操作，再添加数据时，会自动根据需要创建新数组增加长度来保存数据，并拷贝原有数组数据
     */
    static void testVector(){
        List<Bird> birds = new Vector<>();
        Long start = new Date().getTime();
        System.out.println("开始时间:" + start);
        for (int i = 0; i<1000000 ;i++){
            Bird bird = new Bird();
            bird.setId(String.valueOf(i));
            bird.setNoise(String.valueOf(i));
            birds.add(bird);
        }
        Long end = new Date().getTime();
        System.out.println("结束时间:" + end);
        System.out.println("耗时:" + (end - start));
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
