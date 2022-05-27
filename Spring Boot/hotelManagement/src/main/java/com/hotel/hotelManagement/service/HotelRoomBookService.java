package com.hotel.hotelManagement.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hotel.hotelManagement.controller.dto.HotelRoomBookForm;
import com.hotel.hotelManagement.entity.Customer;
import com.hotel.hotelManagement.entity.RoomDetails;
import com.hotel.hotelManagement.repo.CustomerRepo;
import com.hotel.hotelManagement.repo.RoomDetailsRepo;


@Service
@Transactional
public class HotelRoomBookService {

	@Autowired
	private CustomerRepo customerRepo;

	@Autowired
	private RoomDetailsRepo roomDetailsRepo;

	public String HotelRoomBook(HotelRoomBookForm hrbf) {

		Customer customer = new ObjectMapper().convertValue(hrbf, Customer.class);

		Long customerNumber = customerRepo.save(customer).getCustomerNumber();
		
		System.out.println("Customer details added successfully.");

		RoomDetails roomDetails = new RoomDetails(customerNumber, new Date(System.currentTimeMillis()), 107L, customerNumber);

		Long unqNumber = roomDetailsRepo.save(roomDetails).getUnqNumber();
		
		return "Room booked!! your room number is ."+unqNumber;
	}


	public List<Customer> showCustomer() {
		
		return customerRepo.findAll();
	}


	public Optional<RoomDetails> findById(Long unqNumber) {
	
		return roomDetailsRepo.findById(unqNumber);
	}


	public Optional<Customer> findById1(Long customerNumber) {
		
		return customerRepo.findById(customerNumber);
	}


	public void deleteById(Customer customer) {
		
	 customerRepo.delete(customer);
		
	}


	public Customer save(Customer customer) {
		
		return customerRepo.save(customer) ;
	}

	}
