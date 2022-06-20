package com.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.entity.Userprofiles;
import com.user.service.UserprofilesService;

@RestController
@RequestMapping("/usprofile")
public class Userprofilescontroller {
	@Autowired
	UserprofilesService usps;
	

	@GetMapping("/")
	public List<Userprofiles> getData() {
		return usps.getData();
	}

	@GetMapping("/{id}")
	public List<Userprofiles> getbyuId() {
		return usps.getData();
	}
	@PutMapping("/")
	public List<Userprofiles> putData(@RequestBody Userprofiles emp) {
		return usps.putData(emp);
	}

	@DeleteMapping("/{id}")
	public List<Userprofiles> delete(@PathVariable("id") int id) {
		return usps.delete(id);
	}
}
