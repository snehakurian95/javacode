package ab61;

public class NonStaticMethodofParentClass extends ParentClass
{
	void mul() 
	{
		System.out.println("Multiplication");
	}
	public static void main(String[] args) 
	{
		NonStaticMethodofParentClass ns= new NonStaticMethodofParentClass();
		ns.add();
		ns.sub();
		ns.mul();
	}

}
