import java.util.*;
public class set {

		public static void main(String[] args)
		{
			
//			Set<Integer> hash_Set = new HashSet<Integer>();
//
//			hash_Set.add(1);
//			hash_Set.add(2);
//			hash_Set.add(3);
//			hash_Set.add(56);
//			hash_Set.add(7);
//			System.out.println(hash_Set);
//			
//			 Set<String> set=new LinkedHashSet<String>();
//			  set.add("One");    
//              set.add("Two");    
//              set.add("Three");   
//              set.add("Four");  
//              set.add("Five");  
//             
//              System.out.println(set);
//
//              Set<String> ts = new TreeSet<>();
//              
//              ts.add("D");
//              ts.add("B");
//              ts.add("C");
//       
//              System.out.println(ts);
              
			Scanner scan=new Scanner(System.in); 
			 Set<Integer>set=new HashSet<Integer>(); 
			  
			 
			 while(true) {
				    System.out.println("Enter Value in set : ");
					Integer add = Integer.parseInt(scan.nextLine());


					set.add(add);
					System.out.print("Want to add more value in set  (y/n)?");
					String answer = scan.nextLine();

					if (answer.equals("y") || answer.equals("Y")) {
						continue;
					} else {
						break;
					}

				} 		
			System.out.println(set); 
		} 
		}



