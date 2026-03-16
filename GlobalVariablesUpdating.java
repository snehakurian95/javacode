package ab61;

public class GlobalVariablesUpdating 
{
	static int a=10;
	int b=20;
	
	
	public static void main(String[] args) 
	{
		a=80;
		System.out.println(a);
		GlobalVariablesUpdating up= new GlobalVariablesUpdating();
		System.out.println(up.b=100);
		
	}
	

}
