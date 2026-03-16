package assignments;

public class Assignment45
{
	static int Alpha=0;
	static int Numeric=0;
	static int Space=0;
	static int SpclChar=0;
			 
	public static void main(String[] args) 
	{
		String input= "k g f 2 %&^*";
		char[] c1= input.toCharArray();
		
		for(int i=0; i<c1.length; i++) 
		{
			boolean b1= Character.isAlphabetic(c1[i]);
			if(b1)
			{
				Alpha++;
			}
			boolean b2= Character.isDigit(c1[i]);
			if(b2)
			{
				Numeric++;
			}
			boolean b3= Character.isWhitespace(c1[i]);
			if(b3) 
			{
				Space++;
			}
		
		}
		System.out.println("The count of Alphabet: " +Alpha);
		System.out.println("The count of Numeric: " +Numeric);
		System.out.println("The count of Space: " +Space);
		SpclChar=input.length()-(Alpha+Numeric+Space+SpclChar);
		System.out.println("The count of SpclChar: " +SpclChar);
		
	}

}
