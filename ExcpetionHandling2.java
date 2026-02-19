package ab61;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcpetionHandling2 
{
	public static void main(String[] args) 
	{
		try 
		{
			Scanner s1 = new Scanner (System.in);
			System.out.println("Please enter the value of radius");
			double r = s1.nextDouble();//if we try in this line it will give in line no.15, s1 is coming from line 9
			
			
		    double area=  Math.PI*r*r; //after doing that r*r are not recognizable
			System.out.println(area);
			s1.close();
		}
		catch(InputMismatchException m1) 
		{
			System.out.println("Exception Handled");
			System.out.println("Please make sure to enter int or decimal values only: ");
			Scanner s1 = new Scanner (System.in);
			System.out.println("Please enter the value of radius");
			double r = s1.nextDouble();//if we try in this line it will give in line no.15, s1 is coming from line 9
			
			
		    double area=  Math.PI*r*r; //after doing that r*r are not recognizable
			System.out.println(area);
			s1.close();
		}
		
		
	}

}
