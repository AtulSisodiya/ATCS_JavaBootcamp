package com.collections;

import java.util.HashMap;
import java.util.Scanner;

public class CustomHashMapEx {

	public static class Pinlocator {

		private String location;
		private Integer pincode;
		
		
		public Pinlocator(String location, Integer pincode) {
			super();
			this.location = location;
			this.pincode = pincode;
		}
		@Override
		public String toString() {
			return "Pinlocator [location=" + location + ", pincode=" + pincode + "] ";
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public Integer getPincode() {
			return pincode;
		}
		public void setPincode(Integer pincode) {
			this.pincode = pincode;
		}
			
	}

	public static void main(String[] args)
		
	{
		HashMap<Double, Pinlocator> map = new HashMap<>();
		
		map.put(10.5689, new Pinlocator("Khatipura",302012));
		
		map.put(10.6767, new Pinlocator("Malviya Nagar",302018));
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Please enter the latitude-longitude");
 
			double choice = sc.nextDouble();


			System.out.println("Pin of location is: " + map.get(choice));
		}
		
		
//		 System.out.println("Keys: " + map.keySet());
//		 
//		 System.out.println("Keys/values: " + map.entrySet());
		 
		 
		    
		 map.replace(10.6767, new Pinlocator("Malviya Nagar",302024));
		 System.out.println("HashMap using replace(): " + map);

	
	}

}

