package ab61;

import java.util.ArrayList;
import java.util.Iterator;

public class WhileLoop 
{

		public static void main(String[] args) 
		{
			ArrayList<String> a1= new ArrayList<String>();
			a1.add("Vaibhav");
			a1.add("Anita");
			a1.add("Firoz");
			a1.add("Suman");
			a1.add("Kalyani");
			a1.add(3, "Alan");
			
			System.out.println(a1);
			
			Iterator<String> i1= a1.iterator();
			System.out.println("Forward Iteration using Interator: ");
			
			while(i1.hasNext()) 
			{
				System.out.println(i1.next());
			}
		
	} 
	
	

}
