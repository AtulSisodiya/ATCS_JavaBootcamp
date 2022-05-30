package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.entity.Address;
import com.ecommerce.service.AddressService;


@RestController
@RequestMapping("/address")
public class AddressController {

	@Autowired
    private AddressService addressService;

    @RequestMapping("/customer/{customerId}")
    public List<Address> getAddress(@PathVariable("customerId") Long customerId) {
        return this.addressService.getAddressOfUser(customerId);
    }
    @PostMapping("/post")
   public void setAddress(@RequestBody Address a) {
    	this.addressService.setAddress(a);
    }
    }

