package assignments;

import java.util.ArrayList;

public class Assignment70 
{
	public static void main(String[] args) 
	{
		ArrayList<String> a1= new ArrayList<>();
		a1.add("Pen");
		a1.add("Pencil");
		a1.add("Paper");
		a1.add("Scale");
		a1.add("Eraser");
		
		System.out.println("List:" +a1);
		a1.add(1, "Books");
		System.out.println(a1);
		a1.add("Scetch Book");
		System.out.println(a1);
		a1.remove("Paper");
		System.out.println(a1);
	}

}
