package assignments;

public class Assignment105
{
	public static void main(String[] args) 
	{
		try 
		{
		int num= 12/0;
		System.out.println("Result"+num);
		}
		catch(ArithmeticException a) 
		{
			System.out.println("Exception got handled"+a);
		}
		finally 
		{
			System.out.println("Finally Block executed:");
		}
		System.out.println("Program continues after try-catch-finally");
	}

}
