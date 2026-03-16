package assignments;

public class Assignment39 
{
	public static void main(String[] args) 
	{
		int [] array1 = new int [3];
		array1[0]= 47;
		array1[1]= 100;
		array1[2]= 30;
		int numtocheck= 100;
		
	
		for(int i=0; i<array1.length; i++)
		{
			if(numtocheck==array1[i])
			  {
				System.out.println("Yes 100 is a part of an array");
			  }	
			
		}		 
		   
	}

}
