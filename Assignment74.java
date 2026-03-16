package assignments;

import java.util.ArrayList;
import java.util.Iterator;

public class Assignment74 
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
		System.out.println(list);
		
		Iterator<String> i= list.iterator();
	    while(i.hasNext()) 
	    {
	    	System.out.println(i.next());
	    }
		
	}

}
