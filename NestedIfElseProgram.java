package ab61;

public class NestedIfElseProgram 
{
	public static void main(String[] arg) 
	{
		 int a=20, b=30, c=60;
		 if (a<b) 
		 {
			 System.out.println("Mother");
			 if (a<80) 
			 {
				 System.out.println("Girl");
				 if(c>12) 
				 {
					 System.out.println("Boy");
				 }
				 else 
				 {
					 System.out.println("Twins");
				 }
					 
			 }
			 else
			 {
				 System.out.println("Normal Pregnancy");
			 }
		 }
		 else
		 {
			 System.out.println("Ceserian Pregnancy");
		 }
    }
	
				

	
	
	
	
	
	
	
	
	
}
