package com.access;

class MyException extends Exception {
	MyException()
	{
		super("Error toh hai");
	}
	MyException(String message)
	{
		super(message);
	}
}
public class CustomizedExceptions {
	public static void main(String args[])
    {
        try {
        	throw new MyException();
        
        }
        catch (MyException ex) {
        	
        	System.out.println("Message toh hai");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
}
