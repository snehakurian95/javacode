package assignments;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Assignment101 
{
	public static void main(String[] args) 
	{
		try 
		{
		Scanner s1= new Scanner(System.in);
		System.out.println("Please enter the sie of an Array:");
		int[] array= new int[s1.nextInt()];
		for(int i=0; i<array.length; i++) 
		{
			System.out.println("Please enter the value of the Array at index: "+i);
			array[i]= s1.nextInt();
		}
		System.out.println(Arrays.toString(array));
		s1.close();
		}
		catch(NegativeArraySizeException n) 
		{
			System.out.println("Handled the Exception: 1");
			System.out.println("Please enter that the size should not be -ve");
			Scanner s1= new Scanner(System.in);
			System.out.println("Please enter the sie of an Array:");
			int[] array= new int[s1.nextInt()];
			for(int i=0; i<array.length; i++) 
			{
				System.out.println("Please enter the value of the Array at index: "+i);
				array[i]= s1.nextInt();
			}
			System.out.println(Arrays.toString(array));
			s1.close();
		}
		catch(InputMismatchException i) 
		{
			System.out.println("Handled the Exception: 2");
			System.out.println("Please make sure the size should be int only");
			Scanner s1= new Scanner(System.in);
			System.out.println("Please enter the sie of an Array:");
			int[] array= new int[s1.nextInt()];
			for(int j=0; j<array.length; j++) 
			{
				System.out.println("Please enter the value of the Array at index: "+j);
				array[j]= s1.nextInt();
			}
			System.out.println(Arrays.toString(array));
			s1.close();
		}
	}
}
