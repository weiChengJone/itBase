package com.base.design.prototype;

/**
 * Java=和==和===的区别
 * ==和eq的区别
 * @author yangweicheng
 *
 */
public class TestStymbol {

	public static void main(String[] args) {
		
	}
	
	/**
	 * a=b 就是把b的值赋予给a;
	 */
	public static void test1(){
		
	}
	
	/**			==
	 * 1.如果两个值具有相同的类型，那么就检测它们的等同性--->两个值完全相同，它们就相等
	 * 2.如果两个值的类型不同，它们仍然可能相等
	 * 			01.如果一个值是null，另一个值是undefined，它们相等。
	 * 			02.如果一个值是数字，另一个值是字符串，把字符串转换为数字，再用转换后的值进行比较。
	 * 			03.如果一个值为true，将它转化为1，再进行比较。如果一个值为false，把它转化为0，再进行比较。
	 * 			04.如果一个值是对象，另一个值是数字或字符串，将对象转换成原始类型的值，再做比较。可以使用对象的toString()方法或valueOf()方法把对象转化成原始类型的值。
	 */
	public static void test12(){
		
	}
	
	/**			===
	 * 类似==
	 */
	public static void test13(){
		
	}
	
	/**
	 * java里的“==”和“equels”区别
	 * 
	 * 当调用 intern 方法时，如果池已经包含一个等于此 String 对象的字符串（该对象由 equals(Object) 方法确定），
	 * 则返回池中的字符串。否则，将此 String 对象添加到池中，并且返回此 String 对象的引用。所有d调用的同样是a的对象。 
	 */
	public static void test2(){
	 	String a = "java书苑";
        String b = "java书苑";
        String c = new String("java书苑");
        String d = new String("java书苑").intern();

        if(a == b){									//a == b
            System.out.println("a == b");
        }else{
            System.out.println("a != b");
        }

        if(a.equals(b)){							//a.equals(b)
            System.out.println("a.equals(b)");
        }else{
            System.out.println("!a.equals(b)");
        }

        if(a == c){
            System.out.println("a == c");			//a != c
        }else{
            System.out.println("a != c");
        }

        if(a.equals(c)){							//a.equals(c)
            System.out.println("a.equals(c)");
        }else{
            System.out.println("!a.equals(c)");
        }

        if(a == d){									//a == d
            System.out.println("a == d");
        }else{
            System.out.println("a != d");
        }

        if(a.equals(d)){							//a.equals(d)	
            System.out.println("a.equals(d)");
        }else{
            System.out.println("a.equals(d)");
        }
	}

	/**
	 * 为什么“d != d1”
	 * 这里 Integer 会初始化一个[-128,127]的常量池，如果数值在这个范围时，则引用的是同一个对象，如果不在这个范围，
	 * 通过源码可以看出返回的是new了一个新的对象： return new Integer(i);
	 */
	public static void test3(){
		int a = 127;
        int a1 = 127;

        int b = 128;
        int b1 = 128;


        Integer c = 127;
        Integer c1 = 127;

        Integer d = 128;
        Integer d1 = 128;

        if(a == a1){							//a == a1
            System.out.println("a == a1");
        }else{
             System.out.println("a != a1");
        }

        if(b == b1){
            System.out.println("b == b1");    	//b == b1
        }else{
             System.out.println("b != b1");
        }

        if(c == c1){
            System.out.println("c == c1");		//c == c1
        }else{
             System.out.println("c != c1");
        }

        if(d == d1){
            System.out.println("d == d1");		//d != d1
        }else{
             System.out.println("d != d1");
        }
	}
}
