package assignments;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;
public class Assignment83 
{
	public static void main(String[] args) 
	{
		ArrayList<String> fruits= new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Strawberry");
		fruits.add("Orange");
		fruits.add("Pears");
		fruits.add(2, "Guava");
		System.out.println("ArrayList:- " +fruits);
		
		LinkedList<String> l= new LinkedList<>();
		l.add("Guava");
		l.add("Grapes");
		l.add("Watermelon");
		l.add("Papaya");
		l.add(2, "Dragonfruit");
		System.out.println("LinkedList:-" +l);
		
		Vector<String> v= new Vector<>();
		v.addAll(fruits);
		v.add(0, "Dates");
		System.out.println("Vector:-"  +v);
		
		Stack<String> s= new Stack<>();
		s.add("Mango");
		s.add("Cherry");
		s.add("Kiwi");
		s.add(1, "Blueberry");
		System.out.println("Stack:- " +s);
		
		Deque<String> ps= new ArrayDeque<>();
		ps.add("Peach");
		ps.add("Pomogranate");
		ps.add("Coconut");
		ps.addFirst("Plum");
		ps.addLast("Fig");
		System.out.println("Deque: " +ps); 
	
		LinkedHashSet<String> q= new LinkedHashSet<>();
		q.addAll(ps);
		q.addFirst("Blackberry");
		q.addLast("Passionfruit");
		System.out.println("LinkedHashSet: " +q);
	}

}
