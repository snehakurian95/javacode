package assignments;

import java.util.ArrayList;
import java.util.Iterator;


public class Assignment57 
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
		System.out.println(a1);
		
		Iterator<String> i1= a1.iterator();
		System.out.println("Forward Iteration using iterator: ");
		while(i1.hasNext()) 
		{
			System.out.println(i1.next());
		}
		
	}

}
