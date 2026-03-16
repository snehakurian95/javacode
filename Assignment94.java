package assignments;
import java.util.ArrayList;
import java.util.Collections;
public class Assignment94
{
	public static void main(String[] args) 
	{
		ArrayList<String> list= new ArrayList<>();
		list.add("Sneha");
		list.add("Sherry");
		list.add("John");
	
		Collections.sort(list);
		System.out.println("After Sorting:"+list);
		Collections.reverse(list);
		System.out.println("Reversing:"+list);
		Collections.shuffle(list);
		System.out.println("After Shuffle: "+list);
		
		ArrayList<String> l= new ArrayList<String>();
		l.add("Jerry");
		l.add("Mathew");
		l.add("Ryan");
		System.out.println(l);
		
		Collections.copy(list, l);
		System.out.println("After copying:"+list);
		
		Collections.replaceAll(l, "Jerry", "Jenny");
		System.out.println("After Replacing:"+l);
		
		Collections.fill(l, "Unknown");
		System.out.println("After filling:"+l);
	
		ArrayList<Integer> list1= new ArrayList<>();
		list1.add(15);
		list1.add(10);
		list1.add(18);
		list1.add(34);
		list1.add(78);
		list1.add(124);
		
		int a= Collections.max(list1);
		System.out.println(a);
		int a1= Collections.min(list1);
		System.out.println(a1);
		
		int f= Collections.frequency(list1, 18);
		System.out.println(f);
		
		int index= Collections.binarySearch(list1, 34);
		System.out.println(index);
		
		Collections.rotate(list1, -2);
		System.out.println("Rotate negative:"+list1);
		
		Collections.rotate(list1, 5);
		System.out.println("Rotate positive:"+list1);
		
		boolean b1= Collections.disjoint(list, list1);
		System.out.println(b1);
				
	}

}
