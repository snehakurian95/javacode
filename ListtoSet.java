package ab61;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ListtoSet 
{
	public static void main(String[] args) 
	{
		ArrayList<String> a1= new ArrayList<String>();
		a1.add("Vaibhav");
		a1.add("Anita");
		a1.add("Firoz");
		a1.add("Suman");
		a1.add("Kalyani");
		a1.add(2, "Harry");
		a1.add("Anita");
		
		System.out.println("This is my ArrayList: " +a1);
		
		Set<String> s1= new HashSet<>(a1);
		System.out.println("This is my Set: " +s1);
	}
}

