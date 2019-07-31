package com.base.chapter.string;

/**
 * Created by CC on 2019/7/24.
 * 1.8环境
 */
public class TestString {
    public static void main(String[] args) {
//        String s = "12345678";
//        System.out.println(s.charAt(0));
//
//        int i = s.compareTo("12345678a");
//        System.out.println(i);
//
//        s.getBytes();

//        test1();
        testTwo();
    }

    public static void test1(){
        String s1 = "a";
        String s2 = "bc";
        String s3 = "abc";

        System.out.println(s3 == s2+s1);

        String os1 = new String("adsadsada");
        System.out.println(s1 == os1);

        StringBuffer s4 = new StringBuffer("a");
        StringBuffer s5 = new StringBuffer("bc");
        StringBuffer s6 = new StringBuffer("abc");

        StringBuffer s7 = new StringBuffer("a");

        System.out.println(s6 == s4.append(s5));
        System.out.println(s4 == s7);

        String internStr1 = os1.intern();
        System.out.println(internStr1 == os1);
        System.out.println(s1 == internStr1);

        /**
         * https://www.cnblogs.com/pokid/p/10437716.html 解释为甚os1.toString() == internStr1 为false
         */
        System.out.println(os1.toString() == internStr1);

        String omo = "adsadsada";
        System.out.println(omo == internStr1);

    }

    static void testTwo(){
        String s1 = new String();
        System.out.println(s1.equals(""));

        String s = null;
        System.out.println("null".equals(s));
        System.out.println(s);

    }
}
