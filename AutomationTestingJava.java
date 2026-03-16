package ab61;

public class AutomationTestingJava 
{
	AutomationTestingJava()
    {
            System.out.println("This is Constructor 1");
    }
    AutomationTestingJava(int a)
    {
            System.out.println("This is Constructor 2");
    }
    AutomationTestingJava(String a)
    {
            System.out.println("This is Constructor 3");
    }
    AutomationTestingJava(char a)
    {
            System.out.println("This is Constructor 4");
    }
    AutomationTestingJava(boolean a,String b)
    {
            System.out.println("This is Constructor 5");
    }
    public static void main(String[] args) 
    {
            AutomationTestingJava a1=new AutomationTestingJava();
            AutomationTestingJava a2=new AutomationTestingJava(100);
            AutomationTestingJava a3=new AutomationTestingJava("Java");
            AutomationTestingJava a4=new AutomationTestingJava('A');
            AutomationTestingJava a5=new AutomationTestingJava(true,"Selenium");
    }

}
