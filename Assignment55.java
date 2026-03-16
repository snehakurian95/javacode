package assignments;

import java.util.ArrayList;

public class Assignment55 
{
	public static void main(String[] args) 
	{
		ArrayList<String> a1= new ArrayList<String>();
		a1.add("Shamin");
		a1.add("Kurian");
		a1.add("Sheela");
		a1.add("Mathew");
		System.out.println("Before adding the indexing position: " + a1);
		a1.add(0, "Saneh");
		a1.add(2, "Alan");
		System.out.println("After adding the indexing position: " + a1);
		
		ArrayList<String> a2= new ArrayList<String>();
		a2.add("Arun");
		a2.add("Chris");
		a2.add("Sneha");
		a2.add("Gianna");
		a2.add("Olivia");
		a2.addAll(a1);
		System.out.println(a2);
		
		boolean b1 = a1.contains("Olivia");
		System.out.println(b1);
		
		boolean b2= a2.containsAll(a1);
		System.out.println(b2);
		
	    System.out.println("Before removing: " +a1);
		a1.remove(0);
		a1.remove("Mathew");
		System.out.println("After removing: " +a1);		
		
		a2.removeAll(a1);
		System.out.println("Remove all a1 from a2: " +a2);
		
		boolean b3= a1.isEmpty();
		System.out.println(b3);
		
	}

}
