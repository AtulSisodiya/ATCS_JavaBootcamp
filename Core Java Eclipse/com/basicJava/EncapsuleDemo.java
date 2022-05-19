package com.access;
class Encapsulede{
	private String name;
	private int rollno;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
}

public class EncapsuleDemo{
	public static void main(String args[]) {
	Encapsulede obj = new Encapsulede();
	obj.setName("Atul");
	obj.setRollno(77);
	System.out.println(obj.getName());
	System.out.println(obj.getRollno());	}
}

