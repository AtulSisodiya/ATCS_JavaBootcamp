package com.springboot.contoller;

import java.util.ArrayList;
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

import com.springboot.entity.Address;
import com.springboot.entity.Student;
import com.springboot.repo.AddressRepo;
import com.springboot.repo.StudentRepo;


@RestController
@RequestMapping("/address")
public class AddressController {
	@Autowired
	AddressRepo addrep;
	
	@Autowired
	StudentRepo studentrepo;
	
	@GetMapping("/")
	public List<Address> getData(){
		return addrep.findAll();
	}
	@PostMapping("/")
	public void saveData(@RequestBody Address obj) {
		addrep.save(obj);
	}
	@PutMapping("/")
	public void updateData(@RequestBody Address obj) {
		addrep.save(obj);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") int id) {
		List<Student> studentList = studentrepo.findAll();

		for (Student stu : studentList) {
			List<Address> addressList = stu.getAddresses();
			List<Address> addressListNew=new ArrayList<Address>();
			for (Address ad : addressList) {
               if(ad.getId()==id)
               {
            	  
               }
               else
               {
            	   addressListNew.add(ad);  
               }
			}
			
			stu.setAddresses(addressListNew);
			studentrepo.save(stu);
		}

		addrep.deleteById(id);
	}
	
	}
	

