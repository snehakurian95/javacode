package ab61;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapBehaviour5 
{
	public static void main(String[] args) 
	{
		Map<Integer, String> m1= new HashMap<Integer, String>();
		m1.put(1452, "Ram");
		m1.put(8547, "Amol");
		m1.put(4562, "Ankeet");
		m1.put(8907, "Deepa");
		m1.put(2345, "Ganesh");
		
		System.out.println("I have Iterated all values");
		//Collection<String> c1= m1.values();
		for(  String s1  : m1.values())
		{
			System.out.println(s1);	
		}
		
		System.out.println("I have Iterated all Keys");
		//Set<Integer> s2 =m1.keySet();
		for(Integer i1 : m1.keySet()) 
		{
			System.out.println(i1);	
		}
		
		System.out.println("I have Iterated all keys and values");
		//Set<Entry<Integer,String>>s3= m1.entrySet();
		for(Entry<Integer,String> e1: m1.entrySet()) 
		{
			System.out.println(e1);
		}
		
		Set<Entry<Integer,String>>s4= m1.entrySet();
		Iterator<Entry<Integer, String>> il= s4.iterator();
		System.out.println("I have iterated all the keys with values using Iterator: ");
		while(il.hasNext()) 
		{
			System.out.println(il.next());
		}
	}

}
