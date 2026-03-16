package ab61;

public class LocalVariables 
{
	static void add()
	{
		int a=20;
		int b=30;
		int c=a+b;
		System.out.println(c);
	}
	static void sub()
	{
		int a=70;
		int b=100;
		int c=b-a;
		System.out.println(c);
	}
	void mul()
	{
		int a=800;
		int b=300;
		int c=a*b;
		System.out.println(c);
	}
	void div()
	{
		int a=150;
		int b=5;
		int c=a/b;
		System.out.println(c);
	}
	void mod()
	{
		int a=150;
		int b=9;
		int c=a%b;
		System.out.println(c);
	}
	
	public static void main(String[] args) 
	{
		add();
		sub();
		LocalVariables v= new LocalVariables();
		v.mul();
		v.div();
		v.mod();
	}

}
