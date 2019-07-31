package com.base.generic.demo3;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class demo {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		
//		List<String>[] lsa = new List<String>[10]; // Not really allowed.    
//		Object o = lsa;    
//		Object[] oa = (Object[]) o;    
//		List<Integer> li = new ArrayList<Integer>();    
//		li.add(new Integer(3));    
//		oa[1] = li; // Unsound, but passes run time store check    
//		String s = lsa[1].get(0); // Run-time error: ClassCastException.
		
//		����Ĳ���
//		https://www.cnblogs.com/coprince/p/8603492.html
//		
		testShow();
	}
	
	
	public static void testShow() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
        //����һ��String���͵�list1�ļ���
        
        List<String> list1=new ArrayList<String>();
        //����һ��Integer���͵�list2�ļ���
        
        List<Integer> list2=new ArrayList<Integer>();
        System.out.println(list1.getClass()==list2.getClass());
        System.out.println(list1.getClass());
        System.out.println(list2.getClass());
        
        list2.getClass().getMethod("add",Object.class).invoke(list2, "abc");
        list2.add(2);
        
        list1.add("ab");
        list1.getClass().getMethod("add", Object.class).invoke(list1, 1);        
        
        for(Iterator<Integer> it=list2.iterator();it.hasNext();){
            //Object i=it.next();
            System.out.print(it.next());
        }
        System.out.println();
        /*
        for (Object s : list1) {
            System.out.print(s+" ");
        }*/
        //????����ת���쳣    
        for(Iterator<String> it=list1.iterator();it.hasNext();){
            //Object i=it.next();
//            System.out.print(it.next()); �쳣
        	 System.out.print(String.valueOf(it.next()));
        }
    }
}
