package assignments;

import java.util.Scanner;

public class Assignment21 
{
	public static void main(String[] args) 
	{
		Scanner k1=new Scanner(System.in);
		for (int i=1; i<=10; i++) 
		{
			System.out.println("Iteration "+i+":-   ");
		    System.out.println("What is your name");
		    String name= k1.next();
		    System.out.println("Enter the value of a:-  ");
		    int a=   k1.nextInt();
		    System.out.println("Enter the value of b:-  ");
		    int b=   k1.nextInt();
		
		    int sum= a+b;
		    System.out.println("Addition of 2 numbers");
		    System.out.println(sum);
		
		    System.out.println(); 
            System.out.println();
            
         }
		k1.close();
	}

}
