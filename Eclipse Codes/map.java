import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class map {
	public static void main(String[] args)
    {
    
//        Map<Integer, String> map = new HashMap<>();
// 
//        map.put(1,"Atul");
//        map.put(2,"Sisodiya");
//        map.put(3,"Ravi");
//        System.out.println(map);
//        
//        Map<Integer, String> lhmap = new LinkedHashMap<Integer, String>();
//        lhmap.put(4,"Atul");
//        lhmap.put(2,"Sisodiya");
//        lhmap.put(3,"Ravi");
//        System.out.println(lhmap);
//        
//        Map<Integer,String> map1= new TreeMap<>();
//        map1.put(4,"Atul");
//        map1.put(2,"Sisodiya");
//        map1.put(3,"Ravi");
//        System.out.println(map1);
        
        Scanner scan=new Scanner(System.in); 
        HashMap<Integer, String> map = new HashMap<>(); 
       
        while(true) {
			System.out.print("Enter Roll number:");
			Integer idNumber = Integer.parseInt(scan.nextLine());

			System.out.print("Enter Name:");
			String name = scan.nextLine();
			map.put(idNumber, name);
			System.out.print("Enter another student (y/n)?");
			String answer = scan.nextLine();

			if (answer.equals("y") || answer.equals("Y")) {
				continue;
			} else {
				break;
			}

		} 
		
		 System.out.println(map); 
    }
	}
