package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment34
{
	public static void main(String[] args) 
	{
		Scanner d1= new Scanner(System.in);
		//Calling the size
		System.out.println("Enter the size of the Array:  ");
		
		// Calling the array
		 int [] size = new int[d1.nextInt()];
		 
		 //Enter the Values
		 for (int i=0; i<size.length; i++ )
		 {
			 System.out.println("Print the value of the Array at indexing:  ");
			    size [i]= d1.nextInt();   
		 }
		 
		 System.out.println("Your final array value:");
		 System.out.println(Arrays.toString(size));
		 
		 d1.close();
		 
	 }
}

	
