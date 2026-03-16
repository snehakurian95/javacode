package assignments;
import java.util.HashMap;
public class Assignment88 
{
	public static void main(String[] args) 
	{
		HashMap<Integer,String> list= new HashMap<>();
		list.put(12, "Lena");
		list.put(15, "Leena");
		list.put(19, "Teena");
		list.put(20, "Taniya");
		list.put(25, "Jessy");
		System.out.println(list);
		
		int i= list.size();
		System.out.println(i);
		
		Object o= list.get(12);
		System.out.println(o);
		
		HashMap<Integer,String> list2= new HashMap<>();
		list2.put(29, null);
		list2.putAll(list);
		list2.putIfAbsent(29, "Treesa");
		list2.remove(19);
		list2.remove(20,"Taniya");
		System.out.println(list2);
		
		boolean b1= list2.equals(list);
		System.out.println(b1);
		
		HashMap<Integer,String> list3= new HashMap<>();
		list3.put(30, "Riya");
		list3.put(28, "Reena");
		list3.put(24, "Jessica");
		list3.put(31, "Tara");
		list3.putAll(list);
		list3.replace(20, "Gianna");
		list3.replace(15, "Leena", "Merina");
	   
		System.out.println(list3);
		
		boolean b2= list3.containsKey(28);
		System.out.println(b2);
		
		boolean b3 =list3.containsValue("Tara");
		System.out.println(b3);
		
	}
}
