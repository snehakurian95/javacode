package ab61;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		String input="malayalam";
		String output="";
		
		for(int i=input.length()-1; i>=0; i--) 
		{
			char a= input.charAt(i);
			output= output+a;
		}
		System.out.println("Input:  "+input);	
		System.out.println("Output:  "+output);
		
		boolean a1= input.equals(output);
		System.out.println(a1);
	}

	
}
