package com.access;

class A
{
   public void methodA()
   {
     System.out.println("Class A method");
   }
}

class B extends A
{
   public void methodB()
   {
     System.out.println("Class B method");
   }
   
}
class C extends B
{
   public void methodC()
   {
     System.out.println("class C method");
   }
  
}

class D extends A{
	   public void methodD()
	   {
	     System.out.println("Class D method");
	   }
	   
	}
class E extends A{
	   public void methodE()
	   {
	     System.out.println("Class E method");
	   }
	   
	}

public class Inheritance {
	public static void main(String args[])
	   {
	     C obj = new C();
	     obj.methodA();
	     obj.methodB();
	     obj.methodC();
	     
	     C obj1 = new C();
	     D obj2 = new D();
	     obj1.methodA();
	     obj2.methodA();
	     
	     
	  }
}
