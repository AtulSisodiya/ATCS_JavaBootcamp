package com.access;
abstract class Person{  
	  abstract void eat();  
	}  
	class AnonymusClass{  
	 public static void main(String args[]){  
	  Person p=new Person(){  
	  void eat(){System.out.println("Food");}  
	  };  
	  p.eat();  
	 }  
	} 

