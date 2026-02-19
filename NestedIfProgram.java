package ab61;

public class NestedIfProgram {
	public static void main(String[] arg)
	{
		int a=40, b= 60;
		if (a<b)
		{
			System.out.println("parent");
			if(a>10)
			{
				System.out.println("Child");
			}
			else
			{
				System.out.println("Father");
			}
		}
		else
		{
			System.out.println("Mother");
		}
	}
	
	
}
