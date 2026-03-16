package assignments;

import java.util.Vector;

public class Assignment81 
{
	public static void main(String[] args) 
	{
		Vector<String> v= new Vector<>();
		v.add("Pen");
		v.add("Pencil");
		v.add("Eraser");
		v.addElement("Shapner");
		v.add(1, "Book");
		
		System.out.println(v);
		
		int i= v.capacity();
		System.out.println(i);
		
		boolean b= v.contains("Book");
		System.out.println(b);
		
		Object o=  v.clone();
		System.out.println(o);
		
		String h= v.get(4);
		System.out.println(h);
		
		String f= v.firstElement();
		System.out.println(f);
		
		v.clear();
		System.out.println(v);
		
		Vector<String> v2= new Vector<>();
		v2.add("Scetch Book");
		v2.add("Stappers");
		v2.add("Glue");
		v2.add("Scissors");
		v2.add("Markers");
		v2.addAll(4, v);
		v2.remove(0);
		
		System.out.println(v2);
		
		String s= v2.elementAt(2);
		System.out.println(s);
		
		boolean b1= v2.containsAll(v);
		System.out.println(b1);
		
		int i1= v2.size();
		System.out.println(i1);
		
		String h1= v2.getLast();
		System.out.println(h1);
		
		String h2=v2.getFirst();
		System.out.println(h2);
		
		v2.removeAllElements();
		System.out.println(v2);
		
	}

}
