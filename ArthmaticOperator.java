package ab61;

public class ArthmaticOperator 
{
	static void add() 
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	static void sub() 
	{
		int a=10;
		int b=20;
		int c=b-a;
		System.out.println(c);
	}
	static void mul() 
    {
		int a=10;
		int b=20;
		int c=a*b;
		System.out.println(c);
	}
	static void div() 
	{
		int a=10;
		int b=20;
		int c=b/a;
		System.out.println(c);
	}
	static void mod() 
	{
		int a=10;
		int b=20;
		int c=b%a;
		System.out.println(c);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Start Main Method");
		add();
		sub();
		mul();
		div();
		mod();
		System.out.println("End Main Method");
		
	}

  
}
