package ab61;

public class LocalVariables2 
{
	static void add(int a,int b)
	{
		int sum= a+b;
		System.out.println(sum);
	}
	void sub(int a,int b)
	{
		int subtract= a-b;
		System.out.println(subtract);
	}
	void mul(int a,int b)
	{
		int multiply= a*b;
		System.out.println(multiply);
	}

	public static void main(String[] args) 
	{
		add(10,20);
		LocalVariables2 v= new LocalVariables2();
		v.sub(70, 68);
		v.mul(65, 45);
	}

}
