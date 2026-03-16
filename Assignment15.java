package assignments;

import java.util.Scanner;

public class Assignment15 
{
	public static void main(String[] args) 
	{
		Scanner r=new Scanner(System.in);
		System.out.println("Please enter the value of l");
		int l=  r.nextInt();
		System.out.println("Please enter the value of w");
		int w= r.nextInt();
		double area=l*w;
		System.out.println("Area of Rectangle");
		System.out.println(area);
		
		System.out.println("Please enter the value of a");
		int a= r.nextInt();
		System.out.println("Please enter the value of b");
		int b=r.nextInt();
		double circum=2*a+b;
		System.out.println("Circumference of Rectangle");
		System.out.println(circum);
		r.close();
		
		
	}

}
