package com.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.entity.Teacher;

public interface TeacherRepo extends JpaRepository<Teacher,Integer>{

}
