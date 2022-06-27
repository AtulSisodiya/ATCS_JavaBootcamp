package com.Mapping.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Mapping.entity.Admission;

public interface AdmissionRepo extends JpaRepository<Admission,Integer> {

}
