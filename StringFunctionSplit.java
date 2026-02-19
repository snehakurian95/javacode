package ab61;

import java.util.Arrays;

public class StringFunctionSplit 
{
	public static void main(String[] args) 
	{
		String input= "My name is Sneha";
		     String[] s1= input.split(" ");
		     String[] s2= input.split(" ", 2);
		 System.out.println(Arrays.toString(s1));    
		
	}

}
