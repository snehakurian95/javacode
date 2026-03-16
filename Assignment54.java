package assignments;

public class Assignment54 
{
	
	static 
	{
		System.out.println("SIB- Static Initialization Block");
	}
	
	{
		System.out.println("IIB- Instance Initialization Block: 1");
	}
	{
		System.out.println("IIB- Instance Initialization Block: 2");
	}
	{
		System.out.println("IIB- Instance Initialization Block: 3");
	}
	Assignment54()
	{
		System.out.println("Constructor");
	}

	public static void main(String[] args) 
	{
		System.out.println("main method");
		Assignment54 a= new Assignment54();
		Assignment54 a1= new Assignment54();
	}

}
