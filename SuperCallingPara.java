package ab61;
class P1
{
	P1(int a, int b, int age)
	{
		System.out.println("Constructor 1");
	}
}
class P2 extends P1
{
	P2(String a)
	{
		super(200, 40, 39);
		System.out.println("Constructor 2");
	}
}
class P3 extends P2
{
	P3(boolean a)
	{
		super("Gia");
		System.out.println("Constructor 3");
	}
}

public class SuperCallingPara extends P3
{
	SuperCallingPara()
		{
		    super(true);
			System.out.println("Constructor 4");
		}
	public static void main(String[] args)
	{
		SuperCallingPara pa= new SuperCallingPara();
		
	}

}
