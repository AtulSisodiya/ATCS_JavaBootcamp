package com.access;

class Base {
    int a = 5;
	public void display() {
		System.out.println("Static Base");
	}
	public void print() {
		System.out.println("Non-static Base");
	}
}

class Derived extends Base {
   public void display() {
  	  a=100;
		System.out.println("Static Derived");
		System.out.println(a);
	}
	@Override
	public void print() {
		System.out.println("Non-static Derived");
}
}
public class StaicOverride {
	public static void main(String args[ ]) {
		Base obj1 = new Derived();
		obj1.display();
		obj1.print();	
		}
}
