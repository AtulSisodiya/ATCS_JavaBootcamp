package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.ecommerce.entity.Cart;
import com.ecommerce.service.CartService;

@RestController
@RequestMapping("/cart")
public class CartController {
	@Autowired
    private CartService cartService;


	

    @RequestMapping("/customer/{customerId}")
    public List<Cart> getCarts(@PathVariable("customerId") Long customerId) {
        return this.cartService.getCartOfUser(customerId);
    
    }

}
