package ab61;

public class GlobalVariables 
{
	int a=20;
	int b=30;
	static int d=49;
	static int e=80;
	
				
	void add() 
	{
		int c=a+b;
		System.out.println(c);
		
	}
	
	static void sub() 
	{
		int f=d-e;
		System.out.println(f);
	}
	
	
	public static void main(String[] args) 
	{
		GlobalVariables g= new GlobalVariables();
		g.add();
		sub();
		
		
		
	}

}
