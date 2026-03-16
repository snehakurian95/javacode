package assignments;

import java.util.ArrayList;

public class Assignment73 
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
        System.out.println("Before clone" +list);
        
        Object o= list.clone();
        System.out.println(o);
        int l= list.lastIndexOf("Alan");
        System.out.println(l);
        
        ArrayList<String> list1= new ArrayList<>();
        list1.addAll(list);
        System.out.println("After Merging:-" +list1);
		
        boolean b= list1.equals(list);
        System.out.println("Is list and list1 are equal:- " +b);
	}

}
