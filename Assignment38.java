package assignments;

public class Assignment38 
{
	public static void main(String[] args) 
	{
		int [] array1 = new int [3];
		array1[0]= 65;
		array1[1]= 47;
		array1[2]= 60;
		double sum=0;
		double avg=0;
		
		for(int i=0; i<array1.length; i++) 
		{
			sum=sum+array1[i];
		}
	    
		avg=sum/array1.length;
		System.out.println("Average of the value present:  " +avg);
		   
		   
	}

}


