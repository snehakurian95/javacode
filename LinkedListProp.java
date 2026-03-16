package ab61;

import java.util.LinkedList;

public class LinkedListProp
{
	public static void main(String[] args) 
	{
		LinkedList<String> l1= new LinkedList<String>();
		l1.add("Ram");
		l1.add("Depali");
		l1.add("Anita");
		l1.add("Rohit");
		l1.add("Saurabh");
		
		System.out.println(l1);
		l1.addFirst("Srinivas");
		System.out.println("Adding at first index: " +l1);
		l1.addLast("Rani");
		System.out.println("Adding at the second index: "  +l1);	
		
		String s1= l1.peek();
		System.out.println(s1);
		
		 l1.poll();
		System.out.println(l1);
		
		l1.offer("Ankit");
		System.out.println(l1);
		
	}

}
