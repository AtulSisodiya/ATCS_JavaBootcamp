package com.ecommerce.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.ecommerce.entity.Cart;
@Service
public class CartServiceImpl implements CartService {

    List<Cart> list = List.of(
            new Cart(1L, "Books", "250", 101L),
            new Cart(2L, "Tshirt", "500", 101L),
            new Cart(3L, "Fridge", "2444", 101L)
    );


	@Override
	public List<Cart> getCartOfUser(Long customerId) {
		return list.stream().filter(cart -> cart.getCustomerId().equals(customerId)).collect(Collectors.toList());
		
	}
}
