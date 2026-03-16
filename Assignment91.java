package assignments;
import java.util.HashMap;
import java.util.Map.Entry;
public class Assignment91 
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
		System.out.println("Iterated the all keys and value:");
		
		for(Entry<Integer,String> i: list.entrySet()) 
		{
			System.out.println(i);
		}
	
	}

}
