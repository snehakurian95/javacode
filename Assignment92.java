package assignments;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Assignment92 
{
	public static void main(String[] args) 
	{
		HashMap<Integer,String> list= new HashMap<>();
		list.put(12, "Lena");
		list.put(15, "Leena");
		list.put(19, "Teena");
		list.put(20, "Taniya");
		list.put(25, "Jessy");
		System.out.println(list);
		System.out.println("Iterated the all keys and value with Iterator:");
		
		Set<Entry<Integer,String>> s1= list.entrySet();
		Iterator<Entry<Integer,String>> i= s1.iterator();
		
		while(i.hasNext()) 
		{
			System.out.println(i.next());
		}
	
	}

}
