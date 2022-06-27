package com.project.ecommerce.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.ecommerce.request.BuyerRequest;
import com.project.ecommerce.request.LoginRequest;
import com.project.ecommerce.request.SellerRequest;
import com.project.ecommerce.response.ApiResponse;
import com.project.ecommerce.service.AdminService;

@RestController
@CrossOrigin
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	AdminService adminService;

	// ------------------------------admin-Login---------------------------------
	@GetMapping("/login")
	public ResponseEntity<?> loginAdmin(@RequestParam String username ,@RequestParam String password ) {
		return adminService.loginAdmin(username,password);
	}

	// ---------------------Admin created seller------------------------------
	@PostMapping("/create/seller")
	public ResponseEntity<?> registerSeller(@RequestBody SellerRequest request) {
		return adminService.registerSeller(request);
	}

	// -----------------------All-seller-details--------------------------------
	@GetMapping("/show/all/sellers")
	public ResponseEntity<ApiResponse> findAll() {
		ApiResponse apiResponse = new ApiResponse();
		apiResponse.setStatus("success");
		apiResponse.setMessage("All Registerd Sellers");
		apiResponse.setData(adminService.findAll());
		return ResponseEntity.ok(apiResponse);
	}

	// ------- ----------update seller Is-Approve-------------------------------
	@PutMapping("/approve/seller")
	public ResponseEntity<ApiResponse> sellerApproval(@RequestParam Long sellerId) {
		return adminService.sellerApproval(sellerId);
	}

	// ------------------delete a seller-------------------------------------
	@DeleteMapping("/delete/seller")
	public ResponseEntity<?> deleteSeller(@RequestParam Long sellerId) {
		return adminService.deleteSeller(sellerId);
	}

	// --------------------All Products -----------------------
	@GetMapping("/show/all/products")
	public ResponseEntity<ApiResponse> findAllProducts() {

		ApiResponse apiResponse = new ApiResponse();
		apiResponse.setStatus("success");
		apiResponse.setMessage("All Products");
		apiResponse.setData(adminService.findAllProducts());
		return ResponseEntity.ok(apiResponse);
	}

	// --------------------Admin-approving-products----------
	@PutMapping("/approve/product")
	public ResponseEntity<ApiResponse> productApproval(@RequestParam Long productId) {
		return adminService.productApproval(productId);
	}

	// ============================-------- All Buyers---------================================

	@GetMapping("/show/all/buyers")
	public ResponseEntity<ApiResponse> findAllBuyers() {
		ApiResponse apiResponse = new ApiResponse();
		apiResponse.setStatus("success");
		apiResponse.setMessage("All Registered Buyers");
		apiResponse.setData(adminService.findAllBuyers());
		return ResponseEntity.ok(apiResponse);
	}

	// -------------------Admin created buyer----------------------------------
	@PostMapping("/create/buyer")
	public ResponseEntity<?> registerBuyer(@RequestBody BuyerRequest request) {
		return adminService.registerBuyer(request);
	}

	// ------------------------delete a buyer-------------------------------------
	@DeleteMapping("/delete/buyer")
	public ResponseEntity<?> deleteBuyer(@RequestParam Long buyerId) {
		return adminService.deleteBuyer(buyerId);
	}

}
