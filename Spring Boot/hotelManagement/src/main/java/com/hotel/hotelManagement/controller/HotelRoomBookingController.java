package com.hotel.hotelManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.hotelManagement.controller.dto.HotelRoomBookForm;
import com.hotel.hotelManagement.entity.Customer;
import com.hotel.hotelManagement.entity.RoomDetails;
import com.hotel.hotelManagement.service.HotelRoomBookService;

@RestController

public class HotelRoomBookingController {
	@Autowired
	private HotelRoomBookService hotelRoomBookService;
	
	@PostMapping("/book")
	public String hotelRoomBookForm(@RequestBody HotelRoomBookForm hrb) {
		return hotelRoomBookService.HotelRoomBook(hrb);
	}
	@GetMapping("/getall")
	public List<Customer> getAll() {
		return hotelRoomBookService.showCustomer();
	}
	@GetMapping("room/{roomNumber}")
	public ResponseEntity<RoomDetails> findById(@PathVariable Long unqNumber) {
		return ResponseEntity.ok(hotelRoomBookService.findById(unqNumber).orElse(null));
	}
	@GetMapping("customer/{patientNumber}")
	public ResponseEntity<Customer> findById1(@PathVariable Long customerNumber) {
		return ResponseEntity.ok(hotelRoomBookService.findById1(customerNumber).orElse(null));
	}
	
	@DeleteMapping("customerdel/{customerNumber}")
	public ResponseEntity<Customer> delete(@PathVariable Long customerNumber) {
		hotelRoomBookService.findById1(customerNumber).ifPresent(hotelRoomBookService::deleteById);
		return ResponseEntity.ok().build();
	}
	@PutMapping("update/")
	public ResponseEntity<Object> update(@RequestBody Customer customer) {
		return ResponseEntity.ok(hotelRoomBookService.save(customer));
	}
	
}
