package assignments;

import java.util.Arrays;

public class Assignment46 
{
	public static void main(String[] args) 
	{
		String input = "My name is Sneha";
		String[] s1= input.split(" ");
		String [] s2= input.split(" ", 10);
		System.out.println("Using Split regex method:  ");
		System.out.println(Arrays.toString(s1));
		System.out.println("Using Split limit method:  ");
		System.out.println(Arrays.toString(s2));
		
		System.out.println("================");
		
		String input1= "Fun";
		String input2= "Play";
		String a= input1.concat(" ").concat(input2);
		System.out.println("Using concat method:  ");
		System.out.println(a);
		
		System.out.println("================");
		
		StringBuffer value = new StringBuffer("Gianna ");
	    value.append("Sheela");
	    System.out.println("Using StringBuffer:  ");
	    System.out.println(value);
	    
		
	}

}
