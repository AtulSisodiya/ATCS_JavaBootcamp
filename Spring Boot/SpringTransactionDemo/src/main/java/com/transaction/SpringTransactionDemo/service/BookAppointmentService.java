package com.transaction.SpringTransactionDemo.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.transaction.SpringTransactionDemo.controller.dto.AppointmentFormDto;

import com.transaction.SpringTransactionDemo.entity.Appointment;
import com.transaction.SpringTransactionDemo.entity.Patient;
import com.transaction.SpringTransactionDemo.repo.AppointmentRepo;
import com.transaction.SpringTransactionDemo.repo.PatientRepo;

@Service
@Transactional
public class BookAppointmentService {

	@Autowired
	private AppointmentRepo appointmentRepo;

	@Autowired
	private PatientRepo patientRepo;

	public String bookAppointment(AppointmentFormDto appointmentFormDto) {

		Patient patient = new ObjectMapper().convertValue(appointmentFormDto, Patient.class);

		Long patientNumber = patientRepo.save(patient).getPatientNumber();
		

		System.out.println("Patient saved successfully.");

		Appointment appointment = new Appointment(new Date(System.currentTimeMillis()), 101L, patientNumber);

		Long appointmentNumber = appointmentRepo.save(appointment).getAppointmentNumber();
		
		return "Appointment Confirmed."+appointmentNumber;
	}


	public List<Patient> showPatient() {
		
		return patientRepo.findAll();
	}


	public Optional<Appointment> findById(Long appointmentNumber) {
	
		return appointmentRepo.findById(appointmentNumber);
	}


	public Optional<Patient> findById1(Long patientNumber) {
		// TODO Auto-generated method stub
		return patientRepo.findById(patientNumber);
	}


	public void deleteById(Patient patient) {
		
	 patientRepo.delete(patient);
		
	}


	public Patient save(Patient patient) {
		
		return patientRepo.save(patient) ;
	}

	}
