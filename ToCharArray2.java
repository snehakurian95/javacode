package ab61;

import java.util.Arrays;

public class ToCharArray2 
{
	public static void main(String[] args) 
	{
		String a= "sneha";
		  char[] c = a.toCharArray();
		  
		  for(int i=0; i<=a.length()-1; i++) 
		  {
			  System.out.print(c[i]);
		  }
		  System.out.println(Arrays.toString(c));
	}

}
