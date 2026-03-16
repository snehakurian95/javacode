package assignments;

import java.util.Arrays;

public class Assignment35
{
	public static void main(String[] args) 
	{
		String [] name1= new String[5];
		name1[0]= "Roshan";
		name1[1]= "Tara";
		name1[2]= "Harry";
		name1[3]= "Gia";
		name1[4]= "Abraham";
		
		String [] name2= new String[name1.length];
		name2[0]= name1[0];
		name2[1]= name1[1];
		name2[2]= name1[2];
		name2[3]= name1[3];
		name2[4]= name1[4];
		
		
		System.out.println("Input Array:  ");
		System.out.println(Arrays.toString(name1));
		
		System.out.println("Output Array:  ");
		System.out.println(Arrays.toString(name2));
		
	}

}
