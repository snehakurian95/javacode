package assignments;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;
public class Assignment85 
{
	public static void main(String[] args) 
	{
		ArrayList<String> fruits= new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Strawberry");
		fruits.add("Banana");
		System.out.println("ArrayList:- " +fruits);
		
		LinkedList<String> l= new LinkedList<>();
		l.add("Guava");
		l.add("Grapes");
		l.add("Guava");
		System.out.println("LinkedList:-" +l);
		
		Vector<String> v= new Vector<>();
		v.addAll(fruits);
		v.add("Apple");
		System.out.println("Vector:-"  +v);
		
		Stack<String> s= new Stack<>();
		s.add("Mango");
		s.add("Cherry");
		s.add("Kiwi");
		s.add("Kiwi");
		System.out.println("Stack:- " +s);
		
		Deque<String> ps= new ArrayDeque<>();
		ps.add("Peach");
		ps.add("Pomogranate");
		ps.add("Coconut");
		ps.add("Coconut");
		ps.addLast("Fig");
		System.out.println("Deque: " +ps); 
		
		LinkedHashSet<String> q= new LinkedHashSet<>();
		q.addAll(ps);
		q.addFirst("Blackberry");
		q.addLast("Passionfruit");
		q.addFirst("Blackberry");
		System.out.println("LinkedHashSet: " +q);
		
		TreeSet<String> t= new TreeSet<>();
		t.add("Blueberry");
		t.add("Lime");
		t.add("Grapefruite");
		t.add("Lime");
		System.out.println("TreeSet: " +t);
	}

}
