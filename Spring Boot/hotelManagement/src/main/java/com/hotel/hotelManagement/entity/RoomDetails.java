package com.hotel.hotelManagement.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RoomDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long unqNumber;
	private Date date;
	private Long RoomNumber;
	private Long customerNumber;
	public RoomDetails() {
		
	}
	public Long getUnqNumber() {
		return unqNumber;
	}
	public void setUnqNumber(Long unqNumber) {
		this.unqNumber = unqNumber;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Long getRoomNumber() {
		return RoomNumber;
	}
	public void setRoomNumber(Long roomNumber) {
		RoomNumber = roomNumber;
	}
	public Long getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(Long customerNumber) {
		this.customerNumber = customerNumber;
	}
	public RoomDetails(Long unqNumber, Date date, Long roomNumber, Long customerNumber) {
		super();
		this.unqNumber = unqNumber;
		this.date = date;
		RoomNumber = roomNumber;
		this.customerNumber = customerNumber;
	}
	
	
}
