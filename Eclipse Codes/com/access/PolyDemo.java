package com.access;

class A1{
	  protected int add()
	   {
		   int a=10,b=10,c=a+b;
		   System.out.println(c);
		   return c;
	   }
}

 class A2 extends A1{
   @Override
   public int add()
   {
	   int a=16,b=10,c=a+b;
	   System.out.println(c);
	   return c;
   }
}
class PolyDemo
{
  public static void main(String[] args) {
	A2 obj = new A2();
	obj.add();
	
	
}	
}