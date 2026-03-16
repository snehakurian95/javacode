package assignments;

public class BabyInterface implements Interface2, Interface1
{
	void login7() 
	{
		System.out.println("Logic 7");
	}
	static void login8() 
	{
		System.out.println("Logic 8");
	}
	public static void main(String[] args) 
	{
		BabyInterface ba= new BabyInterface();
		ba.login1();
		ba.login2();
		ba.login3();
		ba.login4();
		ba.login5();
		ba.login6();
		ba.login7();
		login8();		
		
	}
	
	public void login1() 
	{
		System.out.println("Logic 1");
	}
	
	public void login2() 
	{
		System.out.println("Logic 2");
		
	}
	
	public void login3() 
	{
		System.out.println("Logic 3");
		
	}
	
	public void login4() 
	{
		
		System.out.println("Logic 4");
	}
	
	public void login5() 
	{
		System.out.println("Logic 5");
		
	}
	
	public void login6() 
	{
		System.out.println("Logic 6");
	}
}
	
	