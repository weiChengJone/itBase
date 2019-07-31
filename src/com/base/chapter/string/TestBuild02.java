package com.base.chapter.string;

/**
 * Created by CC on 2019/7/24.
 * 有大量的字符串拼接new好多StringBuilder对象，所以频繁的字符串操作还是得用StringBuilder！
 * 不然虚拟机会分配很对Builder
 */
public class TestBuild02 {

    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = "c";
        String d = "d";
        String e = "e";

        String s1 = a + b;
        String s2 = c + d;
        String s3 = new String("aa");
        String s4 = s1 + s2;
        String s5 = s3 + s4;
    }

    /*  一共使用了4次StringBuilder的创建，
    // class version 51.0 (51)
// access flags 0x21
public class com/base/chapter/string/TestBuild02 {

  // compiled from: TestBuild02.java

  // access flags 0x1
  public <init>()V
   L0
    LINENUMBER 8 L0
    ALOAD 0
    INVOKESPECIAL java/lang/Object.<init> ()V
    RETURN
   L1
    LOCALVARIABLE this Lcom/base/chapter/string/TestBuild02; L0 L1 0
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x9
  public static main([Ljava/lang/String;)V
   L0
    LINENUMBER 11 L0
    LDC "a"
    ASTORE 1
   L1
    LINENUMBER 12 L1
    LDC "b"
    ASTORE 2
   L2
    LINENUMBER 13 L2
    LDC "c"
    ASTORE 3
   L3
    LINENUMBER 14 L3
    LDC "d"
    ASTORE 4
   L4
    LINENUMBER 15 L4
    LDC "e"
    ASTORE 5
   L5
    LINENUMBER 17 L5
    NEW java/lang/StringBuilder
    DUP
    INVOKESPECIAL java/lang/StringBuilder.<init> ()V
    ALOAD 1
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    ALOAD 2
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    INVOKEVIRTUAL java/lang/StringBuilder.toString ()Ljava/lang/String;
    ASTORE 6
   L6
    LINENUMBER 18 L6
    NEW java/lang/StringBuilder
    DUP
    INVOKESPECIAL java/lang/StringBuilder.<init> ()V
    ALOAD 3
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    ALOAD 4
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    INVOKEVIRTUAL java/lang/StringBuilder.toString ()Ljava/lang/String;
    ASTORE 7
   L7
    LINENUMBER 19 L7
    NEW java/lang/String
    DUP
    LDC "aa"
    INVOKESPECIAL java/lang/String.<init> (Ljava/lang/String;)V
    ASTORE 8
   L8
    LINENUMBER 20 L8
    NEW java/lang/StringBuilder
    DUP
    INVOKESPECIAL java/lang/StringBuilder.<init> ()V
    ALOAD 6
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    ALOAD 7
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    INVOKEVIRTUAL java/lang/StringBuilder.toString ()Ljava/lang/String;
    ASTORE 9
   L9
    LINENUMBER 21 L9
    NEW java/lang/StringBuilder
    DUP
    INVOKESPECIAL java/lang/StringBuilder.<init> ()V
    ALOAD 8
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    ALOAD 9
    INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
    INVOKEVIRTUAL java/lang/StringBuilder.toString ()Ljava/lang/String;
    ASTORE 10
   L10
    LINENUMBER 22 L10
    RETURN
   L11
    LOCALVARIABLE args [Ljava/lang/String; L0 L11 0
    LOCALVARIABLE a Ljava/lang/String; L1 L11 1
    LOCALVARIABLE b Ljava/lang/String; L2 L11 2
    LOCALVARIABLE c Ljava/lang/String; L3 L11 3
    LOCALVARIABLE d Ljava/lang/String; L4 L11 4
    LOCALVARIABLE e Ljava/lang/String; L5 L11 5
    LOCALVARIABLE s1 Ljava/lang/String; L6 L11 6
    LOCALVARIABLE s2 Ljava/lang/String; L7 L11 7
    LOCALVARIABLE s3 Ljava/lang/String; L8 L11 8
    LOCALVARIABLE s4 Ljava/lang/String; L9 L11 9
    LOCALVARIABLE s5 Ljava/lang/String; L10 L11 10
    MAXSTACK = 3
    MAXLOCALS = 11
}

     */
}
