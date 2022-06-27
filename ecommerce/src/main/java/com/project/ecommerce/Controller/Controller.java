package com.project.ecommerce.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.ecommerce.request.BuyerRequest;
import com.project.ecommerce.request.LoginRequest;
import com.project.ecommerce.request.PlaceOrderRequest;
import com.project.ecommerce.request.ProductRequest;
import com.project.ecommerce.request.SellerRequest;
import com.project.ecommerce.response.ApiResponse;
import com.project.ecommerce.response.ProductResponse;
import com.project.ecommerce.service.ServiceLayer;

@RestController
@CrossOrigin
@RequestMapping("/")
public class Controller {

	@Autowired
	ServiceLayer service;

	// --------------------------SELLER SECTION---------------------
	// ------ seller-register----------

	@PostMapping("/seller/register")
	public ResponseEntity<?> register(@RequestBody SellerRequest request) {
		return service.register(request);
	}

	// ------------ seller login---------------
	@GetMapping("/seller/login")
	public ResponseEntity<?> loginSeller(@RequestParam String username ,@RequestParam String password) {
		return service.loginSeller(username , password);
	}

	// -----------------show all place orders to seller------------------

	@GetMapping("/seller/all/placed/orders")
	public ResponseEntity<ApiResponse> showAllPlacedOrders() {
		ApiResponse apiResponse = new ApiResponse();
		apiResponse.setStatus("success");
		apiResponse.setMessage("All Placed Orders");
		apiResponse.setData(service.showAllPlacedOrders());
		return ResponseEntity.ok(apiResponse);
	}

	// ---------------------Place Order Request Approval-------------------------

	@PutMapping("/approve/place/orders")
	public ResponseEntity<ApiResponse> placeOrderApproval(@RequestParam Long placeOrderId) {
		return service.placeOrderApproval(placeOrderId);
	}
	
	
	
	

	// =========================================================================================

	
	
	
	// PRODUCT SECTION

	@PostMapping("/all/products")
	public ResponseEntity<ApiResponse> createAll(@RequestParam Long sellerId, @RequestParam Long category,
			@RequestBody ProductRequest request) {

		int i = service.createAll(sellerId, category, request);
		if (i > 0) {
			return ResponseEntity.ok(new ApiResponse("success", "Product Registered Suceessfully", ""));
		} else {
			return ResponseEntity.ok(new ApiResponse("failed", " not created Suceessful", ""));
		}
	}

	
	//===========================================================================================
	
	
	// -----------------------------------BUYER SECTION-------------------------
	
	// Buyer-register

	@PostMapping("/buyer/register")
	public ResponseEntity<?> registerBuyer(@RequestBody BuyerRequest request) {
		return service.registerBuyer(request);
	}

	// ---------------- seller=login----------------------------

	@GetMapping("/buyer/login")
	public ResponseEntity<ApiResponse> loginBuyer(@RequestParam String username , @RequestParam String password) {
		return service.loginBuyer(username,password);
	}

	// -----------------------show-all-products-buyer-------------------------

	@GetMapping("/buyer/show/all/products")
	public ResponseEntity<ApiResponse> showAllProducts() {
		ApiResponse apiResponse = new ApiResponse();
		apiResponse.setStatus("success");
		apiResponse.setMessage("All Products");
		apiResponse.setData(service.showAllProducts());
		return ResponseEntity.ok(apiResponse);
	}

	// ---------------------search-products-by-product-name------------------------------------

	@GetMapping("/buyer/search/products/by/product/name")
	public ResponseEntity<ApiResponse> searchProductsByName(@RequestParam String productName) {
		ApiResponse apiResponse = new ApiResponse();
		apiResponse.setStatus("success");
		apiResponse.setMessage("Products You Searched");
		apiResponse.setData(service.searchProductsByName(productName));
		return ResponseEntity.ok(apiResponse);
	}

	// -----------------------search-Product-by-Product-category------------------------------------

	@GetMapping("/buyer/search/products/by/category/name")
	public ResponseEntity<ApiResponse> searchProductsByCategory(@RequestParam String category) {
		ApiResponse apiResponse = new ApiResponse();
		apiResponse.setStatus("Success");
		apiResponse.setMessage("category wise Product You Searched");
		apiResponse.setData(service.searchProductsByCategory(category));
		return ResponseEntity.ok(apiResponse);
	}

	// --------------order Placed by buyer in list--------------------------------

	@PostMapping("/buyer/place/order")
	public ResponseEntity<?> placeOrder(@RequestParam long buyerId,@RequestBody PlaceOrderRequest request) {
		return service.placeOrder( buyerId, request);
	}

	// -------------order Placed for one product----------------

	@PostMapping("/buyer/place/order1")
	public ResponseEntity<?> placeOrder1(@RequestParam long buyerId, @RequestParam long sellerId,
			@RequestParam Long productId, @RequestParam int quantity, @RequestBody PlaceOrderRequest request) {

		return service.placeOrder1(buyerId, sellerId, productId, quantity, request);
	}

}
