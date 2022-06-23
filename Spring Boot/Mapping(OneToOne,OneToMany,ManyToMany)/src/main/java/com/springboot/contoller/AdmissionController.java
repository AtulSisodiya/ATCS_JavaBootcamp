package com.springboot.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.Admission;
import com.springboot.repo.AdmissionRepo;

@RestController
@RequestMapping("/admission")
public class AdmissionController {
	@Autowired
	AdmissionRepo adrep;
	
	@GetMapping("/")
	public List<Admission> getData(){
		return adrep.findAll();
	}
	@PostMapping("/")
	public ResponseEntity<String> addData(@RequestBody Admission ab){
	if(ab.getFees()<10000)
		return new ResponseEntity<String>("Error",HttpStatus.BAD_REQUEST);
	else {
		adrep.save(ab);
		return new ResponseEntity<String>("Success",HttpStatus.CREATED);
	}
	}
	@PutMapping("/")
	public void updateData(@RequestBody Admission obj) {
		adrep.save(obj);
	}
	@DeleteMapping("/{id}")
	public List<Admission> delete(@PathVariable("id") int id) {
	 adrep.deleteById(id);
	return adrep.findAll();
	
	}
	
}
