package ab61;

public class StaticMethodProgram 
{
	static void add() 
	{
		System.out.println("Adding");
	}
	static void sub()
	{
		System.out.println("Subtract");
	}
	public static void main (String[] args)
	{
		System.out.println("Main Method");
		add();
		sub();
	}
    
   
	
}
