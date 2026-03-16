package assignments;

import java.util.Stack;
import java.util.Vector;

public class Assignment93 
{
	public static void main(String[] args) 
	{
		Vector<Integer> v= new Vector<>();
		System.out.println("Initial Vector Capacity: "+v.capacity());
		
		for(int i=1; i<=11; i++) 
		{
			v.add(i);
			System.out.println("Added"+i+ ",Size:"+v.size()+ ",Capacity:" +v.capacity());
		}
		
		System.out.println("==================");
		
		Stack<Integer> s= new Stack<>();
		System.out.println("Initial Stack Capacity:" +s.capacity());
		
		for(int i=1; i<=11; i++) 
		{
			s.add(i);
			System.out.println("Added "+i+ ", Size: "+s.size()+ ",Capacity:"+s.capacity());
		}
		
		
	}

}
