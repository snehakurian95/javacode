package ab61;

public class AssertKeyword 
{
	public static void main(String[] args) 
	{
		System.out.println("Lets check the Condition");
		String a = "auto";
		try 
		{
			assert a.length()<0: "Sorry the condition could not satisfy";
		} 
		catch (Exception e)
        {
			
			
		}
		
		
		 char c1= a.charAt(1);
		 System.out.println(c1);
		
		 System.out.println("Condition is pass");
		
	}

}
