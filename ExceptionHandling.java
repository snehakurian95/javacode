package ab61;

public class ExceptionHandling 
{
	public static void main(String[] args) 
	{
		try 
		{
			int a=1/1;  // a=b/c
			System.out.println(a);
		}
		catch(ArithmeticException d1)
		{
		  // with the help of variable, we can use all the methods of those classes were arithmetic exception is inherited
			System.out.println("Exception is handled");
		}
		System.out.println("hello");
		
	}

}
