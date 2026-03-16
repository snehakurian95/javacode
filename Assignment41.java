package assignments;

public class Assignment41 
{
	public static void main(String[] args) 
	{
		int [] array= new int[5];
		array[0]=15;
		array[1]=14;
		array[2]=890;
		array[3]=369;
		array[4]=120;
		
		int max=array[0];
		int secondlargest= array[0];
		
		for(int i=0; i<array.length; i++) 
		{
			if(array[i]>max) 
			{
				max=array[i];
			}
			if(array[i]>secondlargest) 
			{
				secondlargest=array[i];
			}
		}
		System.out.println("Maximum element = " +max);
		System.out.println("Minimum element = " +secondlargest);
		
				
		
	}

}
