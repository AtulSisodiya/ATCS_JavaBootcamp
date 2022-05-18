package com.collections;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {
    	SortedMap<String, String> fileExtensions = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);


        fileExtensions.put("PYTHON", ".py");
        fileExtensions.put("c++", ".cpp");
        fileExtensions.put("KOTLIN", ".kt");
        fileExtensions.put("Golang", ".go");

        System.out.println(fileExtensions.containsKey("C++"));
        
        System.out.println(fileExtensions);
    
    	
        
    	
    	
//        TreeMap<String, String> countryCode = new TreeMap<>();
//
//        countryCode.put("India", "IN");
//        countryCode.put("United States of America", "US");
//        countryCode.put("China", "CN");
//        countryCode.put("United Kingdom", "UK");
//        countryCode.put("Russia", "RU");
//        countryCode.put("Japan", "JP");
//
//        System.out.println("CountryISOCodeMapping : " + countryCode);
//
//        String countryName = "Japan";
//        String isoCode = countryCode.remove(countryName);
//        if(isoCode != null) {
//            System.out.println("Removed (" + countryName + " => " + isoCode + ") from the TreeMap. New TreeMap " + countryCode);
//        } else {
//            System.out.println(countryName + " does not exist, or it is mapped to a null value");
//        }
//
//        countryName = "India";
//        boolean isRemoved = countryCode.remove(countryName, "IA");
//        System.out.println("Was the mapping removed for " + countryName + "? : " + isRemoved);
//
//        Map.Entry<String, String> firstEntry = countryCode.pollFirstEntry();
//        System.out.println("Removed firstEntry : " + firstEntry + ", New TreeMap : " + countryCode);
//
//        Map.Entry<String, String> lastEntry = countryCode.pollLastEntry();
//        System.out.println("Removed lastEntry : " + lastEntry + ", New TreeMap : " + countryCode);
        
        
    }
}
