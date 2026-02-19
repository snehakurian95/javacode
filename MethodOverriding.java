package ab61;
class Software
{
	void setup() 
	{
		System.out.println("Microsoft office");
	}
}

public class MethodOverriding extends Software
{
	void setup() 
	{
		super.setup();
		System.out.println("Setup the software");
	}
	public static void main(String[] args) 
	{
		MethodOverriding ab= new MethodOverriding();
		ab.setup();
	}

}
