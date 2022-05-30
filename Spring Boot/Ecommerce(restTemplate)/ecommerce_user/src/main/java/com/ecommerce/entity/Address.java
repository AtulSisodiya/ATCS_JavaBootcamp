package com.ecommerce.entity;

public class Address {
	private Long addId;
    private String location;
    private String pincode;
    private Long customerId;
    public Address() {}
	public Long getAddId() {
		return addId;
	}
	public void setAddId(Long addId) {
		this.addId = addId;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public Address(Long addId, String location, String pincode, Long customerId) {
		super();
		this.addId = addId;
		this.location = location;
		this.pincode = pincode;
		this.customerId = customerId;
	}
}
