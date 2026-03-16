package ab61;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetProgram2
{
	public static void main(String[] args) 
	{
		Set<String> s1= new HashSet();
		s1.add("Rohit");
		s1.add("Asha");
		s1.add("Sherry");
		s1.add("Tania");
		s1.add("Tara");
		System.out.println(s1);	
		
		 Iterator<String> il=  s1.iterator();
		 while(il.hasNext()) 
		 {
			System.out.println(il.next()); 
		 }
	
	}

}
