package ab61;

import java.util.Arrays;

public class Array9 
{
	public static void main(String[] args) 
	{
		String a ="saw";
		String b="was";
		
		if(a.length()!=b.length()) 
		{
			System.out.println("It is not an Anagram as length is not same");
		}
		else 
		{
		char[] c1=	a.toCharArray();
		char[] c2=	b.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		if (Arrays.equals(c1, c2)) 
		{
			System.out.println("It is an Anagram");
		}
		
		else 
		{
			System.out.println("It is not an Anagram");
		}
		
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c1));
		
		}
		
	}

}
