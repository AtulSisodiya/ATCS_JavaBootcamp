package com.ecommerce.entity;

import java.util.ArrayList;
import java.util.List;



public class Customer {
	 private Long customerId;
	    private String name;
	    private String phone;

	    List<Cart> carts=new ArrayList<>();

	    List<Address> addresses=new ArrayList<>();
	    
		
		public Customer(Long customerId, String name, String phone, List<Cart> carts, List<Address> addresses) {
			super();
			this.customerId = customerId;
			this.name = name;
			this.phone = phone;
			this.carts = carts;
			this.addresses = addresses;
		}


		public Long getCustomerId() {
			return customerId;
		}


		public void setCustomerId(Long customerId) {
			this.customerId = customerId;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getPhone() {
			return phone;
		}


		public void setPhone(String phone) {
			this.phone = phone;
		}


		public List<Cart> getCarts() {
			return carts;
		}


		public void setCarts(List<Cart> carts) {
			this.carts = carts;
		}


		public List<Address> getAddresses() {
			return addresses;
		}


		public void setAddresses(List<Address> addresses) {
			this.addresses = addresses;
		}


		public Customer(Long customerId, String name, String phone) {
			super();
			this.customerId = customerId;
			this.name = name;
			this.phone = phone;
		}
		
	    
	    

}
