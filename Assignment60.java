package assignments;

public class Assignment60 
{
	public static void main(String[] args) 
	{
		int[] array = new int[6];
		array[0] = 56;
		array[1] = 86;
		array[2] = 76;
		array[3] = 74;
		array[4] = 80;
		array[5] = 23;
		
		int sum= 0;
		
		for(int i=0; i<array.length; i++) 
		{
			sum +=array[i];
		}
		System.out.println("Sum of array elements= " +sum);
	}

}
