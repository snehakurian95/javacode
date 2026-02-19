package ab61;

public class LocalGlobalVariables
{
	static int a=200;
	
	public static void main(String[] args)
	{
		a=80;
		int a=69;
	    System.out.println(a);
	    
	    System.out.println(LocalGlobalVariables.a);
	}
	

}