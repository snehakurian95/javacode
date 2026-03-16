package assignments;

import java.util.ArrayList;

import java.util.Collections;

public class Assignment72 
{
	public static void main(String[] args) 
	{
		ArrayList<String> list= new ArrayList<>();
		list.add("Sneha");
		list.add("Sherry");
		list.add("John");
		list.add("Alan");
		list.add("Nino");
		list.add("Oshin");
		list.add("Anjali");
        System.out.println("Before sorting" +list);
		
		Collections.sort(list);
		System.out.println("After sorting:" +list);
		
		System.out.println("==============");
		
		ArrayList<Integer> list1= new ArrayList<>();
		list1.add(689);
		list1.add(456);
		list1.add(32);
		list1.add(12);
		list1.add(8);
		list1.add(79);
		System.out.println("Before sorting" +list1);
		
		Collections.sort(list1);
		System.out.println("After sorting:" +list1);
		
	}

}
