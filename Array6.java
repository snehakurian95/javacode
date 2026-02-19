package ab61;

import java.util.Arrays;

public class Array6 
{
	public static void main(String[] args)
	{
		int array1[]= new int [5];
		array1[0]= 100;
		array1[1]= 200;
		array1[2]= 300;
		array1[3]= 400;
		array1[4]= 500;
		
		int array2[]= new int[array1.length];
		array2[0]= 100;
		array2[1]= 200;
		array2[2]= 300;
		array2[3]= 400;
		array2[4]= 500;
		
		boolean b1 = Arrays.equals(array1, array2);
		
	   // if (b1==true)
	   //if (Arrays.equals(array1, array2))	
		if (Arrays.equals(array1, array2)==true)
	   
		{
			System.out.println("Arrays are equal");
		}
		else
		{
			System.out.println("Arrays are not equal");
		}

	}

}
