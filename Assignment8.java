package assignments;

public class Assignment8 
{
	public static void main(String[] args)
	{
		int a=75, b=55, c=85;
		if(a>b && b<90) 
		{
			System.out.println("1");
		}
		if(a>b || b>=c) 
		{
			System.out.println("2");
		}
		if (!(a>b && b<90))
		{
			System.out.println("3");
		}
		if(!(a<b || b>=c))
		{
			System.out.println("4");
		}
	}

}
