package ab61;

public class Array10 
{
	static int countofAlpha=0;
	static int countofNumeric=0;
	static int countofSpace=0;
	static int countofSpclChar=0;
	
	public static void main(String[] args) 
	{
		String input= "k v no 2 &^%$";
		char [] c1 =   input.toCharArray(); // converting string to array
		
		for (int i=0; i<c1.length; i++) 
		{
			//System.out.println("For Indexing:-  " +i );
			
			boolean b1=  Character.isAlphabetic(c1[i]); // this to check what will be the indexing of c1 if it is 0
			//System.out.println("Alphabetic:- " + b1);
			if(b1) 
			{
				countofAlpha++;
			}
			
			boolean b2=  Character.isDigit(c1[i]); 
		    //System.out.println("Numeric:-  " + b2);
		    if(b2) 
			{
				countofNumeric++;
			}  
		    boolean b3=  Character.isWhitespace(c1[i]); 
			//System.out.println("Space:-  " + b3);
			if(b3) 
			{
				countofSpace++;
			}
			//System.out.println("===============");		
		}
		System.out.println("The count of Alphabets:- " +countofAlpha);
		System.out.println("The count of Numeric:- " +countofNumeric);
		System.out.println("The count of Space:- " +countofSpace);
		countofSpclChar=input.length()-(countofAlpha+countofNumeric+countofSpclChar);
		System.out.println("The count of Special:- " +countofSpclChar);

	}

}
