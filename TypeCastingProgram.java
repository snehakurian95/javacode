package ab61;

public class TypeCastingProgram 
{
	static void add() //child class
	{
		System.out.println("Child Class Method");
	}
	public static void main(String[] args) //Object Class
	{
		Object o1 = new TypeCastingProgram(); //upcasting implicitly
		Object o2 = (Object) new TypeCastingProgram(); //upcasting explicitly
		
		TypeCastingProgram t1= (TypeCastingProgram) o1; // downcasting explicitly
	}

}
