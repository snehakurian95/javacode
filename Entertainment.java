package assignments;
class Movies
{
	Movies()
	{
		super();
		System.out.println("Movies are worldwide");
	}
}

public class Entertainment extends Movies
{
	Entertainment(int a)
	{
		System.out.println("Mollywood");
	}
	Entertainment(String name)
	{
		this(50);
		System.out.println("Kollywood");
	}
	Entertainment(boolean a)
	{
		this("Tara");
		System.out.println("Bollywood");
	}
	Entertainment(char a)
	{
		this(false);
		System.out.println("Hollywood");
	}
	
	public static void main(String[] args) 
	{
		new Entertainment('H');
		
	}

}
