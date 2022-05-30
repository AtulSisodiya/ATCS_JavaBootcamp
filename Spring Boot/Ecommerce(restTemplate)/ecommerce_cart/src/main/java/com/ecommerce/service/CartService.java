package com.ecommerce.service;

import java.util.List;

import com.ecommerce.entity.Cart;



public interface CartService {
	public List<Cart> getCartOfUser(Long customerId);
}
