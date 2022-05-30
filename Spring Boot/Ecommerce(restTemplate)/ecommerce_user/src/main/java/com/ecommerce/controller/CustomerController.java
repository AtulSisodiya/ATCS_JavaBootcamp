package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ecommerce.entity.Customer;
import com.ecommerce.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
    private CustomerService customerService;

    @Autowired
    private RestTemplate restTemplate;

    
    @GetMapping("/{customerId}")
    public Customer getCustomer(@PathVariable("customerId") Long cusotmerId) {

    	  Customer customer = this.customerService.getCustomer(cusotmerId);
    	

        List carts = this.restTemplate.getForObject("http://localhost:9002/cart/customer/" + customer.getCustomerId(), List.class);
        List addresses= this.restTemplate.getForObject("http://localhost:9003/address/customer/" + customer.getCustomerId(), List.class);
       
        customer.setCarts(carts);
        customer.setAddresses(addresses);
          
        return customer;

    }
}
