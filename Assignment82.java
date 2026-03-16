package assignments;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;
public class Assignment82 
{
	public static void main(String[] args)
	{
		ArrayList<String> fruits= new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Strawberry");
		fruits.add("Orange");
		fruits.add("Pears");
		System.out.println(fruits);
		Object o= fruits.lastIndexOf("Strawberry");
		System.out.println(o);
		
		LinkedList<String> l= new LinkedList<>();
		l.add("Guava");
		l.add("Grapes");
		l.add("Watermelon");
		l.add("Papaya");
		l.addAll(3, fruits);
		System.out.println(l);
		
		Vector<Integer> v= new Vector<>();
		v.add(45);
		v.add(450);
		v.add(189);
		v.add(90);
		System.out.println(v);
		System.out.println(v.get(1));
		
		Stack<Integer> s= new Stack<>();
		s.add(12);
		s.add(10);
		s.add(15);
		s.add(19);
		s.add(11);
		System.out.println(s);
		System.out.println(s.get(3));	
	}
}
