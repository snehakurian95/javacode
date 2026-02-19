package ab61;

public class ReverseString 
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
		System.out.println("Output is: "+output); // always try to answer the output outside the forloop to only see the last answer 
		   
		   /*
		    *i=4, c1=a, output=a
		    *i=3, c1=h, output=a+h= ah
		    *i=2, c1=e, output=a+h+e= ahe
		    *i=1, c1=n, output=a+h+e+n= ahen
		    *i=0, c1=s, output=a+h+e+n+s= ahens
		    */
	
	}

}
