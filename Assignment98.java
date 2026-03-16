package assignments;

public class Assignment98 
{
	public static void main(String[] args) 
	{
		 try 
		 {
			int a= 23/0;
			System.out.println(a);
		 }
		 catch(ArithmeticException b1) 
		 {
			 System.out.println("Exception is handled");
		 }
		 System.out.println("Hello");
	
	}
}
