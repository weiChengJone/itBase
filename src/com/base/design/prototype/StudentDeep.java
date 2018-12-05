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
	 * ����
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
	
	/**����Ȥ
	 * Remove this "clone" implementation; use a copy constructor or copy factory instead.
	 * ��ʱ��ʵ�ָ��ƹ��캯������
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
	 * . ʵ��Serializable�ӿڣ�ͨ����������л��ͷ����л�ʵ�ֿ�¡������ʵ����������ȿ�¡��
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
