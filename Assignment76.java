package assignments;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Assignment76 
{
	public static void main(String[] args) 
	{
		List<String> l1= new LinkedList<>();
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
		
		System.out.println("==============");
		
		ListIterator<String> i= l1.listIterator();
		System.out.println("Forward Direction:- ");
		while (i.hasNext()) 
		{
			System.out.println(i.next());
		}
		
		System.out.println("===============");
		System.out.println("Backward Direction:- ");
		while(i.hasPrevious()) 
		{
			System.out.println(i.previous());
		}
	}

}
