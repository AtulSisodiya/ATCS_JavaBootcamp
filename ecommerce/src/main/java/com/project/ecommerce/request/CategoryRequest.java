package com.project.ecommerce.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CategoryRequest {
	
	private String category;
	
	private ProductRequest products;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public ProductRequest getProducts() {
		return products;
	}

	public void setProducts(ProductRequest products) {
		this.products = products;
	}
	
	

	
	
	
}
