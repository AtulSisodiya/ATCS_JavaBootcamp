package com.project.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.project.ecommerce.entity.SellerEntity;

@Repository
public interface SellerRepo extends JpaRepository<SellerEntity,Long> {

	@Query("SELECT n FROM SellerEntity n WHERE n.username=:username AND n.password=:password")
	SellerEntity validate(@Param ("username") String username, @Param ("password") String password);
}
