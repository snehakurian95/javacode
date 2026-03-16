package ab61;
class BaseClass
{
	static void browserlaunch() 
	{
		System.out.println("Chrome Browser Launching");
	}
}
class DataDriven extends BaseClass
{
	static void fetchingvalue() 
	{
		System.out.println("UN and PWD from excel sheet");
	}
}

public class LoginToAmazonMultiLevel extends DataDriven
{
	
		static void validcredential() 
		{
			System.out.println("Trying to login with valid UN and vaild PWD");
		}
	
	public static void main(String[] args) 
	{
		browserlaunch();
		fetchingvalue();
		validcredential();
		
	}
	

}
