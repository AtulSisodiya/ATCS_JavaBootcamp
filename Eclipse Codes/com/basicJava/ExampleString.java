package com.access;

public class ExampleString {
	
	private String message;

	public ExampleString() {
		super();
	}

	public ExampleString(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Employee [message=" + message + "]";
	}
	
	public static void main(String[] args) {
		ExampleString emp = new ExampleString();
		emp.setMessage("How u doin");
		emp.getMessage();
		System.out.println(emp);
	}

}

