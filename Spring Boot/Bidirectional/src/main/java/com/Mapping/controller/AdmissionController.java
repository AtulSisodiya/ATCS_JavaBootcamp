package com.Mapping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Mapping.entity.Admission;
import com.Mapping.repo.AdmissionRepo;

@RestController
@RequestMapping("/admission")
public class AdmissionController {
	@Autowired
	AdmissionRepo repo;

	@GetMapping("/")
	public ResponseEntity<List<Admission>>  getData() {
		
		return new ResponseEntity<List<Admission>>(repo.findAll(),HttpStatus.OK);
	}

	@PostMapping("/")
	public ResponseEntity<String> saveData(@RequestBody Admission obj) {

		if (obj.getFees() < 1000) {
			return new ResponseEntity("Error in adding data", HttpStatus.BAD_REQUEST);

		} else {
			repo.save(obj);
			return new ResponseEntity("Record Saved !", HttpStatus.OK);
		}
     
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteData(@PathVariable int id) {
		repo.deleteById(id);
		return new ResponseEntity("Record Deleted!!", HttpStatus.OK);
	}
}
