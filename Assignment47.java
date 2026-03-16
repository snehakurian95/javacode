package assignments;

public class Assignment47 
{
	public static void main(String[] args) 
	{
		StringBuffer input= new StringBuffer("You should complete the homework before going out");
		System.out.println(input.delete(19, 23));
		
		System.out.println(input.insert(20, "English "));
		
		System.out.println(input.replace(20, 27, "SocialStudies"));
		
		
		StringBuilder input2 = new StringBuilder ("Good Morning");
		System.out.println(input2.append(" All"));
		System.out.println(input2.insert(16, ". How are you guys doing"));
		System.out.println(input2.replace(30, 34, "all"));
		
		StringBuilder input3 = new StringBuilder ("Good day to all");
        System.out.println(input3.reverse());
		
	}

}
