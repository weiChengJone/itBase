package com.base.chapter.map;

import java.util.HashMap;

/**
 * Created by CC on 2019/7/24.
 * ����--��https://www.cnblogs.com/heyonggang/p/9112731.html
 *
 */
public class TestHashMap {
    public static void main(String[] args) {
        test();
    }

    public static void test(){
        String key = "keyOne";
        HashMap map = new HashMap();
        map.put("keyOne","dsfdsfs");
        map.put(null,"this is null");
        System.out.println("��HashMap��keyΪnull:" + map.get(null));
        /**
         * put key����ʲô������-->��key��hash
         * putVal(hash(key), key, value, false, true);
         *      hash(key) --��
         */
        /*
        int h;
        int i = (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
        System.out.println(i);
        int i2 = (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
        System.out.println(i2);
        int i3 = (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
        System.out.println(i3);
        */

        /**
         * putVal������Щ������
         *
         */




    }
}
