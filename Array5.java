package ab61;

import java.util.Arrays;

public class Array5 
{
	public static void main(String[] args) 
	{
		int array1[]= new int [5];
		array1[0]= 100;
		array1[1]= 200;
		array1[2]= 300;
		array1[3]= 400;
		array1[4]= 500;
		
		int array2[]= new int [array1.length];
		for(int i=0, j=array2.length-1; i<array1.length; i++, j--) 
		{
		array2[j] =   array1[i];
		}
		
	
		System.out.print("Input Array: ");
		System.out.println(Arrays.toString(array1));
		System.out.print("Output Array: ");
		System.out.println(Arrays.toString(array2));
	}

}
