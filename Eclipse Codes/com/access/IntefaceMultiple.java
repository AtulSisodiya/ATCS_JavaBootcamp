package com.access;

interface Print{  
void print();  
}  
interface Show{  
void show();  
}  
class IntefaceMultiple implements Print,Show{  
	@Override
	public void print()
	{
		System.out.println("Hello");
	}  
	@Override
	public void show()
	{
		System.out.println("Welcome");
	}  
  
public static void main(String args[]){  
IntefaceMultiple obj = new IntefaceMultiple();  
obj.print();  
obj.show();  
 }  
}  