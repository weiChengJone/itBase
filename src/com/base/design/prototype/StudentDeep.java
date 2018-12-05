package com.base.design.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class StudentDeep implements Cloneable,Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3110197576757589765L;

	/**
	 * 工号
	 */
	private int number;

	private AddressDeep address;
	
	
	
	public StudentDeep(int number, AddressDeep address) {
		super();
		this.number = number;
		this.address = address;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public AddressDeep getAddress() {
		return address;
	}

	public void setAddress(AddressDeep address) {
		this.address = address;
	}
	
	/**很有趣
	 * Remove this "clone" implementation; use a copy constructor or copy factory instead.
	 * 有时，实现复制构造函数更简单
	 */
	@Override
	protected Object clone(){
		StudentDeep stu = null;  
	        try{  
	            stu = (StudentDeep)super.clone();  
	        }catch(CloneNotSupportedException e) {  
	            e.printStackTrace();  
	        }  
	        stu.address = (AddressDeep)address.clone();
	        return stu;
	}
	
	/**
	 * . 实现Serializable接口，通过对象的序列化和反序列化实现克隆，可以实现真正的深度克隆。
	 * @return
	 */
	public StudentDeep myClone(){
		StudentDeep stu = null;
		try {
		 ByteArrayOutputStream baos = new ByteArrayOutputStream();
		 ObjectOutputStream oos = new ObjectOutputStream(baos);
		 oos.writeObject(this);
		 
		 ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
		 ObjectInputStream ois = new ObjectInputStream(bais);
		 stu = (StudentDeep) ois.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return stu;
	}
}
