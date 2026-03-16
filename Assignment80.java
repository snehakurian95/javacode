package assignments;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;
public class Assignment80 
{
	public static void main(String[] args)
	{
		Vector<String> l1= new Stack <>();
		l1.addElement("English");
		l1.addElement("Maths");
		l1.addElement("Social Science");
		l1.addElement("Social Studies");
		l1.addElement("General Knowlegde");
		
	    System.out.println("After Enumeration:-  ");
		Enumeration<String> e = l1.elements();
		while(e.hasMoreElements()) 
		{
			System.out.println(e.nextElement());
		}
		System.out.println("==============");
		
		System.out.println("After Iteration:-  ");
		Iterator<String> i= l1.iterator();
		while(i.hasNext()) 
		{
			System.out.println(i.next());
		}
		
		System.out.println("==============");
		System.out.println("Foward Direction:-  ");
		ListIterator<String> itr= l1.listIterator();
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
		System.out.println("==============");
		System.out.println("Backward Direction:-  ");
		while (itr.hasPrevious()) 
		{
			System.out.println(itr.previous());
		}
	}

}
