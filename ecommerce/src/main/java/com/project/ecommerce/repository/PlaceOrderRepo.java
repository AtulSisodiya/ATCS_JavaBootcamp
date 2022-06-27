package com.project.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.project.ecommerce.entity.PlaceOrderEntity;

@Repository
public interface PlaceOrderRepo extends JpaRepository<PlaceOrderEntity,Long> {
	@Query("SELECT n FROM PlaceOrderEntity n WHERE n.orderStatus=:orderStatus")
	List<PlaceOrderEntity> showPlacedOrder(@Param ("orderStatus") String orderPlaced);
	
}

