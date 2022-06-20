package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.user.entity.Userprofiles;


@Service
public interface UserprofilesService {
	
	public List<Userprofiles> getData();
	
	public Userprofiles getbyuid(@PathVariable("id") int id);
	
	public List<Userprofiles> putData(@RequestBody Userprofiles up);
	
	public List<Userprofiles> delete(@PathVariable("id") int id);
}
