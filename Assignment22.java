package assignments;

public class Assignment22 
{
	static int a=60; //Global variable
	final int b=80; //Global Variable
	
	public static void main(String[] args) 
	{
		 a=15;
		 int a=56; //Local Variable
		 System.out.println(a); 
		 
		 System.out.println(Assignment22.a); //static global variable
		 
		 Assignment22 t= new Assignment22(); //non static final variable
		 System.out.println(t.b);
		
	}

}
