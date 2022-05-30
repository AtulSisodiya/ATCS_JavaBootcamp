package com.ecommerce.service;

import java.util.List;

import com.ecommerce.entity.Address;


public interface AddressService {
	public List<Address> getAddressOfUser(Long customerId);
	
	public void setAddress(Address address);
}
