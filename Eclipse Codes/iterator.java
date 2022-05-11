import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;

public class iterator {
	
		public static void main(String[] arg)
		{
			Map<Integer,String> map = new HashMap<Integer,String>();
		
			map.put(1, "Atul");
			map.put(2, "Atul Sisodiya");
			map.put(3, "Ravi");
			
			
			for (Entry<Integer, String> entry : map.entrySet())
				System.out.println("Key = " + entry.getKey() +
								", Value = " + entry.getValue());
		}
	}


