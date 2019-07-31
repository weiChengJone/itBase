package com.base.chapter.string;

/**
 * Created by CC on 2019/7/24.
 */
public class TestBuild {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("birdFly");
        builder.append("dogRun");
        builder.append(10);
        builder.append("c");
        System.out.println(builder);
    }
}
/*
编译后

// class version 51.0 (51)
// access flags 0x21
public class com/base/chapter/string/TestBuild {

? // compiled from: TestBuild.java

? // access flags 0x1
? public <init>()V
? ?L0
? ? LINENUMBER 6 L0
? ? ALOAD 0
? ? INVOKESPECIAL java/lang/Object.<init> ()V
? ? RETURN
? ?L1
? ? LOCALVARIABLE this Lcom/base/chapter/string/TestBuild; L0 L1 0
? ? MAXSTACK = 1
? ? MAXLOCALS = 1

? // access flags 0x9
? public static main([Ljava/lang/String;)V
? ?L0
? ? LINENUMBER 8 L0
? ? NEW java/lang/StringBuilder? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? ? //新建一个Builder
? ? DUP
? ? LDC "birdFly"
? ? INVOKESPECIAL java/lang/StringBuilder.<init> (Ljava/lang/String;)V
? ? ASTORE 1
? ?L1
? ? LINENUMBER 9 L1
? ? ALOAD 1
? ? LDC "dogRun"
? ? INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
? ? POP
? ?L2
? ? LINENUMBER 10 L2
? ? ALOAD 1
? ? BIPUSH 10
? ? INVOKEVIRTUAL java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
? ? POP
? ?L3
? ? LINENUMBER 11 L3
? ? ALOAD 1
? ? LDC "c"
? ? INVOKEVIRTUAL java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
? ? POP
? ?L4
? ? LINENUMBER 12 L4
? ? GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
? ? ALOAD 1
? ? INVOKEVIRTUAL java/io/PrintStream.println (Ljava/lang/Object;)V
? ?L5
? ? LINENUMBER 13 L5
? ? RETURN
? ?L6
? ? LOCALVARIABLE args [Ljava/lang/String; L0 L6 0
? ? LOCALVARIABLE builder Ljava/lang/StringBuilder; L1 L6 1
? ? MAXSTACK = 3
? ? MAXLOCALS = 2
}

 */