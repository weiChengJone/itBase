package com.base.design.prototype;

public class StudentShallow implements Cloneable{

	/**
	 * 工号
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
	
	/**很有趣
	 * Remove this "clone" implementation; use a copy constructor or copy factory instead.
	 * 有时，实现复制构造函数更简单
	 * CloneNotSupportedException  是不会抛出此异常的
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
