package com.project.ecommerce.service;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.project.ecommerce.entity.BuyerEntity;
import com.project.ecommerce.entity.PlaceOrderEntity;
import com.project.ecommerce.entity.ProductEntity;
import com.project.ecommerce.entity.SellerEntity;
import com.project.ecommerce.repository.BuyerRepo;
import com.project.ecommerce.repository.CategoryRepository;
import com.project.ecommerce.repository.PlaceOrderRepo;
import com.project.ecommerce.repository.ProductsRepository;
import com.project.ecommerce.repository.SellerRepo;
import com.project.ecommerce.request.BuyerRequest;
import com.project.ecommerce.request.LoginRequest;
import com.project.ecommerce.request.PlaceOrderRequest;
import com.project.ecommerce.request.ProductRequest;
import com.project.ecommerce.request.SellerRequest;
import com.project.ecommerce.response.ApiResponse;
import com.project.ecommerce.response.ApiResponse1;
import com.project.ecommerce.response.ProductResponse;

@Service
public class ServiceLayer {

	@Autowired
	SellerRepo sellerRepo;

	@Autowired
	BuyerRepo buyerRepo;

	@Autowired
	CategoryRepository categoryRepo;

	@Autowired
	ProductsRepository productRepo;

	@Autowired
	PlaceOrderRepo placeOrderRepo;

	
	//=================================================================================================
	//                           -------------SellerSection----------------
	//=================================================================================================
	// Seller - Register
	public ResponseEntity<ApiResponse> register(SellerRequest request) {
		String mobile = "^(\\+\\d{2}( )?)?((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$";
		Pattern pattern1 = Pattern.compile(mobile);
		String email = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
		Pattern pattern = Pattern.compile(email);

		if (request.equals(null)) {
			return ResponseEntity.ok(new ApiResponse("Please", "Enter your all details ! Please", ""));
		}

		if (request.getUsername().equals(null) || request.getPassword().isEmpty()) {
			return ResponseEntity.ok(new ApiResponse("Please", "Enter Your Email", ""));
		}

		if (!pattern.matcher(request.getUsername()).matches()) {
			return ResponseEntity.ok(new ApiResponse("Please !", "Enter valid Email ID:", ""));
		}
		if (!pattern1.matcher(request.getMobileNo()).matches()) {
			return ResponseEntity.ok(new ApiResponse("Please! ", "Enter A Valid Mobile no. -:", ""));
		}
		SellerEntity entity = new SellerEntity();
		entity.setSellerName(request.getSellerName());
		entity.setUsername(request.getUsername());
		entity.setPassword(request.getPassword());
		entity.setMobileNo(request.getMobileNo());
		sellerRepo.save(entity);
        return ResponseEntity.ok(new ApiResponse("You Are SuccessFully registered as seller. ", " Your Seller ID is :-",entity.getSellerId()));
	}

	
	//------------ login-seller-----------------------
	public ResponseEntity<ApiResponse> loginSeller(String username ,String password) {
		if (username.equals(null) || username.equals("")) {
			return ResponseEntity.ok(new ApiResponse("Failed", "Please Enter Your Username ", ""));
		}
		if (password.equals(null) || password.equals("")) {
			return ResponseEntity.ok(new ApiResponse("Failed", "Please Enter Your Password ", ""));
		}
		SellerEntity seller = sellerRepo.validate(username ,password);
		if (seller != null) {
			return ResponseEntity.ok(new ApiResponse("Sucess", "SuccessFully login ", ""));
		} else {
			return ResponseEntity.ok(new ApiResponse("Failed", "Retry Again With Valid Credentials ", ""));
		}
	}

	// -----------product entries by sellers-------------------

	public int createAll(Long sellerId, Long category, ProductRequest request) {

		ProductEntity prod = new ProductEntity();
		prod.setIsApproved("No");
		prod.setSellerId(sellerId);
		prod.setActive("enable");
		prod.setProductName(request.getProductName());
		prod.setBrand(request.getBrand());
		prod.setDescription(request.getDescription());
		prod.setProductPrice(request.getProductPrice());
		prod.setQuantity(request.getQuantity());
		prod.setCategory(request.getCategory());
		prod.setCategoryId(category);
		productRepo.save(prod);

		return 1;
	}

	// -----------show all placed Orders to seller-------------
	public List<PlaceOrderEntity> showAllPlacedOrders() {
		return placeOrderRepo.showPlacedOrder("Placed");
	}

	// -------- seller approving placed order------------------

	public ResponseEntity<ApiResponse> placeOrderApproval(long placeOrderId) {
		PlaceOrderEntity entity = placeOrderRepo.findById(placeOrderId).get();
		entity.setOrderStatus("Recieved");
		placeOrderRepo.save(entity);
		return ResponseEntity.ok(new ApiResponse("Congratulations", "Your placed order Is Now Approved By Seller", ""));
	}

