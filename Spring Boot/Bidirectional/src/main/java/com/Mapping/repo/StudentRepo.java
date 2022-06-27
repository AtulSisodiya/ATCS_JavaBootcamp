package com.Mapping.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Mapping.entity.Student;

public interface StudentRepo extends JpaRepository<Student,Integer> {

}
