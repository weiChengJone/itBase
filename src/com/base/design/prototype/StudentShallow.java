package com.base.design.prototype;

public class StudentShallow implements Cloneable{

	/**
	 * ����
	 */
	private int number;

	private Address address;
	
	
	
	public StudentShallow(int number, Address address) {
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	/**����Ȥ
	 * Remove this "clone" implementation; use a copy constructor or copy factory instead.
	 * ��ʱ��ʵ�ָ��ƹ��캯������
	 * CloneNotSupportedException  �ǲ����׳����쳣��
	 * 
	 */
	@Override
	protected Object clone(){
		StudentShallow stu = null;  
	        try{  
	            stu = (StudentShallow)super.clone();  
	        }catch(CloneNotSupportedException e) {  
	            e.printStackTrace();  
	        }  
	        return stu;
	}
	
}
