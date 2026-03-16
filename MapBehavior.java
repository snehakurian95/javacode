package ab61;

import java.util.HashMap;
import java.util.Map;

public class MapBehavior 
{
	public static void main(String[] args) 
	{
		Map<Integer, String> m1= new HashMap<Integer, String>();
		m1.put(1452, "Ram");
		m1.put(8547, "Amol");
		m1.put(4562, "Ankeet");
		m1.put(8907, "Deepa");
		m1.put(2345, "Ganesh");
		System.out.println(m1);
		
		int count =m1.size();
		System.out.println(count);
		
		m1.clear();
		boolean b3= m1.isEmpty();
		System.out.println(b3);
		
		
		Map<Integer, String> m2= new HashMap<Integer, String>();
		m2.putAll(m1);
		m2.put(2345, "Adarsh");
		System.out.println(m2);
		
		m1.replace(4562, "Rani");
		System.out.println(m1);
		m1.replace(8907, "Deepa", "Thejas");
		System.out.println(m1);
		
		boolean b1= m1.containsKey(6754);
		System.out.println(b1);
		boolean b2=  m1.containsValue("Amol");
		System.out.println(b2);
	
	}

}
