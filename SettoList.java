package ab61;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SettoList
{
	public static void main(String[] args) 
	{
		HashSet<String> s1= new HashSet<String>();
		s1.add("Vaibhav");
		s1.add("Anita");
		s1.add("Firoz");
		s1.add("Firoz");
		s1.add("Suman");
		s1.add("Kalyani");
		s1.add("Harry");
		s1.add("Anita");
		
		System.out.println("This is the set: " +s1);
		
		List<String> l1= new ArrayList<>(s1);
		System.out.println("List which is capable of adding duplicates: "+ l1);
		l1.add("Harry");
		System.out.println("Duplicates: ");
		System.out.println(l1);
	}

}
