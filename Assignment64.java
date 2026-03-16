package assignments;

import java.util.ArrayList;

public class Assignment64 
{
	public static void main(String[] args) 
	{
		ArrayList<String> a1= new ArrayList<>();
		a1.add("Pen");
		a1.add("Pencil");
		a1.add("Paper");
		a1.add("Scale");
		a1.add("Eraser");
		System.out.println("List of items:"+a1);
		
		a1.add(3, "Book");
		System.out.println("Updated items:"+a1);	
	}
}
