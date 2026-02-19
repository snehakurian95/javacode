package ab61;

import java.util.Scanner;

public class AdditionUsingHumanInput 
{
	public static void main (String[] args)
	{
		Scanner b1=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a=        b1.nextInt();
		System.out.println("Enter the value of b:");
		int b=        b1.nextInt();
		int sum=a+b;
		System.out.println("Addition of 2 no");
		System.out.println(sum);
		b1.close();
		
	}

}
