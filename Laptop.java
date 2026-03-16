package assignments;
class Electronics
{
	 void open()
	{
		System.out.println("Open the Laptop");
	}
}

public class Laptop extends Electronics
{
	static void close() 
	{
		System.out.println("Close the Laptop");
	}
	
	public static void main(String[] args) 
	{
		Laptop a= new Laptop();
		a.open();
		close();
		
	}

}
