package ab61;

public class StringFunction5 
{
	public static void main(String[] args) 
	{
		String a= "Gianna";
		System.out.println(a.replace('G', 'g'));
		
		String b= "Gianna Sneha Alan";
		System.out.println(b.replace("Sneha", "Sheela"));
		
		String c= "Sneha Achamma Kurian";
		//This is to replace Capital letters
		System.out.println(c.replaceAll("[A-Z]", "P"));
		System.out.println(c.replaceAll("[A-Z]", ""));
		
		//This is to replace small letters
		System.out.println(c.replaceAll("[a-z]", ""));
		
		String d= "Housefull 2";
		//This is to replace Numeric letters
		System.out.println(d.replaceAll("[0-9]", ""));
		System.out.println(d.replaceAll("[0-9]", "3"));
		
		
	}

}
