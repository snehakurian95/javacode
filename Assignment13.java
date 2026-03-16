package assignments;

import java.util.Scanner;

public class Assignment13
{
	public static void main(String[] args) 
	{
		Scanner a1=new Scanner(System.in);
		System.out.println("Please enter the value of radius");
		int r1=   a1.nextInt();
		double area1=Math.PI*r1*r1;
		System.out.println("Area of Circle:");
		System.out.println(area1);
		
		
		System.out.println("Please enter the value of radius");
		int r2=   a1.nextInt();
		double circum=Math.PI*2*r2;
		System.out.println("Circumferance of Circle:");
		System.out.println(circum);
		a1.close();
	}

}
