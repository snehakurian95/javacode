package assignments;
class Username
{

	void login() 
	{
		
		System.out.println("Login using Email id");
	}
	
	
}
public class Mail extends Username
{
	void login() 
	{
		
		System.out.println("Login using mobile no.");
	}
	
	
	public static void main(String[] args) 
	{
		Mail fc= new Mail();
		fc.login();
		
	}

}
