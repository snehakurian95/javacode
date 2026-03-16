package assignments;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class Assignment102 
{
	public static void main(String[] args) 
	{
		try 
		{
			System.out.println("Try block started");
			
			try 
			{
			FileReader fr= new FileReader("nonexistent.txt");
			System.out.println("File opened successfully");
			}
			catch(FileNotFoundException e) 
			{
				System.out.println("File not found-" +e.getMessage());
			}
			try 
			{
				int a= 1/1;
				System.out.println(a);			
			}
			catch(ArithmeticException ae) 
			{
				System.out.println("Arithmetic Error-" +ae.getMessage());
			}
		}
		catch(Exception e1) 
		{
			System.out.println("General Exception-" +e1.getMessage());	
		}
		System.out.println("Exceptions are handled");	
	}

}
