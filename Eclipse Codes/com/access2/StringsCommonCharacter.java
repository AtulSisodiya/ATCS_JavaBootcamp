package com.access2;
import java.util.Scanner;

public class StringsCommonCharacter {
 
	public static String commonChars(String str1, String str2) {
		StringBuilder commonChars = new StringBuilder();
		try {	
		
		if (str1.length() > 0 & str2.length() > 0) {
			
			String toBeIterated = (str1.length() > str2.length() ? str2 : str1);
			String toBeChecked = toBeIterated.equals(str1) ? str2 : str1;
	
			for (int i = 0; i < toBeIterated.length(); i++) {
				
				if (toBeChecked.contains(Character.toString(toBeIterated.charAt(i)))) {
					commonChars.append(Character.toString(toBeIterated.charAt(i)));
				}
			}
			return commonChars.toString();
		
		}
		
		else
			throw new RuntimeException(" empty String ");
		
		}
		catch(RuntimeException e) {
			System.out.print(e);
			
		}
		return commonChars.toString();
	}
	
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the first string");
 
		String string1 = sc.nextLine();
 
		System.out.println("Please enter the second string");
 
		String string2 = sc.nextLine();
 
		sc.close();
 
		System.out.println("Output is :" + commonChars(string1, string2));
	}
 
}
 

