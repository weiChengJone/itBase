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
	 * 测试引用
	 * stu1，stu2为相同对象
	 * “==”比较的是对象的内存地址。 
	 */
	public static void testAdduce(){
		Student stu1 = new Student();  
        stu1.setNumber(12345);  
        Student stu2 = stu1;  
          
        System.out.println("学生1:" + stu1.getNumber());  
        System.out.println("学生2:" + stu2.getNumber());
        System.out.println("学生1:" + stu1.toString());  
        System.out.println("学生2:" + stu2.toString());
	}
	
	
	/**
	 * 浅克隆 StudentShallow下的address依然为一个对象引用
	 */
	public static void testShallowClone(){
		StudentShallow stu1 = new StudentShallow(12345,new Address("0000","上海徐汇"));
		StudentShallow stu2 = (StudentShallow)stu1.clone();
		
		stu1.setNumber(11111);
		stu1.getAddress().setRegionCode("1111");
		System.out.println("学生1:" +stu1.getNumber());
		System.out.println("学生2:" +stu2.getNumber());
		System.out.println("学生1:" +stu1.toString());
		System.out.println("学生2:" +stu2.toString());
		
		System.out.println("学生1:" +stu1.getAddress().toString());
		System.out.println("学生2:" +stu2.getAddress().toString());
		
		/**
		 *  学生1:11111
			学生2:12345
			学生1:com.base.design.prototype.StudentShallow@15db9742
			学生2:com.base.design.prototype.StudentShallow@6d06d69c
			学生1:com.base.design.prototype.Address@7852e922
			学生2:com.base.design.prototype.Address@7852e922
		 */
	}
	
	
	
	/**
	 * 深度复制，当层次过多时，复杂度高,次数适合使用序列化复制
	 */
	public static void testDeepClone(){
		StudentDeep stu1 = new StudentDeep(12345,new AddressDeep("0000","上海徐汇"));
		StudentDeep stu2 = (StudentDeep)stu1.clone();
		
		stu1.setNumber(11111);
		stu1.getAddress().setRegionCode("1111");
		System.out.println("学生1:" +stu1.getNumber());
		System.out.println("学生2:" +stu2.getNumber());
		System.out.println("学生1:" +stu1.toString());
		System.out.println("学生2:" +stu2.toString());
		
		System.out.println("学生1:" +stu1.getAddress().getRegionCode());
		System.out.println("学生2:" +stu2.getAddress().getRegionCode());
		System.out.println("学生1:" +stu1.getAddress().toString());
		System.out.println("学生2:" +stu2.getAddress().toString());
		
		/**
		学生1:11111
		学生2:12345
		学生1:com.base.design.prototype.StudentDeep@15db9742
		学生2:com.base.design.prototype.StudentDeep@6d06d69c
		学生1:1111
		学生2:0000
		学生1:com.base.design.prototype.AddressDeep@7852e922
		学生2:com.base.design.prototype.AddressDeep@4e25154f
		 */
	}
	
	/**
	 * 深度复制，使用序列化方式
	 */
	public static void testDeepCloneSer(){
		StudentDeep stu1 = new StudentDeep(12345,new AddressDeep("0000","上海徐汇"));
		StudentDeep stu2 = stu1.myClone();
		
		stu1.setNumber(11111);
		stu1.getAddress().setRegionCode("1111");
		System.out.println("学生1:" +stu1.getNumber());
		System.out.println("学生2:" +stu2.getNumber());
		System.out.println("学生1:" +stu1.toString());
		System.out.println("学生2:" +stu2.toString());
		
		System.out.println("学生1:" +stu1.getAddress().getRegionCode());
		System.out.println("学生2:" +stu2.getAddress().getRegionCode());
		System.out.println("学生1:" +stu1.getAddress().toString());
		System.out.println("学生2:" +stu2.getAddress().toString());
		
		/**
		学生1:11111
		学生2:12345
		学生1:com.base.design.prototype.StudentDeep@15db9742
		学生2:com.base.design.prototype.StudentDeep@6d06d69c
		学生1:1111
		学生2:0000
		学生1:com.base.design.prototype.AddressDeep@7852e922
		学生2:com.base.design.prototype.AddressDeep@4e25154f
		 */
	}
	
	/**
	 * 深度复制，使用序列化方式 复制list
	 */
	public static void testDeepCloneSerList(){
		StudentDeep stu1 = new StudentDeep(12345,new AddressDeep("0000","上海徐汇"));
		StudentDeep stu2 = stu1.myClone();
		
		stu1.setNumber(11111);
		stu1.getAddress().setRegionCode("1111");
		
		List<StudentDeep> list = new ArrayList<StudentDeep>();
		list.add(stu1);
		list.add(stu2);
		
		System.out.println("学生1:" +stu1.getNumber());
		System.out.println("学生2:" +stu2.getNumber());
		System.out.println("学生1:" +stu1.toString());
		System.out.println("学生2:" +stu2.toString());
		
		System.out.println("学生1:" +stu1.getAddress().getRegionCode());
		System.out.println("学生2:" +stu2.getAddress().getRegionCode());
		System.out.println("学生1:" +stu1.getAddress().toString());
		System.out.println("学生2:" +stu2.getAddress().toString());
		
		List<StudentDeep> list2 = CloneUtils.depCopy(list);
		for (StudentDeep studentDeep : list2) {
			
			System.out.println("list2:学生:" +studentDeep.getNumber());
			System.out.println("list2:学生:" +studentDeep.toString());
		
			System.out.println("list2:学生:" +studentDeep.getAddress().getRegionCode());
			System.out.println("list2:学生:" +studentDeep.getAddress().toString());
		}
		/**
		学生1:11111
		学生2:12345
		学生1:com.base.design.prototype.StudentDeep@55f96302
		学生2:com.base.design.prototype.StudentDeep@4554617c
		学生1:1111
		学生2:0000
		学生1:com.base.design.prototype.AddressDeep@3d4eac69
		学生2:com.base.design.prototype.AddressDeep@74a14482
		list2:学生:11111
		list2:学生:com.base.design.prototype.StudentDeep@4b67cf4d
		list2:学生:1111
		list2:学生:com.base.design.prototype.AddressDeep@7ea987ac
		list2:学生:12345
		list2:学生:com.base.design.prototype.StudentDeep@12a3a380
		list2:学生:0000
		list2:学生:com.base.design.prototype.AddressDeep@29453f44
		 */
	}
	
	
	/**
	 * 
	 */
	public static void testDeepCloneUtil(){
		StudentDeep stu1 = new StudentDeep(12345,new AddressDeep("0000","上海徐汇"));
		StudentDeep stu2 = (StudentDeep)CloneUtils.depCopy(stu1);
		
		stu1.setNumber(11111);
		stu1.getAddress().setRegionCode("1111");
		System.out.println("学生1:" +stu1.getNumber());
		System.out.println("学生2:" +stu2.getNumber());
		System.out.println("学生1:" +stu1.toString());
		System.out.println("学生2:" +stu2.toString());
		
		System.out.println("学生1:" +stu1.getAddress().getRegionCode());
		System.out.println("学生2:" +stu2.getAddress().getRegionCode());
		System.out.println("学生1:" +stu1.getAddress().toString());
		System.out.println("学生2:" +stu2.getAddress().toString());
		
		/**
		学生1:11111
		学生2:12345
		学生1:com.base.design.prototype.StudentDeep@15db9742
		学生2:com.base.design.prototype.StudentDeep@6d06d69c
		学生1:1111
		学生2:0000
		学生1:com.base.design.prototype.AddressDeep@7852e922
		学生2:com.base.design.prototype.AddressDeep@4e25154f
		 */
	}
	
}
