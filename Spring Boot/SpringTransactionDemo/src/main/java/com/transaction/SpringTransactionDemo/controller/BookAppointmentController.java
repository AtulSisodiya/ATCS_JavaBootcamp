package com.transaction.SpringTransactionDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.transaction.SpringTransactionDemo.controller.dto.AppointmentFormDto;
import com.transaction.SpringTransactionDemo.entity.Appointment;
import com.transaction.SpringTransactionDemo.entity.Patient;
import com.transaction.SpringTransactionDemo.service.BookAppointmentService;

@RestController
public class BookAppointmentController {

	@Autowired
	private BookAppointmentService bookAppointmentService;
	
	@PostMapping("/book")
	public String bookAppointment(@RequestBody AppointmentFormDto appointmentFormDto) {
		return bookAppointmentService.bookAppointment(appointmentFormDto);
	}
	@GetMapping("/response")
	public List<Patient> getAll() {
		return bookAppointmentService.showPatient();
	}
	@GetMapping("appointment/{appointmentNumber}")
	public ResponseEntity<Appointment> findById(@PathVariable Long appointmentNumber) {
		return ResponseEntity.ok(bookAppointmentService.findById(appointmentNumber).orElse(null));
	}
	@GetMapping("patient/{patientNumber}")
	public ResponseEntity<Patient> findById1(@PathVariable Long patientNumber) {
		return ResponseEntity.ok(bookAppointmentService.findById1(patientNumber).orElse(null));
	}
	
	@DeleteMapping("patientdel/{patientNumber}")
	public ResponseEntity<Patient> delete(@PathVariable Long patientNumber) {
		bookAppointmentService.findById1(patientNumber).ifPresent(bookAppointmentService::deleteById);
		return ResponseEntity.ok().build();
	}
	@PutMapping("update/")
	public ResponseEntity<Object> update(@RequestBody Patient patient) {
		return ResponseEntity.ok(bookAppointmentService.save(patient));
	}
	
	
}
