package ab61;

public class StringBuilder1 
{
	public static void main(String[] args) 
	{
		StringBuilder s1= new StringBuilder("Good Morning");
		System.out.println(s1.append(" All"));
		
		StringBuilder s2= new StringBuilder("Good Afternoon");
		System.out.println(s2.delete(0, 4));
		
		StringBuilder s3= new StringBuilder("Good Night");
		System.out.println(s3.reverse());
		
		
	}

}
