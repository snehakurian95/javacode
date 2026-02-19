package ab61;

import java.util.ArrayList;

public class ArrayListProgram4 
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
		
		boolean b1= a1.isEmpty();
		System.out.println(b1);
		System.out.println("Before Removing: " +a1);
		a1.remove(2);
		a1.remove("Suman");
		System.out.println("After Removing: " +a1);
		
		
		
	}

}
