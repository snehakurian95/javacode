package assignments;

import assignment2.SensitiveInfo;

public class Assignment107 
{
	public static void main(String[] args) 
	{
		SensitiveInfo s1= new SensitiveInfo();
		s1.setEmail("snehakurian89gmail.com");
		System.out.println(s1.getEmail());
		
		s1.setAge(56);
		System.out.println(s1.getAge());
		
		s1.setSalary(45.9);
		System.out.println(s1.getSalary());
	}

}
