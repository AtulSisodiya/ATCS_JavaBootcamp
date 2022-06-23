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

import com.springboot.entity.Teacher;

import com.springboot.repo.TeacherRepo;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
	@Autowired
	TeacherRepo tcrep;

	@GetMapping("/")
	public List<Teacher> getData() {
		return tcrep.findAll();
	}
	@PostMapping("/")
	public void saveData(@RequestBody Teacher obj) {
		tcrep.save(obj);
	}
	@PutMapping("/")
	public void updateData(@RequestBody Teacher obj) {
		tcrep.save(obj);
	}
	@DeleteMapping("/{id}")
	public List<Teacher> delete(@PathVariable("id") int id) {
	 tcrep.deleteById(id);
	return tcrep.findAll();
	
	}

}
