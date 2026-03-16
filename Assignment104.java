package assignments;
class Calculators
{
	int add(int a, int b) 
	{
		return a+b;
	}
	int add(int a, int b, int c) 
	{
		return a+b+c;
	}
	double add(double a, double b) 
	{
		return a+b;
	}
	String add (String a, String b) 
	{
		return a+b;
	}
}
public class Assignment104 
{
	public static void main(String[] args) 
	{
		Calculators cal= new Calculators();
		System.out.println("Sum of two integers:"+cal.add(20, 10));
		System.out.println("Sum of three integers:" + cal.add(20,10,40));
		System.out.println("Sum of two doubles:" +cal.add(4.5, 5.6));
		System.out.println("Concatenation of strings:" +cal.add("Good", "Morning"));
	
	}

}
