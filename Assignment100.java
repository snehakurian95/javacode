package assignments;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Assignment100
{
	public static void main(String[] args) 
	{
		try 
		{
		FileReader fr = new FileReader("nonexistent.txt");
		System.out.println("File opened successfully");
		
		int result= 10/0;
		System.out.println(result);
		
		}
		catch(FileNotFoundException e) 
		{
			System.out.println("File not found:"+ e.getMessage());
		}
		catch(ArithmeticException a) 
		{
			System.out.println("Arithmatic is wrong:"+ a.getMessage());
		}
		catch(Exception e1) 
		{
			System.out.println("Caught Exception: "+ e1.getMessage());
		}
		System.out.println("Exceptions are handled");
		
	}

}
