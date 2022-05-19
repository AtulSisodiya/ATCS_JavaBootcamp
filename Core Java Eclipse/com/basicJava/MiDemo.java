package com.access;

class Parent1 {
	 
 void fun(){
	    System.out.println("Parent1");
	  }
	}
	
interface Parent2 {	
  void don();
	}
	

public class MiDemo extends Parent1 implements Parent2{
	public static void main(String args[]) {
		MiDemo mi= new MiDemo();
		mi.fun();
		mi.don();
	}

	@Override
	public void don() {
		
		System.out.println("Interface");
		
		
	}

	
	
	}
