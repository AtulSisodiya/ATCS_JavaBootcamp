package com.collections;
import java.util.LinkedList;

public class LinkedlistEx {
	public static void main(String[] args) {
	    LinkedList<String> languages = new LinkedList<>();

	    languages.add("Java");
	    languages.add("Python");
	    languages.add("JavaScript");
	    languages.add("Java");
	    System.out.println("LinkedList: " + languages);

	    
	    languages.set(3, "Kotlin");
	    System.out.println("Updated LinkedList: " + languages);
	  }
}
