package assignments;

public class AccessSpecifierCase1 
{
	 
	public static void add() 
	{
		int a=46, b=65;
		int c= a+b; 
		System.out.println("Addition:   "  + c);
	}
	protected static void sub() 
	{
		int a=76, b=90;
		int c= b-a;
		System.out.println("Substract:   " + c);
	}
	static void div() 
	{
		int a=60, b=15;
		int c= a/b;
		System.out.println("Divide:   " + c);
	}
	private static void mul() 
	{
		int a=12, b=45;
		int c= a*b;
		System.out.println("Multiply:   " + c);
	}
	public static void main(String[] args) 
	{
		add();
		sub();
		div();
		mul();
		
	}

}
