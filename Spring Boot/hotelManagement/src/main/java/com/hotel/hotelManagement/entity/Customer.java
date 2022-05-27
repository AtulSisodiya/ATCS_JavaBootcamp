package com.hotel.hotelManagement.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long customerNumber;
	private String Name;
	private String StayinDuration;
	private String Mobile;
	private int AadharcardNo;
	
	public Customer() {}
	public Long getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(Long customerNumber) {
		this.customerNumber = customerNumber;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getStayinDuration() {
		return StayinDuration;
	}
	public void setStayinDuration(String stayinDuration) {
		StayinDuration = stayinDuration;
	}
	public String getMobile() {
		return Mobile;
	}
	public void setMobile(String mobile) {
		Mobile = mobile;
	}
	public int getAadharcardNo() {
		return AadharcardNo;
	}
	public void setAadharcardNo(int aadharcardNo) {
		AadharcardNo = aadharcardNo;
	}
	public Customer(Long customerNumber, String name, String stayinDuration, String mobile, int aadharcardNo) {
		super();
		this.customerNumber = customerNumber;
		Name = name;
		StayinDuration = stayinDuration;
		Mobile = mobile;
		AadharcardNo = aadharcardNo;
	}

	
}
