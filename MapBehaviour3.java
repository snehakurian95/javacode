package ab61;

import java.util.HashMap;
import java.util.Map;

public class MapBehaviour3 
{
	public static void main(String[] args) 
	{
		Map<Character, String> m1= new HashMap<Character, String>();
		m1.put('U', "USA");
		m1.put('S', "Srilanka");
		m1.put('C', "China");
		m1.put('R', "Russia");
		m1.put('I', "India");
		m1.put('E', "England");
		
		System.out.println(m1);
		
		m1.remove('S');
		System.out.println(m1);
		m1.remove('E', "England");
		System.out.println(m1);
		
		
	}


}
