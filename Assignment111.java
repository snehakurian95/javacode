package assignments;

public class Assignment111
{
	public static void main(String[] args) 
	{
		System.out.println("Lets check the Condition");
		String a ="auto";
		
		assert a.length()>0: "Sorry the condition could not satisfy";
		
	    char c1= a.charAt(1);
		System.out.println(c1);
		
		System.out.println("Condition is pass");
	
	}

}
