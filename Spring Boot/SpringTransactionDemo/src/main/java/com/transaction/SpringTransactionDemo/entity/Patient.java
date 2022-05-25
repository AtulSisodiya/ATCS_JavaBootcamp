package com.transaction.SpringTransactionDemo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
public class Patient {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long patientNumber;
	private String Name;
	private String Gender;
	private String Mobile;
	private int Age;
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(Long patientNumber, String name, String gender, String mobile, int age) {
		super();
		this.patientNumber = patientNumber;
		Name = name;
		Gender = gender;
		Mobile = mobile;
		Age = age;
	}
	public Long getPatientNumber() {
		return patientNumber;
	}
	public void setPatientNumber(Long patientNumber) {
		this.patientNumber = patientNumber;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getMobile() {
		return Mobile;
	}
	public void setMobile(String mobile) {
		Mobile = mobile;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	
	
	
}
