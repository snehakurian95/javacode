package ab61;

import java.util.HashSet;
import java.util.Set;

public class SetProperty2
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
		
		Set<String> s2= new HashSet();
		s2.addAll(s1);
		s2.add("Jyothi");
		s2.equals(s1);
		s2.remove(s1);
		
		boolean b1= s2.equals(s1);
		System.out.println(b1);
		//System.out.println(s2.equals(s1));
		System.out.println(s2);
		
		boolean b2= s2.contains("Aksa");
		System.out.println(b2);
		
		boolean b3= s2.containsAll(s1);
		System.out.println(b3);
		
		s1.remove("Tara");
		System.out.println("After removing:" +s1);
			
		boolean b4= s1.isEmpty();
		System.out.println(b4);
	}
		
 
}
