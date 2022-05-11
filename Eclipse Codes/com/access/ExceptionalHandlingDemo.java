package com.access;

public class ExceptionalHandlingDemo {
	public static void main(String[ ] args) { 
	try {
	      //int[] myNumbers = {1, 2, 3};
	      //System.out.println(myNumbers[10]);
		int a=5;
		int b=0;
		int c= a/b;
		System.out.println (c);
		
		} 
//		catch (Exception e) 
//	    {
//	      System.out.println(e.getMessage());
//	    }
		catch (NumberFormatException nfe)
    {
        System.out.println ("please pass only integer values");
    }
    	catch (ArithmeticException ae)
    {
        System.out.println ("please dont pass the second value as 0");
    }
	catch (Exception ex)
    {
        System.out.println ("Generic Exception");
    }
	finally {
	     System.out.println("The try catch is finished.");
	      System.exit(0);
	    }
        }
}