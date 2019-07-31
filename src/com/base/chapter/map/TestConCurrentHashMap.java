package com.base.chapter.map;

import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by CC on 2019/7/24.
 */
public class TestConCurrentHashMap {

    public static void main(String[] args) {
        test();
    }

    public static void test(){
        ConcurrentHashMap map = new ConcurrentHashMap();
        map.put(null,"this is null");

    }
}
