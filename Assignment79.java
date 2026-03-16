package assignments;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Assignment79 
{
	public static void main(String[] args) 
	{
		Set<String> l1= new HashSet<>();
		l1.add("Sneha");
		l1.add("Sherry");
		l1.add("John");
		l1.add("Alan");
		l1.add("Nino");
		l1.add("Oshin");
		l1.add("Anjali");
		
		Iterator<String> itr1 = l1.iterator();
		while(itr1.hasNext()) 
		{
			System.out.println(itr1.next());
		}
	
	}

}
