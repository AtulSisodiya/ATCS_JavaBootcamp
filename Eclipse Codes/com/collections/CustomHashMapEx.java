package com.collections;

import java.util.HashMap;

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
			return "Pinlocator [location=" + location + ", pincode=" + pincode + "]";
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
		HashMap<Integer, Pinlocator> map = new HashMap<>();

		map.put(101, new Pinlocator("Khatipura",302012));
		map.put(102, new Pinlocator("Malviya Nagar",302018));
		
		 System.out.println("Keys: " + map.keySet());
		 System.out.println("Keys/values: " + map.entrySet());
		    
		    
		System.out.println(map);
	}

}

