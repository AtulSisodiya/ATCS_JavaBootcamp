package com.hotel.hotelManagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.hotelManagement.entity.RoomDetails;


public interface RoomDetailsRepo extends JpaRepository<RoomDetails, Long> {

}
