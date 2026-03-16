package assignments;
import java.util.Scanner;
public class Assignment14 
{
	public static void main(String[] args) 
	{
		Scanner t=new Scanner(System.in);
	    System.out.println("Please enter the value of b1");
	    int b1= t.nextInt();
	    System.out.println("Please enter the value of h1");
	    int h1= t.nextInt();
	    double area=0.5*b1*h1;
	    System.out.println("Area of Triangle");
	    System.out.println(area);
	    
	    System.out.println("Please enter the value of a");
	    int a= t.nextInt();
	    System.out.println("Please enter the value of b2");
	    int b2= t.nextInt();
	    System.out.println("Please enter the value of c");
	    int c= t.nextInt();
	    double circum=a+b2+c;
	    System.out.println("Circumference of Triangle");
	    System.out.println(circum);
	    t.close();
	}
}
