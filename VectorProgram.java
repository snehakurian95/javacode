package ab61;

import java.util.Enumeration;
import java.util.Vector;

public class VectorProgram 
{
	public static void main(String[] args) 
	{
		Vector<String> v1= new Vector<String>();
		v1.add("Sam");
		v1.addElement("Sham");
		v1.add("Sonu");
		v1.add("Mone");
		v1.add("Ram");
		System.out.println(v1);
		
		//v1.iterator();
		//v1.listIterator();
		
		Enumeration<String> e1= v1.elements();
		//hasmoreelements,  nextelement
		while (e1.hasMoreElements()) 
		{
			System.out.println(e1.nextElement());
		}
	
	}

}
