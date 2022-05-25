package com.transaction.SpringTransactionDemo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Appointment {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long AppointmentNumber;
	private Date date;
	private Long DoctorNumber;
	private Long patientNumber;
	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Appointment(Date date, Long doctorNumber, Long patientNumber) {
		super();
//		AppointmentNumber = appointmentNumber;
		this.date = date;
		DoctorNumber = doctorNumber;
		this.patientNumber = patientNumber;
	}
	public Long getAppointmentNumber() {
		return AppointmentNumber;
	}
	public void setAppointmentNumber(Long appointmentNumber) {
		AppointmentNumber = appointmentNumber;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Long getDoctorNumber() {
		return DoctorNumber;
	}
	public void setDoctorNumber(Long doctorNumber) {
		DoctorNumber = doctorNumber;
	}
	public Long getPatientNumber() {
		return patientNumber;
	}
	public void setPatientNumber(Long patientNumber) {
		this.patientNumber = patientNumber;
	}

}
