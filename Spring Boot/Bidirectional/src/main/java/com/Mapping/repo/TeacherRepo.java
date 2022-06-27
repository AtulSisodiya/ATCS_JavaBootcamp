package com.Mapping.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Mapping.entity.Teacher;

public interface TeacherRepo extends JpaRepository<Teacher,Integer> {

}
