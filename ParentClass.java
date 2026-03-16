package assignments;

public class ParentClass 
{
	static void name()
	{
		System.out.println("Class Name");
	}
	static void details()
	{
		System.out.println("Check the details of the class");
	}
     void pay()
	{
		System.out.println("Make the required payment");
	}
     void join()
 	{
 		System.out.println("Join the class");
 	}
    public static void main(String[] args) 
    {
    	name();
    	details();
    	ParentClass pc=new ParentClass();
    	pc.pay();
    	pc.join();
		
	}
}
