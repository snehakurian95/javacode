package assignments;

import java.util.Arrays;

public class Assignment44 
{
	public static void main(String[] args) 
	{
		String a="pot";
		String b="top";
		
		if(a.length()!=b.length())
		{
			System.out.println("It is not an Anagram as length is not same");
		}
		else 
		{
			char[] c1= a.toCharArray();
			char [] c2= b.toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			if(Arrays.equals(c1, c2)) 
			{
				System.out.println("It is an Anagram");
				
			}
			else 
			{
				System.out.println("It is not an Anagram");
			}
			System.out.println(Arrays.toString(c1));
			System.out.println(Arrays.toString(c2));
			
		}
	
	}
	
}
