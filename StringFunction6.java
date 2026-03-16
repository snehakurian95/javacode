package ab61;

public class StringFunction6 
{
	public static void main(String[] args) 
	{
		String a="Kite";
		System.out.println(a.matches("K(.*)"));
		System.out.println(a.matches("k(.*)"));
		System.out.println(a.matches("I(.*)"));
		
		String b="Vegetabes";
		System.out.println(b.matches("(.*)h"));
		
		String c= "Salmankhan";
		System.out.println(c.matches("(.*)man(.*)"));
		
		String c1= "manager";
		System.out.println(c1.matches("(.*)man(.*)"));		
		
		String d= "Hello";
		System.out.println(d.matches("....."));
	}

}
