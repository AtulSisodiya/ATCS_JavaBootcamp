package com.Mapping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Mapping.entity.Address;
import com.Mapping.repo.AddressRepo;
import com.Mapping.repo.StudentRepo;

@RestController
@RequestMapping("/address")
public class AddressController {
	@Autowired
	AddressRepo repo;

	@Autowired
	StudentRepo studentRepo;

	@GetMapping("/")
	public List<Address> getData() {
		return repo.findAll();
	}
	@PutMapping("/")
	public void updateData(@RequestBody Address obj) {
		repo.save(obj);
	}
	@PostMapping("/")
	public void saveData(@RequestBody Address obj) {
		repo.save(obj);
	}
	@DeleteMapping("/{id}")
	public void deleteData(@PathVariable int id) {

		repo.deleteById(id);
	}
}
