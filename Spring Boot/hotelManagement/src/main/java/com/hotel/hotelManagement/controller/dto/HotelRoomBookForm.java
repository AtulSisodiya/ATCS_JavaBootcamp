package com.hotel.hotelManagement.controller.dto;

public class HotelRoomBookForm {
	private String Name;
	private String StayinDuration;
	private String Mobile;
	private int AadharcardNo;
	
	public HotelRoomBookForm(String name, String stayinDuration, String mobile, int aadharcardNo) {
		super();
		Name = name;
		StayinDuration = stayinDuration;
		Mobile = mobile;
		AadharcardNo = aadharcardNo;
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
}
