package ab61;

public class Array8 
{
	public static void main(String[] args) 
	{
		int array[]= new int [5];
		array[0]= 170;
		array[1]= 50;
		array[2]= 900;
		array[3]= 100;
		array[4]= 500;
		int numberstocheck=100;
		
		for(int i=0; i<array.length; i++) 
		{
			if(numberstocheck==array[i]) 
			{
				System.out.println("Yes 100 is a given part of an array");
				System.out.println("The Index of 100 is -: " +i);
			}	
			
		}	
		
	}

}
