package assignments;

public class Assignment48
{
	public static void main(String[] args) 
	{
		StringBuffer s1= new StringBuffer("Feeling Good");
		System.out.println(s1.append(" as always"));
		System.out.println(s1.insert(7, " so"));
		System.out.println(s1.delete(8, 11));
		System.out.println(s1.replace(8, 12, "bad"));
		System.out.println(s1.reverse());
	
	}
	

}
