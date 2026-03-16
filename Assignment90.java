package assignments;
import java.util.HashMap;

public class Assignment90 
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
		System.out.println("Iterated the values:");
		
		for(String s: list.values()) 
		{
			System.out.println(s);
		}
		
	}
		
}
