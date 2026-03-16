package assignments;
import java.util.ArrayList;
import java.util.ListIterator;
public class Assignment75 
{
	public static void main(String[] args) 
	{
		ArrayList<String> list= new ArrayList<>();
		list.add("Sneha");
		list.add("Sherry");
		list.add("John");
		list.add("Alan");
		list.add("Nino");
		list.add("Oshin");
		list.add("Anjali");
		
		System.out.println("List: "+list);
		
		ListIterator<String> l= list.listIterator();
		while (l.hasNext()) 
		{
			System.out.println(l.next());
		}
		
		System.out.println("==================");
		
		ListIterator<String> l2= list.listIterator();
		while(l2.hasNext()) 
		{
			System.out.println(l2.next());
		}
		
		System.out.println("==================");
		while(l2.hasPrevious()) 
		{
			System.out.println(l2.previous());
		}
	}

}
