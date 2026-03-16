package assignments;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Assignment97 
{
	public static void main(String[] args)  
	{
		try 
		{
			FileReader fr= new FileReader("D:\\Users\\alanv\\OneDrive\\Desktop\\Automation & Mannual Testing\\Pdfs");
			System.out.println("File opened succesfully");
		}
		catch(FileNotFoundException e) 
		{
			System.out.println("Error: File not found-" +e.getMessage());
		}
	}
}
