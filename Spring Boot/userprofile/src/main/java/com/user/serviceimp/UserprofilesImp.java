package com.user.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.user.entity.Userprofiles;
import com.user.repo.UserprofilesRepo;
import com.user.service.UserprofilesService;
@Component
public class UserprofilesImp implements UserprofilesService{

	@Autowired
	UserprofilesRepo usp;


	@Override
	public List<Userprofiles> getData() {
		// TODO Auto-generated method stub
		return usp.findAll();
	}

	@Override
	public List<Userprofiles> putData(Userprofiles up) {
		List<Userprofiles> ce = usp.findAll();

		for (Userprofiles d : ce) {
			if (d.getId() == up.getId()) {
				usp.save(up);
			}
			
			else usp.save(up);
		}
		List<Userprofiles>  dept=usp.findAll(); 
		return dept;
	}

	@Override
	public List<Userprofiles> delete(int id) {
		usp.deleteById(id);// TODO Auto-generated method stub
		return usp.findAll();
	}

	@Override
	public Userprofiles getbyuid(int id) {
		Userprofiles dept=usp.findById(id).get();  
		return dept;
		
	}

	
}
