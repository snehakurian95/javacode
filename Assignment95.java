package assignments;


import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Assignment95 
{
	public static void main(String[] args) 
	{
		List<String> singlelist= Collections.singletonList("Java");
		System.out.println("SingletonList: " +singlelist);
		
		Set<String> singlelist1= Collections.singleton("Python");
		System.out.println("Singleton: "+singlelist1);
		
		Map<Integer,String> singlelist2= Collections.singletonMap(1, "One");
		System.out.println("SingletonMap: "+singlelist2);
		
	}

}
