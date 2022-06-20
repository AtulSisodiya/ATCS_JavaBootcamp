package com.user.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.user.entity.User;
import com.user.serviceimp.InvalidEmailException;
import com.user.serviceimp.PasswordFormatException;


public interface UserService {
	
	public List<User> getData();
	
	public List<User> putData(@RequestBody User us) throws InvalidEmailException, PasswordFormatException;
	
	public List<User> delete(@PathVariable("user_id") int user_id);

}
