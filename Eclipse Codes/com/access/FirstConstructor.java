package com.access;

class DefaultConstructor{
	 DefaultConstructor ()
   {
       System.out.println ("This is a no-argument constructor");
   }
	 
}


class ParamConstructor
{
    String name;
    int id;
  
    ParamConstructor (String name, int id)
    {
        this.name = name;
        this.id = id;
    }
}


class CopyConstructor{
String name;
CopyConstructor (String w)
{
    name = w;
}
CopyConstructor (CopyConstructor cc)
{
    name = cc.name;
}

void disp ()
{
    System.out.println ("Constructor: " + name);
}
}
public class FirstConstructor
{   
	
	String name;
	int id;
	int rollno;
	
	FirstConstructor (String name, int id)
	{
		this.name = name;
		this.id = id;
	}
	
	FirstConstructor(String name, int id, int rollno){
		this.name = name;
		this.id = id;
		this.rollno = rollno;
		
	}
	
	
	
	
    public static void main (String args[])
    { 
    	new DefaultConstructor();
        
    	ParamConstructor student1 = new ParamConstructor ("Atul", 101);
        System.out.println ("Student Name: " + student1.name +" and Student Id: " + student1.id);
        
        CopyConstructor obj1 =new CopyConstructor ("Example of Copy Constructor in Java");
        CopyConstructor obj2 = new CopyConstructor (obj1);
        obj2.disp ();
        
        FirstConstructor c1 = new FirstConstructor("Atul",101,02);
        FirstConstructor c2 = new FirstConstructor("Atul",101);
        
        System.out.println ("Student Name: " + c1.name +" and Student Id: " + c1.id+" and Rollno: "+c1.rollno);
        System.out.println ("Student Name: " + c2.name +" and Student Id: " + c2.id);
        
    }
}
