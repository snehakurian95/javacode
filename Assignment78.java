package assignments;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Assignment78 
{
	public static void main(String[] args) 
	{
		Set s= new HashSet<>();
		s.add("Sneha");
		s.add("30");
		s.add("A");
		s.add("2345696759l");
		s.add("5600000");
		
		System.out.println("After Iteration:- ");
		
		Iterator itr1 = s.iterator();
		while(itr1.hasNext()) 
		{
			System.out.println(itr1.next());
		}
	
	}

}
