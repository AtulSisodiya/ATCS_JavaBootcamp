package com.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.entity.Admission;

public interface AdmissionRepo extends JpaRepository<Admission,Integer> {

}
