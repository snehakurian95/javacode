package assignments;

class Teacher
{
	Teacher(String name)
	{
		System.out.println("What is the name of the Teacher:"  +name );
	}
}

class Subject extends Teacher
{
	Subject(String name)
	{
		super("Shalini");
		System.out.println("What is the subject name:"  +name );
	}
}

public class StudentClass extends Subject
{
	StudentClass()
	{
		super("Science");
		System.out.println("Stendents are listening to the Teacher");
	}
	public static void main(String[] args) 
	{
		StudentClass p= new StudentClass();
		
	}

}
