package com.base.design.prototype;

import java.util.ArrayList;
import java.util.List;

public class TestProtoType {

	public static void main(String[] args) {
		//testAdduce();
		
		//testShallowClone();
		
		//testDeepClone();
		
		//testDeepCloneSer();
		
		//testDeepCloneSerList();
		
		testDeepCloneUtil();
	}
	
	/**
	 * ��������
	 * stu1��stu2Ϊ��ͬ����
	 * ��==���Ƚϵ��Ƕ�����ڴ��ַ�� 
	 */
	public static void testAdduce(){
		Student stu1 = new Student();  
        stu1.setNumber(12345);  
        Student stu2 = stu1;  
          
        System.out.println("ѧ��1:" + stu1.getNumber());  
        System.out.println("ѧ��2:" + stu2.getNumber());
        System.out.println("ѧ��1:" + stu1.toString());  
        System.out.println("ѧ��2:" + stu2.toString());
	}
	
	
	/**
	 * ǳ��¡ StudentShallow�µ�address��ȻΪһ����������
	 */
	public static void testShallowClone(){
		StudentShallow stu1 = new StudentShallow(12345,new Address("0000","�Ϻ����"));
		StudentShallow stu2 = (StudentShallow)stu1.clone();
		
		stu1.setNumber(11111);
		stu1.getAddress().setRegionCode("1111");
		System.out.println("ѧ��1:" +stu1.getNumber());
		System.out.println("ѧ��2:" +stu2.getNumber());
		System.out.println("ѧ��1:" +stu1.toString());
		System.out.println("ѧ��2:" +stu2.toString());
		
		System.out.println("ѧ��1:" +stu1.getAddress().toString());
		System.out.println("ѧ��2:" +stu2.getAddress().toString());
		
		/**
		 *  ѧ��1:11111
			ѧ��2:12345
			ѧ��1:com.base.design.prototype.StudentShallow@15db9742
			ѧ��2:com.base.design.prototype.StudentShallow@6d06d69c
			ѧ��1:com.base.design.prototype.Address@7852e922
			ѧ��2:com.base.design.prototype.Address@7852e922
		 */
	}
	
	
	
	/**
	 * ��ȸ��ƣ�����ι���ʱ�����Ӷȸ�,�����ʺ�ʹ�����л�����
	 */
	public static void testDeepClone(){
		StudentDeep stu1 = new StudentDeep(12345,new AddressDeep("0000","�Ϻ����"));
		StudentDeep stu2 = (StudentDeep)stu1.clone();
		
		stu1.setNumber(11111);
		stu1.getAddress().setRegionCode("1111");
		System.out.println("ѧ��1:" +stu1.getNumber());
		System.out.println("ѧ��2:" +stu2.getNumber());
		System.out.println("ѧ��1:" +stu1.toString());
		System.out.println("ѧ��2:" +stu2.toString());
		
		System.out.println("ѧ��1:" +stu1.getAddress().getRegionCode());
		System.out.println("ѧ��2:" +stu2.getAddress().getRegionCode());
		System.out.println("ѧ��1:" +stu1.getAddress().toString());
		System.out.println("ѧ��2:" +stu2.getAddress().toString());
		
		/**
		ѧ��1:11111
		ѧ��2:12345
		ѧ��1:com.base.design.prototype.StudentDeep@15db9742
		ѧ��2:com.base.design.prototype.StudentDeep@6d06d69c
		ѧ��1:1111
		ѧ��2:0000
		ѧ��1:com.base.design.prototype.AddressDeep@7852e922
		ѧ��2:com.base.design.prototype.AddressDeep@4e25154f
		 */
	}
	
	/**
	 * ��ȸ��ƣ�ʹ�����л���ʽ
	 */
	public static void testDeepCloneSer(){
		StudentDeep stu1 = new StudentDeep(12345,new AddressDeep("0000","�Ϻ����"));
		StudentDeep stu2 = stu1.myClone();
		
		stu1.setNumber(11111);
		stu1.getAddress().setRegionCode("1111");
		System.out.println("ѧ��1:" +stu1.getNumber());
		System.out.println("ѧ��2:" +stu2.getNumber());
		System.out.println("ѧ��1:" +stu1.toString());
		System.out.println("ѧ��2:" +stu2.toString());
		
		System.out.println("ѧ��1:" +stu1.getAddress().getRegionCode());
		System.out.println("ѧ��2:" +stu2.getAddress().getRegionCode());
		System.out.println("ѧ��1:" +stu1.getAddress().toString());
		System.out.println("ѧ��2:" +stu2.getAddress().toString());
		
		/**
		ѧ��1:11111
		ѧ��2:12345
		ѧ��1:com.base.design.prototype.StudentDeep@15db9742
		ѧ��2:com.base.design.prototype.StudentDeep@6d06d69c
		ѧ��1:1111
		ѧ��2:0000
		ѧ��1:com.base.design.prototype.AddressDeep@7852e922
		ѧ��2:com.base.design.prototype.AddressDeep@4e25154f
		 */
	}
	
