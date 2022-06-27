package com.project.ecommerce.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name="register_buyer")
public class BuyerEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long buyerId;
	
	private String buyerName;
	private String username;
	private String password;
	private String mobileNo;
	
	@Column(name = "place_order_id")
	private long placeOrderId;

	public BuyerEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BuyerEntity(Long buyerId, String buyerName, String username, String password, String mobileNo,
			long placeOrderId) {
		super();
		this.buyerId = buyerId;
		this.buyerName = buyerName;
		this.username = username;
		this.password = password;
		this.mobileNo = mobileNo;
		this.placeOrderId = placeOrderId;
	}

	@Override
	public String toString() {
		return "BuyerEntity [buyerId=" + buyerId + ", buyerName=" + buyerName + ", username=" + username + ", password="
				+ password + ", mobileNo=" + mobileNo + ", placeOrderId=" + placeOrderId + "]";
	}

	public Long getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(Long buyerId) {
		this.buyerId = buyerId;
	}

	public String getBuyerName() {
		return buyerName;
	}

	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public long getPlaceOrderId() {
		return placeOrderId;
	}

	public void setPlaceOrderId(long placeOrderId) {
		this.placeOrderId = placeOrderId;
	}
	
	
}
