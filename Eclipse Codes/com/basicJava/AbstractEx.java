package com.access;

abstract class Abc{
	void display() {
		System.out.println("Normal method in Abstract class");
	}
	abstract void show();
}
public class AbstractEx extends Abc {

	@Override
	void show() {
		System.out.println("Abstract method of abstract class");
		
	}
public static void main(String args[]) {
	AbstractEx av = new AbstractEx();
	av.show();
}
	

}
