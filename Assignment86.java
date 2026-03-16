package assignments;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;
public class Assignment86 
{
	public static void main(String[] args) 
	{
		ArrayList<String> a= new ArrayList<>();
		a.add("Shampoo");
		a.add("Conditioner");
		a.add("Soaps");
		a.add("Curls");
		a.add("Serum");
		Collections.sort(a);
		System.out.println("ArrayList: "+a);
		
		LinkedList<Integer> l= new LinkedList<>();
		l.add(56);
		l.add(12);
		l.add(45);
		l.add(90);
		Collections.sort(l);
		System.out.println("LinkedList: "+l);
		
		Vector<String> v= new Vector<>();
		v.add("Shampoo");
		v.add("Conditioner");
		v.add("Soaps");
		v.add("Curls");
		v.add("Serum");
		Collections.sort(v);
		System.out.println("Vector: "+v);
		
		Stack<Integer> s= new Stack<>();
		s.add(56);
		s.add(12);
		s.add(45);
		s.add(90);
		Collections.sort(s);
		System.out.println("Stack: "+s);
		
		TreeSet<Integer> t= new TreeSet<>();
		t.add(89);
		t.add(23);
		t.add(78);
		t.add(65);
		t.add(42);
		System.out.println("TreeSet:"+t);
		
	}

}
