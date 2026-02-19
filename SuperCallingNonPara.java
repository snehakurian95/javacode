package ab61;
class P1
{
	P1()
	{
		System.out.println("Constructor 1");
	}
}
class P2 extends P1
{
	P2()
	{
		System.out.println("Constructor 2");
	}
}
class P3 extends P2
{
	P3()
	{
		System.out.println("Constructor 3");
	}
}
class P4 extends P3
{
	P4()
	{
		System.out.println("Constructor 4");
	}
}


public class SuperCallingNonPara extends P4
{
	SuperCallingNonPara()
	{
		System.out.println("Constructor 5");
	}
	public static void main(String[] args) 
	{
		SuperCallingNonPara p=new SuperCallingNonPara();
		
	}

}
