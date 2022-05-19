package com.collections;

import java.util.HashMap;

public class HashMapEx {
	 public static void main(String[] args) {

		    HashMap<Integer, String> employee = new HashMap<>();

		    
		    employee.put(101, "Atul");
		    employee.put(102, "Atul");
		    employee.put(103, "Atul");
		    employee.put(104, "Atul");
		    
		    System.out.println("HashMap: " + employee);
		    
		    String value = employee.get(101);
		    System.out.println("Value at index 101: " + value);
		    
		    System.out.println("Keys: " + employee.keySet());
		    
		    System.out.println("Values: " + employee.values());
		    
		    System.out.println("Keys/values: " + employee.entrySet());
		    
		    employee.replace(102, "Danny");
		    System.out.println("HashMap using replace(): " + employee);
		    
		    String rvalue = employee.remove(104);
		    System.out.println("Removed value: " + rvalue);

		    System.out.println("Updated HashMap: " + employee);
		    
		    
		  }
}
