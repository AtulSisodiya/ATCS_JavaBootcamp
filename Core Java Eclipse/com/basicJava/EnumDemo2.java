package com.access;
enum Fruit
{
    Apple (10), Mango (9), Pineapple (12), Banana (15), Orange (8);
    private int price;

    Fruit (int p)
    {
        price = p;
    }
    int getPrice ()
    {
        return price;
    }
}

public class EnumDemo2 {
	
	    public static void main (String[]args)
	    {
	        
	    	System.out.println ("Mango costs: " + Fruit.Mango.getPrice () + "cents. \n");

	        System.out.println ("All fruits prices:");
	        for (Fruit f:Fruit.values ())
	            System.out.println (f + " costs " + f.getPrice () + " cents. ");
	    }
	}
