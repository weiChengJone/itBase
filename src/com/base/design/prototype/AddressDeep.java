package com.base.design.prototype;

import java.io.Serializable;

public class AddressDeep implements Cloneable,Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2540530741101174621L;

	private String regionCode;
	
	private String address;

	
	public AddressDeep(String regionCode, String address) {
		super();
		this.regionCode = regionCode;
		this.address = address;
	}

	public String getRegionCode() {
		return regionCode;
	}

	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	protected Object clone(){
		AddressDeep addresss = null;  
        try{  
        	addresss = (AddressDeep)super.clone();  
        }catch(CloneNotSupportedException e) {  
            e.printStackTrace();  
        }  
        return addresss;
	}
}
