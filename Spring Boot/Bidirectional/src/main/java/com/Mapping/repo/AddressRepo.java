package com.Mapping.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Mapping.entity.Address;

public interface AddressRepo extends JpaRepository<Address,Integer> {

}
