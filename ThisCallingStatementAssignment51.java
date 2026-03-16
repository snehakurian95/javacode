package assignments;

public class ThisCallingStatementAssignment51 
{
	ThisCallingStatementAssignment51()
	{
		this(450);
		System.out.println("Waterfall Model");
	}
	
	ThisCallingStatementAssignment51(int a)
	{
		this('U');
		System.out.println("Spiral Model");
	}
	
	ThisCallingStatementAssignment51(char a)
	{
		this("Harry");
		System.out.println("Verification and Validation Model");
	}
	
	ThisCallingStatementAssignment51(String a)
	{
		System.out.println("Protocol Model");
	}
	ThisCallingStatementAssignment51(double b)
	{
		this();
		System.out.println("Agile Model");
	}
	

	public static void main(String[] args)
	{
		
		ThisCallingStatementAssignment51 t1= new ThisCallingStatementAssignment51(56.893);	
				
	}
	

}
