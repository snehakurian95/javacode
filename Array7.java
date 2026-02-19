package ab61;

public class Array7 
{
	public static void main(String[] args) 
	{
		double array[]= new double [5];
		array[0]= 100;
		array[1]= 239;
		array[2]= 300;
		array[3]= 400;
		array[4]= 500;
		double sum=0;
		double avg=0;
		
		for(int i=0; i<array.length; i++) 
		{
		  sum=sum+array[i];
		  /*i=0, sum=0+100=100
		   * i=1, sum=10+200=210
		   * i=2, sum=210+300=510
		   * i=3, sum=510+400=910
		   * i=4, sum=710+500=1210
		   */
		}
		avg=sum/array.length;
		System.out.println("Average of values present-:  " +avg );
		
	}

}
