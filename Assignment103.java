package assignments;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Assignment103 
{
	public static void main(String[] args) 
	{
		try 
		{
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int [] array= new int[s1.nextInt()];
		for(int i=0; i<array.length; i++) 
		{
			System.out.println("Please enter the value of array");
			array[i]= s1.nextInt();
		}
		System.out.println(Arrays.toString(array));
		
		System.out.println("Please enter a number to divide the first element:");
		int divide= s1.nextInt();
		int result= array[0]/divide;
		System.out.println("Result of division:" +result);
		s1.close();
		}
		catch(NegativeArraySizeException n) 
		{
			System.out.println("Handled the Exception 1");
			System.out.println("Enter the size of Array which is not -ve");
			Scanner s1= new Scanner(System.in);
			System.out.println("Enter the size of Array");
			int [] array= new int[s1.nextInt()];
			for(int i=0; i<array.length; i++) 
			{
				System.out.println("Please enter the value of array");
				array[i]= s1.nextInt();
			}
			System.out.println(Arrays.toString(array));
			
			System.out.println("Please enter a number to divide the first element:");
			int divide= s1.nextInt();
			int result= array[0]/divide;
			System.out.println("Result of division:" +result);
			s1.close();
		}
		catch(InputMismatchException i)
		{
			System.out.println("Handled the Exception 2");
			System.out.println("Enter the size of Array which should be int only");
			Scanner s1= new Scanner(System.in);
			System.out.println("Enter the size of Array");
			int [] array= new int[s1.nextInt()];
			for(int j=0; j<array.length; j++) 
			{
				System.out.println("Please enter the value of array");
				array[j]= s1.nextInt();
			}
			System.out.println(Arrays.toString(array));
			
			System.out.println("Please enter a number to divide the first element:");
			int divide= s1.nextInt();
			int result= array[0]/divide;
			System.out.println("Result of division:" +result);
			s1.close();
		}
		catch(ArithmeticException a) 
		{
			System.out.println("Handled the Exception 3");
			System.out.println("Error: Division by 0 is not allowed");
			Scanner s1= new Scanner(System.in);
			System.out.println("Enter the size of Array");
			int [] array= new int[s1.nextInt()];
			for(int j=0; j<array.length; j++) 
			{
				System.out.println("Please enter the value of array");
				array[j]= s1.nextInt();
			}
			System.out.println(Arrays.toString(array));
			
			System.out.println("Please enter a number to divide the first element:");
			int divide= s1.nextInt();
			int result= array[0]/divide;
			System.out.println("Result of division:" +result);
			s1.close();
		}
	}

}
