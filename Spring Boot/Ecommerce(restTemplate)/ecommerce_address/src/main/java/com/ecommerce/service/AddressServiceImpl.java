package com.ecommerce.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.ecommerce.entity.Address;


@Service
public class AddressServiceImpl implements AddressService{
	List<Address> list = List.of(
            new Address(901L, "Vaishali Nagar, Jaipur Rajasthan", "302012", 101L),
            new Address(902L, "Mansarovar, Jaipur Rajasthan", "302024", 102L),
            new Address(903L, "Mahendragarh, Haryana", "203212", 103L)
    );

	@Override
	public List<Address> getAddressOfUser(Long customerId) {
		return list.stream().filter(address -> address.getCustomerId().equals(customerId)).collect(Collectors.toList());
		
	}

	@Override
	public void setAddress(Address address) {
		List<Address> arraylist=new ArrayList<Address>(this.list);
		arraylist.add(address);
		list=arraylist;
		
	}
}
