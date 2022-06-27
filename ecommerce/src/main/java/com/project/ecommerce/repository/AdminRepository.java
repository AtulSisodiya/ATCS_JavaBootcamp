package com.project.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.project.ecommerce.entity.AdminEntity;

@Repository
public interface AdminRepository extends JpaRepository<AdminEntity,Long> {
	@Query("SELECT n FROM AdminEntity n WHERE n.username=:username AND n.password=:password")
	AdminEntity validate(@Param ("username") String username, @Param ("password") String password);
}