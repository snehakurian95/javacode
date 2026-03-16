package assignments;

import java.util.Enumeration;
import java.util.Vector;

public class Assignment59 
{
	public static void main(String[] args) 
	{
		Vector<String> list = new Vector<String>();
		list.add("Sam");
		list.addElement("Shaun");
		list.add("Monu");
		list.add("Sonu");
		list.add("Peter");
		System.out.println(list);
		
		
		Enumeration<String> e1= list.elements();
		while (e1.hasMoreElements()) 
		{
			System.out.println(e1.nextElement());
		}
	}

}
