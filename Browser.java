package assignments;

public class Browser
{
	static void mul() 
	{
		int a=64, b=87, c=a*b;
		System.out.println(c);
	}
	static void add ()
	{
		int a=23, b=72, c=a+b;
		System.out.println(c);
	}
	void sub()
	{
		int a=40, b=80, c=b-a;
		System.out.println(c);
	}
	void div() 
	{
		int a=94, b=4, c=a/b;
		System.out.println(c);
	}
	void mod()
	{
		int a=94, b=4, c=a%b;
		System.out.println(c);
	}
	Browser(double a)
	{
		System.out.println("1");
	}
	Browser(char a)
	{
		System.out.println("2");
	}
	Browser(String a)
	{
		System.out.println("3");
	}
	public static void main(String[] args)
	{
		
		Browser a1=new Browser(9.7);
		Browser a2=new Browser('L');
		Browser a3=new Browser(15);
		mul();
		add();
		a1.sub();
		a2.div();
		a3.mod();
	}
	

}
