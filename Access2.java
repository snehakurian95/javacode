package assignments;

public class Access2
{
	public static void add() 
	{
		int a=15, b=18;
		int c=a+b;
		System.out.println("Addition:  " +c);
	}

	protected static void sub() 
	{
		int a=89, b=67;
		int c=a-b;
		System.out.println("Substract:  " +c);
	}
	
	private static void mul() 
	{
		int a=55, b=100;
		int c=a*b;
		System.out.println("Multiply:  " +c);
	}
	
	static void div() 
	{
		int a=10, b=67;
		int c=b/a;
		System.out.println("Divide:  " +c);
	}
	
	
}
