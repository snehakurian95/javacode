package assignments;

import java.util.Scanner;

public class Assignment12 
{
	public static void main(String[] args) 
	{
		Scanner value=new Scanner(System.in);
		System.out.println("Please enter the value a:");
		 int a=           value.nextInt();
		System.out.println("Please enter the value b:");
		int b=     value.nextInt();
		
		int sum=a+b;
		System.out.println("Addition of 2 numbers:-");
		System.out.println(sum);
		value.close();
				
		
		
	}

}
