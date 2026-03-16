package assignments;
class JavaParent
{
	void login() 
	{
		System.out.println("Login using mobileno");
	}
}
public class Assignment50 extends JavaParent 
{
	void login() 
	{
		super.login();
		System.out.println("Login using emailid");
	}
	
	public static void main(String[] args)   
	{
		Assignment50 b1= new Assignment50();
		b1.login();
	}

}
