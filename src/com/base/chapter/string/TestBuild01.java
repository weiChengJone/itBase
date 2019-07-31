package com.base.chapter.string;

/**
 * Created by CC on 2019/7/24.
 * https://baijiahao.baidu.com/s?id=1629804867201303563&wfr=spider&for=pc
 * JVM会帮我们优化使用StringBuilder
 */
public class TestBuild01 {
    public static void main(String[] args) {
        String str = "birdFly";
        String str1 = str + "dogRun" + 10 + "c";
        System.out.println(str1);
    }
}

/*
// class version 51.0 (51)
// access flags 0x21
public class com/base/chapter/string/TestBuild01 {

  // compiled from: TestBuild01.java

  // access flags 0x1
  public <init>()V
   L0
    LINENUMBER 6 L0
    ALOAD 0
    INVOKESPECIAL java/lang/Object.<init> ()V
    RETURN
   L1
    LOCALVARIABLE this Lcom/base/chapter/string/TestBuild01; L0 L1 0
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x9
  public static main([Ljava/lang/String;)V
   L0
    LINENUMBER 8 L0
    LDC "birdFly"
    ASTORE 1
   L1
    LINENUMBER 9 L1
    NEW java/lang/StringBuilder                                                              //这里也是StringBuilder
    DUP
    INVOKESPECIAL java/lang/StringBuilder.<init> ()V
    ALOAD 1
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    LDC "dogRun"
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    BIPUSH 10
    INVOKEVIRTUAL java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
    LDC "c"
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    INVOKEVIRTUAL java/lang/StringBuilder.toString ()Ljava/lang/String;
    ASTORE 2
   L2
    LINENUMBER 10 L2
    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
    ALOAD 2
    INVOKEVIRTUAL java/io/PrintStream.println (Ljava/lang/String;)V
   L3
    LINENUMBER 11 L3
    RETURN
   L4
    LOCALVARIABLE args [Ljava/lang/String; L0 L4 0
    LOCALVARIABLE str Ljava/lang/String; L1 L4 1
    LOCALVARIABLE str1 Ljava/lang/String; L2 L4 2
    MAXSTACK = 2
    MAXLOCALS = 3
}

 */
