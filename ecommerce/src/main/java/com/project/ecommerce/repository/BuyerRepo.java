package com.project.ecommerce.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.project.ecommerce.entity.BuyerEntity;


@Repository
public interface BuyerRepo extends JpaRepository<BuyerEntity,Long> {
	@Query("SELECT n FROM BuyerEntity n WHERE n.username=:username AND n.password=:password")
	BuyerEntity validate(@Param ("username") String username, @Param ("password") String password);
}
