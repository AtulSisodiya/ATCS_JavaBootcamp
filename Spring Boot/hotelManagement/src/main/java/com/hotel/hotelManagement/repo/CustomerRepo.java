package com.hotel.hotelManagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotel.hotelManagement.entity.Customer;


@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long> {

}
