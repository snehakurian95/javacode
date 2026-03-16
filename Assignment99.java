package assignments;

public class Assignment99
{
	public static void main(String[] args) 
	{
		try 
		{
			throw new Exception ("Hello World");
			
		}
		catch(Exception e)
		{
			System.out.println("Exception caught:" +e.getMessage());
		}
		
	}

}
