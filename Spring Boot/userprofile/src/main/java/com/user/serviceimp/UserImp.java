package com.user.serviceimp;

import java.util.List;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.user.entity.User;
import com.user.repo.UserRepo;
import com.user.service.UserService;
@Component
public class UserImp implements UserService{
@Autowired
UserRepo usr;

	

	@Override
	public List<User> getData() {
		return usr.findAll();
	}

	@Override
	public List<User> putData(User us) throws InvalidEmailException, PasswordFormatException {
		String password=us.getPassword();
		String email=us.getEmail();
		
		if(checkEmail(email)==false)
			throw new InvalidEmailException();
		
		
		if(checkPassword(password)==false)
			throw new PasswordFormatException();
		
		else {
		List<User> ce = usr.findAll();

		for (User d : ce) {
			if (d.getUser_id() == us.getUser_id()) {
				usr.save(us);
			}
			
			else usr.save(us);
		}
		}
		List<User>  dept=usr.findAll(); 
		return dept;
	}

	@Override
	public List<User> delete(int user_id) {
		usr.deleteById(user_id);// TODO Auto-generated method stub
		return usr.findAll();
	}

	private boolean checkEmail(String email) {
		String emailRegex ="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
				
		Pattern pat = Pattern.compile(emailRegex); 
			if (email == null)
				return false;
			return pat.matcher(email).matches();
	}

	private boolean checkPassword(String password) {
		String passRegex="^(?=.*[@$!%*#?&])(?=.*[a-zA-Z]).{10,}$";
				Pattern pat = Pattern.compile(passRegex); 
		  if (password == null)
		   return false;
		   return pat.matcher(password).matches();			
				
	}

}
