package ab61;

import java.util.Arrays;
import java.util.Scanner;

public class Array4 
{
	public static void main(String[] args) 
	{
		Scanner s1= new Scanner(System.in);
		System.out.println("Please enter the size of the Array");
	    int array1[]= new int[s1.nextInt()];
	    array1[0]=100;
	    array1[1]=45;
	    array1[2]=150;
	    array1[3]=180;
	  
	    int array2[]= new int[array1.length];
	    
	    for (int i=0; i<array1.length; i++)
	    {
	    	array2[i]=array1[i];
	    }
	      
	      System.out.print("Input Array: ");
	      System.out.println(Arrays.toString(array1));
	      System.out.print("Output Array: ");
	      System.out.println(Arrays.toString(array2));
	      s1.close();
	}

}
