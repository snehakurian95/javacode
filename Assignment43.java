package assignments;

import java.util.Arrays;

public class Assignment43 
{
	public static void main(String[] args) 
	{
		int []array1= new int[5];
		array1[0]=156;
		array1[1]=14;
		array1[2]=89;
		array1[3]=369;
		array1[4]=120;
		
		int []array2= new int[array1.length];
		array2[4]=array1[0];
		array2[3]=array1[1];
		array2[2]=array1[2];
		array2[1]=array1[3];
		array2[0]=array1[4]; 
		
		System.out.print("Input: ");
		System.out.println(Arrays.toString(array1));
		System.out.print("Output: ");
		System.out.println(Arrays.toString(array2));
		
	}

}
