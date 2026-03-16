package assignments;

import java.util.ArrayList;
import java.util.ListIterator;

public class Assignment58
{
	public static void main(String[] args) 
	{
		ArrayList<String> a1= new ArrayList<String>();
		a1.add("Shamin");
		a1.add("Sneha");
		a1.add("Shaji");
		a1.add("Kurian");
		a1.add("Alan");
		a1.add("Saneh");
		
		ListIterator<String> list= a1.listIterator();
		System.out.println("Forward Iteration: ");
		while (list.hasNext()) 
		{
			System.out.println(list.next());
		}
		
		System.out.println("Backward Iteration: ");
		while(list.hasPrevious())
		{
			System.out.println(list.previous());
		}
		
	}

}
