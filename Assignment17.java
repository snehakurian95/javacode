package assignments;
import java.util.Scanner;
public class Assignment17 
{
	public static void main(String[] args) 
	{
		Scanner cal= new Scanner (System.in);
		
		System.out.println("Enter the first number");
		double a= cal.nextDouble();
		System.out.println("Enter the second number");
		double b= cal.nextDouble();
		
		System.out.println("Choose the Operator");
		System.out.println("1 - Addition (+)");
		System.out.println("2 - Substraction (-)");
		System.out.println("3 - Multiplication (*)");
		System.out.println("4 - Division (/)");
		System.out.println("Choose your choise from 1 to 4: ");
		int op= cal.nextInt();
		
		double result;
		
		switch(op) 
		{
		case 1:
			result= a+b;
			System.out.println("Result: " + result);
			break;
			
		case 2:
			result= a-b;
			System.out.println("Result: " + result);
			break;
			
		case 3:
			result= a*b;
			System.out.println("Result: " + result);
			break;
			
		case 4:
			if (a!=0) 
			{
				result= a/b;
				System.out.println("Result: " + result);	
			}
			else 
			{
				System.out.println("Error: Cannot divide by zero");
			}
			break;
		default:
			System.out.println("Invalid Choice");		
				
		}
		cal.close();
		
		
	}

}
