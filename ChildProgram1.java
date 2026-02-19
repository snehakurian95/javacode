package ab61;
class ParentClass2
{
	static void add()
	{
		System.out.println("addition");
	}
}
public class ChildProgram1 extends ParentClass2
{
	static void div()
	{
		System.out.println("division");
	}
	public static void main(String[] args) 
	{
		div();
		add();
		
	}

}
