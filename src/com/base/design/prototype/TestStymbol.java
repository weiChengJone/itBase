package com.base.design.prototype;

/**
 * Java=��==��===������
 * ==��eq������
 * @author yangweicheng
 *
 */
public class TestStymbol {

	public static void main(String[] args) {
		
	}
	
	/**
	 * a=b ���ǰ�b��ֵ�����a;
	 */
	public static void test1(){
		
	}
	
	/**			==
	 * 1.�������ֵ������ͬ�����ͣ���ô�ͼ�����ǵĵ�ͬ��--->����ֵ��ȫ��ͬ�����Ǿ����
	 * 2.�������ֵ�����Ͳ�ͬ��������Ȼ�������
	 * 			01.���һ��ֵ��null����һ��ֵ��undefined��������ȡ�
	 * 			02.���һ��ֵ�����֣���һ��ֵ���ַ��������ַ���ת��Ϊ���֣�����ת�����ֵ���бȽϡ�
	 * 			03.���һ��ֵΪtrue������ת��Ϊ1���ٽ��бȽϡ����һ��ֵΪfalse������ת��Ϊ0���ٽ��бȽϡ�
	 * 			04.���һ��ֵ�Ƕ�����һ��ֵ�����ֻ��ַ�����������ת����ԭʼ���͵�ֵ�������Ƚϡ�����ʹ�ö����toString()������valueOf()�����Ѷ���ת����ԭʼ���͵�ֵ��
	 */
	public static void test12(){
		
	}
	
	/**			===
	 * ����==
	 */
	public static void test13(){
		
	}
	
	/**
	 * java��ġ�==���͡�equels������
	 * 
	 * ������ intern ����ʱ��������Ѿ�����һ�����ڴ� String ������ַ������ö����� equals(Object) ����ȷ������
	 * �򷵻س��е��ַ��������򣬽��� String ������ӵ����У����ҷ��ش� String ��������á�����d���õ�ͬ����a�Ķ��� 
	 */
	public static void test2(){
	 	String a = "java��Է";
        String b = "java��Է";
        String c = new String("java��Է");
        String d = new String("java��Է").intern();

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
	 * Ϊʲô��d != d1��
	 * ���� Integer ���ʼ��һ��[-128,127]�ĳ����أ������ֵ�������Χʱ�������õ���ͬһ������������������Χ��
	 * ͨ��Դ����Կ������ص���new��һ���µĶ��� return new Integer(i);
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
