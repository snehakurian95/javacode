package assignments;

import java.util.Arrays;

public class Assignment37 
{
	public static void main(String[] args) 
	{
		int [] array1 = new int [3];
		array1[0]= 65;
		array1[1]= 47;
		array1[2]= 60;
		
		int [] array2= new int[array1.length];
		array2[0]= 65;
		array2[1]= 423;
		array2[2]= 60;
		
		   boolean b1= Arrays.equals(array1, array2);
		   
		  if(b1==true) 
		  {
			  System.out.println("Arrays are equal");
		  }
		  else 
		  {
			  System.out.println("Arrays are not equal");
		  }
		   
	}

}
