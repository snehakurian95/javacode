package assignments;

import java.util.Arrays;

public class Assignment36 
{
	public static void main(String[] args) 
	{
		char c1[] = new char[5];
		c1[0]= 'T';
		c1[1]= 'H';
		c1[2]= 'I';
		c1[3]= 'N';
		c1[4]= 'E';
		
		
		char c2[]= new char[c1.length];
		c2[4]= c1[0];
		c2[3]= c1[1];
		c2[2]= c1[2];
		c2[1]= c1[3];
		c2[0]= c1[4];
		
		
		System.out.println("Input Array:   ");
		System.out.println(Arrays.toString(c1));
		System.out.println("Output Array:   ");
		System.out.println(Arrays.toString(c2));
		
	}

}
