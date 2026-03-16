package assignments;
class Animal
{
	void show() 
	{
		System.out.println("I am an Animal");
	}
}
class Dog extends Animal
{
	void bark() 
	{
		System.out.println("Its a Dog");
	}
}

public class Assignment109 
{
	public static void main(String[] args) 
	{
		//Up-casting 
		Animal a= new Dog();
		a.show();
		
		//Down-casting
		Dog d= (Dog) a;
		d.bark();
	}

}
