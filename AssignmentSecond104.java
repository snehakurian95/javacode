package assignments;
class ParentClassProgram
{
	void login() 
	{
		System.out.println("Login to Amazon using Email id");
	}
}
public class AssignmentSecond104 extends ParentClassProgram
{
	void login() 
	{
		System.out.println("Login to Amazon using mobile no.");
	}
	public static void main(String[] args) 
	{
		AssignmentSecond104 a= new AssignmentSecond104();
		a.login();
		
		ParentClassProgram p = new ParentClassProgram();
		p.login();
	}

}
