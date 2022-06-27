package com.project.ecommerce.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name="place_order")
public class PlaceOrderEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long placeOrderId;
	
	private String address;
	private String state;
	private String city;
	private String pincode;
	private String orderStatus;
	//private String dateOrdered; 
	
	private long buyerId;
	
	@OneToOne
	@JoinColumn(name = "place_order_id")
	BuyerEntity buyerDetail;

	public PlaceOrderEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PlaceOrderEntity(Long placeOrderId, String address, String state, String city, String pincode,
			String orderStatus, long buyerId, BuyerEntity buyerDetail) {
		super();
		this.placeOrderId = placeOrderId;
		this.address = address;
		this.state = state;
		this.city = city;
		this.pincode = pincode;
		this.orderStatus = orderStatus;
		this.buyerId = buyerId;
		this.buyerDetail = buyerDetail;
	}

	@Override
	public String toString() {
		return "PlaceOrderEntity [placeOrderId=" + placeOrderId + ", address=" + address + ", state=" + state
				+ ", city=" + city + ", pincode=" + pincode + ", orderStatus=" + orderStatus + ", dateOrdered="
				 + ", buyerId=" + buyerId + ", buyerDetail=" + buyerDetail + "]";
	}

	public Long getPlaceOrderId() {
		return placeOrderId;
	}

	public void setPlaceOrderId(Long placeOrderId) {
		this.placeOrderId = placeOrderId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public long getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(long buyerId) {
		this.buyerId = buyerId;
	}

//	public String getDateOrdered() {
//		return dateOrdered;
//	}
//
//	public void setDateOrdered(String dateOrdered) {
//		this.dateOrdered = dateOrdered;
//	}


	
}
