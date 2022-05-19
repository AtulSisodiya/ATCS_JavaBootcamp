package com.access;

public class Outer {

	private String name = "Atul Sisodiya";
	class Inner{
		void fun() {
			System.out.println("My name is "+ name);
		}
	}
	
	public static void main(String args[]) {
		Outer obj=new Outer();
		Outer.Inner obj1 = obj.new Inner();
		obj1.fun();
	}
}
