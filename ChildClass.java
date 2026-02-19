package ab61;

public class ChildClass extends ParentClass
{
	static void mul()
	{
		System.out.println("Multiplication");
	}
	
	static void div()
	{
		System.out.println("Division");
	}
	
	
	

	public static void main(String[] args) 
	{
		add();
		sub();
		mul();
		div();
	}

}
