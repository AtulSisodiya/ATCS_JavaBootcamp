package com.ecommerce.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecommerce.entity.Customer;



@Service
public class CustomerServiceImpl implements CustomerService {
	 List<Customer> list = List.of(
	            new Customer(101L, "Atul Sisodiya", "23525625"),
	            new Customer(102L, "Harsh jain", "9999965"),
	            new Customer(103L, "Aditya Bansal", "88847657")
	    );

	 	@Override
	    public Customer getCustomer(Long id) {
	        return list.stream().filter(customer -> customer.getCustomerId().equals(id)).findAny().orElse(null);
	    }
}
