package com.project.ecommerce.response;

public class ApiResponse1 {
	private String status;
	private String message;
	private Object data;
	private Object data1;
	public ApiResponse1(String status, String message, Object data, Object data1) {
		super();
		this.status = status;
		this.message = message;
		this.data = data;
		this.data1 = data1;
	}
	public ApiResponse1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public Object getData1() {
		return data1;
	}
	public void setData1(Object data1) {
		this.data1 = data1;
	}
	
	

}
