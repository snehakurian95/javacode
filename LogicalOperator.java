package ab61;

public class LogicalOperator
{
	public static void main(String[] args) 
	{
		int a=40, b=50, c=60;
		if (a>10 || b==c) 
		{
			System.out.println(1);
		}
		if (a<10 || b!=c)
		{
			System.out.println(2);
		}
		if (a>=10 || b==c)
		{
			System.out.println(3);
		}
	
		if (a<=20 || b!=c)
		{
			System.out.println(4);
		}
	}
}