	/**
	 * ��ȸ��ƣ�ʹ�����л���ʽ ����list
	 */
	public static void testDeepCloneSerList(){
		StudentDeep stu1 = new StudentDeep(12345,new AddressDeep("0000","�Ϻ����"));
		StudentDeep stu2 = stu1.myClone();
		
		stu1.setNumber(11111);
		stu1.getAddress().setRegionCode("1111");
		
		List<StudentDeep> list = new ArrayList<StudentDeep>();
		list.add(stu1);
		list.add(stu2);
		
		System.out.println("ѧ��1:" +stu1.getNumber());
		System.out.println("ѧ��2:" +stu2.getNumber());
		System.out.println("ѧ��1:" +stu1.toString());
		System.out.println("ѧ��2:" +stu2.toString());
		
		System.out.println("ѧ��1:" +stu1.getAddress().getRegionCode());
		System.out.println("ѧ��2:" +stu2.getAddress().getRegionCode());
		System.out.println("ѧ��1:" +stu1.getAddress().toString());
		System.out.println("ѧ��2:" +stu2.getAddress().toString());
		
		List<StudentDeep> list2 = CloneUtils.depCopy(list);
		for (StudentDeep studentDeep : list2) {
			
			System.out.println("list2:ѧ��:" +studentDeep.getNumber());
			System.out.println("list2:ѧ��:" +studentDeep.toString());
		
			System.out.println("list2:ѧ��:" +studentDeep.getAddress().getRegionCode());
			System.out.println("list2:ѧ��:" +studentDeep.getAddress().toString());
		}
		/**
		ѧ��1:11111
		ѧ��2:12345
		ѧ��1:com.base.design.prototype.StudentDeep@55f96302
		ѧ��2:com.base.design.prototype.StudentDeep@4554617c
		ѧ��1:1111
		ѧ��2:0000
		ѧ��1:com.base.design.prototype.AddressDeep@3d4eac69
		ѧ��2:com.base.design.prototype.AddressDeep@74a14482
		list2:ѧ��:11111
		list2:ѧ��:com.base.design.prototype.StudentDeep@4b67cf4d
		list2:ѧ��:1111
		list2:ѧ��:com.base.design.prototype.AddressDeep@7ea987ac
		list2:ѧ��:12345
		list2:ѧ��:com.base.design.prototype.StudentDeep@12a3a380
		list2:ѧ��:0000
		list2:ѧ��:com.base.design.prototype.AddressDeep@29453f44
		 */
	}
	
	
	/**
	 * 
	 */
	public static void testDeepCloneUtil(){
		StudentDeep stu1 = new StudentDeep(12345,new AddressDeep("0000","�Ϻ����"));
		StudentDeep stu2 = (StudentDeep)CloneUtils.depCopy(stu1);
		
		stu1.setNumber(11111);
		stu1.getAddress().setRegionCode("1111");
		System.out.println("ѧ��1:" +stu1.getNumber());
		System.out.println("ѧ��2:" +stu2.getNumber());
		System.out.println("ѧ��1:" +stu1.toString());
		System.out.println("ѧ��2:" +stu2.toString());
		
		System.out.println("ѧ��1:" +stu1.getAddress().getRegionCode());
		System.out.println("ѧ��2:" +stu2.getAddress().getRegionCode());
		System.out.println("ѧ��1:" +stu1.getAddress().toString());
		System.out.println("ѧ��2:" +stu2.getAddress().toString());
		
		/**
		ѧ��1:11111
		ѧ��2:12345
		ѧ��1:com.base.design.prototype.StudentDeep@15db9742
		ѧ��2:com.base.design.prototype.StudentDeep@6d06d69c
		ѧ��1:1111
		ѧ��2:0000
		ѧ��1:com.base.design.prototype.AddressDeep@7852e922
		ѧ��2:com.base.design.prototype.AddressDeep@4e25154f
		 */
	}
	
}
