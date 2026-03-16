package assignments;
abstract class Application
{
	abstract void login(); 
	abstract void pass(); 
	
	void items() 
	{
		System.out.println("Choose the items");
	}
	
	static void logout()
	{
		System.out.println("Logout the app");
	}
	
}

public class FirstCry extends Application
{
	public static void main(String[] args) 
	{
		FirstCry fc= new FirstCry();
		fc.login();
		fc.pass();
		fc.items();
		logout();
		
	}
	@Override
	void login() 
	{
		System.out.println("Please enter the user id");
		
	}
    @Override
	void pass() 
	{
		System.out.println("Please enter the password");
		
	}

}
