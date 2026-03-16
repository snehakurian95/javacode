package assignments;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
public class Assignment77 
{
	public static void main(String[] args) 
	{
		List<String> s= new ArrayList<>();
		s.add("Sneha");
		s.add("Sherry");
		s.add("John");
		s.add("Alan");
		s.add("Nino");
		s.add("Oshin");
		s.add("Anjali");
		
		Iterator<String> itr1 = s.iterator();
		while(itr1.hasNext()) 
		{
			System.out.println(itr1.next());
		}
		
		System.out.println("==============");
		
		ListIterator<String> itr2 = s.listIterator();
		System.out.println("Forward Direction:- ");
		while (itr2.hasNext()) 
		{
			System.out.println(itr2.next());
		}
		
		System.out.println("===============");
		
		System.out.println("Backward Direction:- ");
		while (itr2.hasPrevious()) 
		{
			System.out.println(itr2.previous());
		}
	}
}
