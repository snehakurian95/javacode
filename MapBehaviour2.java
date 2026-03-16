package ab61;

import java.util.HashMap;
import java.util.Map;

public class MapBehaviour2 
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
		
		Map<Integer, String> m2= new HashMap<Integer, String>();
		m2.putAll(m1);
		m2.put(2345, "Adarsh");
		
		System.out.println(m2);
		
		//equals means both size and contents
		if(m1.equals(m2)==true) //m1.equals(m2) both are right
		{
			System.out.println("They are Equal");
		}
		else
		{
			System.out.println("They are not Equal");
		}
		
		m1.putIfAbsent(54321, "Ram");
		System.out.println(m1);
		
		String value= m1.get(2345);
		System.out.println(value);
		
		
		
	}

}
