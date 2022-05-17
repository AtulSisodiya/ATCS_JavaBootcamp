package com.collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SetEx {

		public static void main(String[] args)
		{
			
			Set<Integer> hash_Set = new HashSet<Integer>();

			hash_Set.add(1);
			hash_Set.add(25);
			hash_Set.add(3);
			hash_Set.add(60);
			hash_Set.add(7);
			
			System.out.println(hash_Set);
			hash_Set.remove(1);
			hash_Set.remove(3);
	        System.out.println(hash_Set);
	        hash_Set.removeAll(hash_Set);
	        System.out.println(hash_Set);
			 Iterator value = (Iterator) hash_Set.iterator();
			 System.out.println("Iterate HashSet using iterator : ");
			        while( value.hasNext()) {
			            System.out.print(value.next() + " ");
			        }
             

	        
			 Set<String> set=new LinkedHashSet<String>();
			  set.add("One");    
              set.add("Two");    
              set.add("six");   
              set.add("Four");  
              set.add("Five");  
              Iterator it = (Iterator) set.iterator();
 			 System.out.println("Iterate HashSet using iterator : ");
 			        while( it.hasNext()) {
 			            System.out.print(it.next() + " ");
 			        }
              
 			 Set<String> setObject = new HashSet<>();
 			setObject.add("ram");
 			setObject.add("mohan");
 			setObject.add("shyam");
 			setObject.add("mohan");
 			setObject.add("ram");
 			System.out.println(setObject);
//             
//              
              Set<String> ts = new TreeSet<>();
              ts.add("D");
              ts.add("B");
              ts.add("C");
              ts.add("A");
              ts.remove("C");
              //ts.removeAll(ts);
      
              System.out.println(ts);
//              
//			Scanner scan=new Scanner(System.in); 
//			 Set<Integer>set=new HashSet<Integer>(); 
//			 while(true) {
//				    System.out.println("Enter Value in set : ");
//					Integer add = Integer.parseInt(scan.nextLine());
//
//
//					set.add(add);
//					System.out.print("Want to add more value in set  (y/n)?");
//					String answer = scan.nextLine();
//
//					if (answer.equals("y") || answer.equals("Y")) {
//						continue;
//					} else {
//						break;
//					}
//
//				} 		
//			System.out.println(set); 
		} 
		}



