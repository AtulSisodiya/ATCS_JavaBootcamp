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

import com.user.entity.User;
import com.user.service.UserService;
import com.user.serviceimp.InvalidEmailException;
import com.user.serviceimp.PasswordFormatException;

@RestController
@RequestMapping("/user")
public class Usercontroller {
	@Autowired
	UserService uservice;
	

	@GetMapping("/")
	public List<User> getData() {
		return uservice.getData();
	}

	@PutMapping("/")
	public List<User> putData(@RequestBody User emp) throws InvalidEmailException, PasswordFormatException {
		return uservice.putData(emp);
	}

	@DeleteMapping("/{userid}")
	public List<User> delete(@PathVariable("userid") int userid) {
		return uservice.delete(userid);
	}
}
