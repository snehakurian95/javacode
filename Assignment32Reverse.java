package assignments;

public class Assignment32Reverse
{
	public static void main(String[] args) 
	{
		String input="sneha"; //length is 5-1=4
		String output="";
		
		for(int i=input.length()-1; i>=0; i--)  
		{
		   char c1= input.charAt(i);   
		   output=output+c1; 
		}
		System.out.println("Input is: "+input);
		System.out.println("Output is: "+output); 
		     
	
	}

}


