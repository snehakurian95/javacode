package assignments;

import java.util.Scanner;

public class Assignment16 
{
	public static void main(String[] arg) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Please enter the value of a");
		int a=  s.nextInt();
		double area= a*a;
		System.out.println("Area of a Square");
		System.out.println(area);
		
		System.out.println("Please enter the value of a2");
		int a2=   s.nextInt();
		double circum=4*a2;
		System.out.println("Circumference of Square");
		System.out.println(circum);
		s.close();
			
	}

}