	//============================================================================================================================
	//                                  ---------Buyer Section--------
    //==============================================================================================================================
	
	
	// --------------------register-Buyer------------------
	public ResponseEntity<ApiResponse> registerBuyer(BuyerRequest request) {

		String mobile = "^(\\+\\d{2}( )?)?((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$";
		Pattern pattern1 = Pattern.compile(mobile);
		String email = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
		Pattern pattern = Pattern.compile(email);
		if (request.equals(null)) {
			return ResponseEntity.ok(new ApiResponse("Please !", "Enter your all details ! Please", ""));
		}

		if (request.getUsername().equals(null) || request.getPassword().isEmpty()) {
			return ResponseEntity.ok(new ApiResponse("Please !", "Enter Your Email", ""));
		}

		if (!pattern.matcher(request.getUsername()).matches()) {
			return ResponseEntity.ok(new ApiResponse("Please !", "Enter valid Email ID:", ""));
		}
		if (!pattern1.matcher(request.getMobileNo()).matches()) {
			return ResponseEntity.ok(new ApiResponse("Please ", "Enter A Valid Mobile no. -:", ""));
		}

		BuyerEntity entity = new BuyerEntity();
		entity.setBuyerName(request.getBuyerName());
		entity.setUsername(request.getUsername());
		entity.setPassword(request.getPassword());
		entity.setMobileNo(request.getMobileNo());
		buyerRepo.save(entity);
		return ResponseEntity
				.ok(new ApiResponse("Buyer Successfully Registered ", "Your Buyer Id IS :-  ", entity.getBuyerId()));
	}

	//---------------- login-Buyer--------------------------
	public ResponseEntity<ApiResponse> loginBuyer(String username ,String password){
		
			if (username.equals(null) || username.equals("")) {
				return ResponseEntity.ok(new ApiResponse("Failed", "Please Enter Your Username ", ""));
			}
			if (password.equals(null) || password.equals("")) {
				return ResponseEntity.ok(new ApiResponse("Failed", "Please Enter Your Password ", ""));
			}
		BuyerEntity seller = buyerRepo.validate(username, password);
		if (seller != null) {
			return ResponseEntity.ok(new ApiResponse("Success", "SuccessFully login", ""));
		} else {
			return ResponseEntity.ok(new ApiResponse("Failed", "Retry Again With Valid Credentials ", ""));
		}
	}

	// ---------------show all products to  Buyer ----------
	public List<ProductEntity> showAllProducts() {
		return productRepo.showProduct("enable", "Yes");
	}

	// --------show products by products name---------
	public List<ProductEntity> searchProductsByName(String productName) {
		return productRepo.findByProductName("enable", "Yes", productName);
	}

	// ---------------show products by product category-----------
	public List<ProductEntity> searchProductsByCategory(String category) {
		return productRepo.showCategoryProduct("enable", "Yes", category);
	}

	// --------------place-order for a list of product (CART)----
	
	public ResponseEntity<ApiResponse1> placeOrder( long buyerId, PlaceOrderRequest request) {

		PlaceOrderEntity entity = new PlaceOrderEntity();
		entity.setAddress(request.getAddress());
		entity.setState(request.getState());
		entity.setCity(request.getCity());
		entity.setPincode(request.getPincode());
		entity.setOrderStatus("placed");
	//  entity.setDateOrdered("0000-00-00 00:00:00");
		entity.setBuyerId(buyerId);
		placeOrderRepo.save(entity);

		BuyerEntity buyer = buyerRepo.findById(buyerId).get();
		buyer.setPlaceOrderId(entity.getPlaceOrderId());
		buyerRepo.save(buyer);
		List<ProductResponse> list = new ArrayList();
		ProductResponse r;
		ProductEntity prod;
		List<Long> array = request.getProducts();
		for (Long long1 : array) {
			r = new ProductResponse();
			ProductEntity pro = productRepo.findById(long1).get();
			r.setProductId(pro.getProductId());
			r.setProductName(pro.getProductName());
			r.setBrand(pro.getBrand());
			r.setDescription(pro.getDescription());
			r.setProductPrice(pro.getProductPrice());

			prod = productRepo.findById(long1).get();
			prod.setQuantity(prod.getQuantity() - 2);

			productRepo.save(prod);
			list.add(r);
		}

		return ResponseEntity.ok(new ApiResponse1("Congratulations Order Placed", "Your Order Id is :-",
				entity.getPlaceOrderId(), list));
	}

	// --------------------place-order for one product-----------------
	public ResponseEntity<ApiResponse> placeOrder1(long buyerId, long sellerId, Long productId, int quantity, PlaceOrderRequest request) {
		ProductEntity prod = productRepo.findById(productId).get();
		if (prod.getQuantity() > 0) {
			PlaceOrderEntity entity = new PlaceOrderEntity();
			entity.setAddress(request.getAddress());
			entity.setState(request.getState());
			entity.setCity(request.getCity());
			entity.setPincode(request.getPincode());
			entity.setBuyerId(buyerId);
			entity.setOrderStatus("placed");
			placeOrderRepo.save(entity);

			BuyerEntity buyer = buyerRepo.findById(buyerId).get();
			buyer.setPlaceOrderId(entity.getPlaceOrderId());
			buyerRepo.save(buyer);

			prod.setQuantity(prod.getQuantity() - quantity);
			productRepo.save(prod);
			if (prod.getQuantity() == 0) {
				prod.setActive("disable");
				productRepo.save(prod);
			}
			return ResponseEntity.ok(
					new ApiResponse("Congratulations Order Placed ", "Your Order Id is: ", entity.getPlaceOrderId()));
		} else {
			return ResponseEntity.ok(new ApiResponse("Sorry Your Order is Unsuccessfull ", "Product is Disable", "OUT OF Stock"));
		}
	}




}




