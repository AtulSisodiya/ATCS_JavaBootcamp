package com.access;

interface myInterface{
	 void show();
	
}
public class InterfaceExample implements myInterface {

	@Override
	public void show() {
		System.out.println("interface class overriden");
		
	}
public static void main(String args[]) {
	InterfaceExample av = new InterfaceExample();
	av.show();
}
	

}
