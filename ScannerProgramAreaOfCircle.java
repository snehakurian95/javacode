package ab61;

import java.util.Scanner;

public class ScannerProgramAreaOfCircle
{
	public static void main(String[] args)
	{
		// Area of Circle
		Scanner s1=new Scanner(System.in);
		System.out.println("Please enter value of radius");
		int r=   s1.nextInt();
		
		double area=Math.PI*r*r;
		System.out.println(area);
		s1.close();
		
		//Area of Triangle
		Scanner s2=new Scanner(System.in);
		System.out.println("Please enter the value of b:");
		int b=   s2.nextInt();
		System.out.println("Please enter the value of h:");
		int h=   s2.nextInt();
		
		double area2=0.5*b*h;
		System.out.println(area2);
		s2.close();
		
		//Area of a Square
		Scanner s3=new Scanner(System.in);
		System.out.println("Please enter the value of a:");
		int a=   s3.nextInt();
		
		int area3=a*a;
		System.out.println(area3);
		s3.close();
		
		//Area of Rectangle
		Scanner s4=new Scanner(System.in);
		System.out.println("Please enter the value of a2:");
		int a2=   s4.nextInt();
		System.out.println("Please enter the value of b2:");
		int b2=   s4.nextInt();
		int area4=a2*b2;
		System.out.println(area4);
		s4.close();
		

	}

}
