package assignments;
public class Assignment4 
{
	static void add()
	{
		int a=20;
		int b=30;
		int c=a+b;
		System.out.println(c);
	}
	static void sub()
	{
		int a=100;
		int b=40;
		int c=a-b;
		System.out.println(c);
	}
	static void mul()
	{
		int a=65;
		int b=56;
		int c=a*b;
		System.out.println(c);
	}
    static void div()
    {
    	int a=87;
    	int b=2;
    	int c=a/b;
    	System.out.println(c);			
    }
    static void mod()
    {
    	int a=87;
    	int b=2;
    	int c=a%b;
    	System.out.println(c);
    }
    public static void main(String[] args) 
    {
    	System.out.println("Starts Main Method");
    	add();
    	sub();
        div();
        mod();
    }
}
