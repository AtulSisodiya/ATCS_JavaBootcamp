package com.springboot.contoller;

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

import com.springboot.entity.Student;
import com.springboot.repo.StudentRepo;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	StudentRepo strep;
	
	@GetMapping("/")
	public List<Student> getData(){
		return strep.findAll();
	}
	
	@PostMapping("/")
	public void saveData(@RequestBody Student obj) {
		strep.save(obj);
	}
	
	@PutMapping("/")
	public void updateData(@RequestBody Student obj) {
		strep.save(obj);
	}
	@DeleteMapping("/{id}")
	public List<Student> delete(@PathVariable("id") int id) {
	 strep.deleteById(id);
	return strep.findAll();
	
	}
	
	
	
	
}
