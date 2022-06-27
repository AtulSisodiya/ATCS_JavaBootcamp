package com.project.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.project.ecommerce.entity.AdminEntity;
import com.project.ecommerce.entity.BuyerEntity;
import com.project.ecommerce.entity.ProductEntity;
import com.project.ecommerce.entity.SellerEntity;
import com.project.ecommerce.repository.AdminRepository;
import com.project.ecommerce.repository.BuyerRepo;
import com.project.ecommerce.repository.ProductsRepository;
import com.project.ecommerce.repository.SellerRepo;
import com.project.ecommerce.request.BuyerRequest;
import com.project.ecommerce.request.LoginRequest;
import com.project.ecommerce.request.SellerRequest;
import com.project.ecommerce.response.ApiResponse;

@Service
public class AdminService {

	@Autowired
	AdminRepository adminRepo;

	@Autowired
	SellerRepo sellerrepo;

	@Autowired
	BuyerRepo buyerrepo;

	@Autowired
	ProductsRepository productrepo;

	// ---------------------- Admin-Login ----------------------------

	public ResponseEntity<ApiResponse> loginAdmin(String username, String password) {
		if (username.equals(null) || username.equals("")) {
			return ResponseEntity.ok(new ApiResponse("Failed", "Please Enter Your Username ", ""));
		}
		if (password.equals(null) || password.equals("")) {
			return ResponseEntity.ok(new ApiResponse("Failed", "Please Enter Your Password ", ""));
		}
		AdminEntity seller = adminRepo.validate(username, password);
		if (seller != null) {
			return ResponseEntity.ok(new ApiResponse("Success", "login Successfull", ""));
		} else {
			return ResponseEntity.ok(new ApiResponse("Failed", "Retry Again with Valid Credentials", ""));
		}
	}

	// ---------- Admin-created-seller -------------------

	public ResponseEntity<ApiResponse> registerSeller(SellerRequest request) {
		SellerEntity entity = new SellerEntity();
		entity.setSellerName(request.getSellerName());
		entity.setUsername(request.getUsername());
		entity.setPassword(request.getPassword());
		entity.setMobileNo(request.getMobileNo());
		entity.setIsApproved("Yes");
		sellerrepo.save(entity);

		return ResponseEntity.ok(new ApiResponse("Success ", " Seller SuccessFully registered ..Seller Id is :-", entity.getSellerId()));
	}

	// -------------------Admin-created-buyer---------------------------

	public ResponseEntity<ApiResponse> registerBuyer(BuyerRequest request) {
		BuyerEntity entity = new BuyerEntity();
		entity.setBuyerName(request.getBuyerName());
		entity.setUsername(request.getUsername());
		entity.setPassword(request.getPassword());
		entity.setMobileNo(request.getMobileNo());
		buyerrepo.save(entity);

		return ResponseEntity.ok(new ApiResponse("Success", " Buyer Successfully Registered & Buyer ID is :-", entity.getBuyerId()));
	}

	// -----------------Admin to see all sellers -----------------------------------

	public List<SellerEntity> findAll() {
		return sellerrepo.findAll();
	}

	// -----------------Admin approving sellers by id-----------

	public ResponseEntity<ApiResponse> sellerApproval(long sellerId) {
		SellerEntity entity = sellerrepo.findById(sellerId).get();
		entity.setIsApproved("Yes");
		sellerrepo.save(entity);
		return ResponseEntity.ok(new ApiResponse("Success", "Updated ", entity));
	}

	// ---------------------------Admin to see All Products---------

	public List<ProductEntity> findAllProducts() {
		return productrepo.findAll();
	}

	// ----------------------Admin approving sellers by id------------

	public ResponseEntity<ApiResponse> productApproval(long productId) {
		ProductEntity entity = productrepo.findById(productId).get();
		entity.setIsApproved("Yes");
		productrepo.save(entity);
		return ResponseEntity.ok(new ApiResponse("Congratulations", "Your product Is Now Approved ", ""));
	}

	// --------------------- delete a seller ------------------

	public ResponseEntity<ApiResponse> deleteSeller(Long sellerId) {
		return sellerrepo.findById(sellerId).map(data -> {
			sellerrepo.delete(data);
			return ResponseEntity.ok(new ApiResponse("Successfull", "Seller deleted successfully ", ""));
		}).orElse(ResponseEntity.ok(new ApiResponse("UnSuccessfull", "Seller not found!! ", "try again")));
	}

	// ----------------------All Buyers----------------
	public List<BuyerEntity> findAllBuyers() {
		return buyerrepo.findAll();
	}

	// ---------------------delete a Buyer-----------------------

	public ResponseEntity<ApiResponse> deleteBuyer(Long buyerId) {
		return buyerrepo.findById(buyerId).map(data -> {
			buyerrepo.delete(data);
			return ResponseEntity.ok(new ApiResponse("Successfull", "Buyer deleted successfully ", ""));
		}).orElse(ResponseEntity.ok(new ApiResponse("UnSuccessfull", "Buyer not found!! ", "try again")));
	}

}
