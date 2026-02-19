package ab61;

import java.util.ArrayList;

public class ArrayListProgram2 
{
	public static void main(String[] args) 
	{
		ArrayList<String> a1= new ArrayList<String>();
		a1.add("Vaibhav");
		a1.add("Anita");
		a1.add("Firoz");
		a1.add("Suman");
		a1.add("Kalyani");
		a1.add(3, "Alan");
		
		System.out.println(a1);
		
		ArrayList<String> a2= new ArrayList<String>();
		a2.add("Shristi");
		a2.add("John");
		a2.add("Rohit");
		a2.add("Sneha");
		a2.add("Varun");
		a2.addAll(a1);
		a2.addAll(3, a1);
		
		boolean b1= a1.contains("Harry");
		System.out.println(b1);
		boolean b2= a2.containsAll(a1);
		System.out.println(b2);
		
		a2.removeAll(a1);
		System.out.println("After removing a1 completly from a2:  ");
		
		System.out.println(a2);
		
		
		
	}

}