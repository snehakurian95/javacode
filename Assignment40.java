package assignments;

public class Assignment40 
{
	public static void main(String[] args) 
	{
		int [] array1= new int[4];
		array1[0]=45;
		array1[1]=56;
		array1[2]=100;
	    array1[3]=43;
	    int numtocheck=100;
	    
	    for(int i=0; i<array1.length; i++) 
	    {
	    	if(numtocheck==array1[i])
		    {
		    	System.out.println("Yes 100 is a part of an array");
		    	System.out.println("The index no. of 100 is: " +i);
		    }
	    }
		
	}

}
