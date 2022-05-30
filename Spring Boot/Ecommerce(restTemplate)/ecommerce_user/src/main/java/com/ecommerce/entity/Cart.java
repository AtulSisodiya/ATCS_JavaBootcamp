package com.ecommerce.entity;

public class Cart {
	private Long cardId;
    private String product;
    private String amount;
    private Long customerId;
    
    public Cart() {}
	public Long getCardId() {
		return cardId;
	}
	public void setCardId(Long cardId) {
		this.cardId = cardId;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public Cart(Long cardId, String product, String amount, Long customerId) {
		super();
		this.cardId = cardId;
		this.product = product;
		this.amount = amount;
		this.customerId = customerId;
	}
    
    
    
}
