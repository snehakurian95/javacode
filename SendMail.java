package assignments;
class Google
{
	static void open() 
	{
		System.out.println("Open the google");
	}
		     
}
class Login extends Google
{
	static void login() 
	{
		System.out.println("Login using userid and password");
	}
		     
}
class Compose extends Login
{
	void compose() 
	{
		System.out.println("Compose a mail");
	}
		     
}
public class SendMail extends Compose
{
	void mail() 
	{
		System.out.println("Send the mail");
		
	}
	
	public static void main(String[] args) 
	{
		open();
		login();
		SendMail sm= new SendMail();
		sm.compose();
		sm.mail();
		
	}

}
