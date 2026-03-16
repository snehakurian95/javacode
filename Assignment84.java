package assignments;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;
public class Assignment84 
{
	public static void main(String[] args)
	{
		ArrayList<String> fruits= new ArrayList<>();
		fruits.add("Apple");
		fruits.add(null);
		fruits.add(null);
		fruits.add(null);
		fruits.add("Pears");
		System.out.println("ArrayList:- " +fruits);
		
		LinkedList<String> l= new LinkedList<>();
		l.add(null);
		l.add(null);
		l.add("Watermelon");
		l.add("Papaya");
		l.add(null);
		System.out.println("LinkedList:-" +l);
		
		Vector<String> v= new Vector<>();
		v.addAll(fruits);
		v.add(null);
		System.out.println("Vector:-"  +v);
		
		Stack<String> s= new Stack<>();
		s.add("Mango");
		s.add("Cherry");
		s.add("Kiwi");
		s.add(null);
		s.add(1, "Blueberry");
		System.out.println("Stack:- " +s);
		
		LinkedHashSet<String> q= new LinkedHashSet<>();
		q.addAll(fruits);
		q.add(null);
		q.add(null);
		q.addLast("Passionfruit");
		System.out.println("LinkedHashSet: " +q);
	}
}
