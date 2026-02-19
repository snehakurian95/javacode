package ab61;

public class Interface implements ParentInterface
{
	void login3() 
	{
		System.out.println("Logic3");
	}
	static void login4() 
	{
		System.out.println("Logic4");
	}
	
	public static void main(String[] args) 
	{
		Interface in= new Interface();
		in.login1();
		in.login2();
		in.login3();
		login4();	
	}

	
	public void login1() 
	{
		System.out.println("Logic1");
		
	}


	public void login2()
	{
		System.out.println("Logic2");
	}

}
