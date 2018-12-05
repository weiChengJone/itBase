package com.base.design.prototype;

public class Address {

	private String regionCode;
	
	private String address;

	
	public Address(String regionCode, String address) {
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
	
	
}
