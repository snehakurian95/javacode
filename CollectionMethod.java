package ab61;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionMethod
{
	public static void main(String[] args) 
	{
		Collection c1= new ArrayList();//upcasting converting the child class to parent class
		c1.add("Table");
		c1.add("Chair");
		c1.add("K");
		c1.add("True");
		c1.add(555);
		c1.add(74);
		c1.add('P');
		c1.add(8.90);
		System.out.println(c1);
	
	}

}
