package assignments;

import java.util.Arrays;

public class Assignment42 
{
	public static void main(String[] args)
	{
		int [] array= new int[5];
		array[0]=156;
		array[1]=14;
		array[2]=89;
		array[3]=369;
		array[4]=120;
		
		Arrays.sort(array);
		
		int secondlast= array[array.length-2];
		System.out.println("Second Last number: " +secondlast);
		
	}

}
