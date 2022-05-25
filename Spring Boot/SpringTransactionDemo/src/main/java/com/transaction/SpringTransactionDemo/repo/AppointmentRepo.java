package com.transaction.SpringTransactionDemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.transaction.SpringTransactionDemo.entity.Appointment;
@Repository
public interface AppointmentRepo extends JpaRepository<Appointment, Long>{

}
