package assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment62 
{
	public static void main(String[] args) 
	{
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Orange");
		System.out.println("List of fruits:  " +fruits);
		
		fruits.removeAll(Arrays.asList("Apple"));
		System.out.println("Updated list of fruits:  " +fruits);
	}

}
