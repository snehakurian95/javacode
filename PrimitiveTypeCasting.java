package ab61;

public class PrimitiveTypeCasting 
{
	public static void main(String[] args) 
	{
	  // a)Convert int into double
		
		int a= 100;
		double d1= a;
		System.out.println(d1); // widening implicitly way
		
         double b= (double) a;
         System.out.println(b);// widening explicitly way
        
      // b)Convert double into int
         double r= 67.89;
         int value =(int) r; //whatever need to convert keep it in right hand side and what ur going to convert keep it in left side
         System.out.println(value); // narrowing explicitly way only
         
     // c) Convert float into double: 
         float c= 3.87f;
         double d2= c;
         System.out.println(d2);// widening implicitly way
         
         double d= (double)c;
         System.out.println(d); // widening explicitly way
         
         
       //d) Convert double into float 
         double h= 2.678995643245;
         float newvalue = (float) h;
         System.out.println(newvalue);
         
       //e) Convert byte into long
         byte x= 17; 
         long x1= x;
         System.out.println(x1); //widening implicitly way
         
        // Convert long into int
         long l= 897655283901l;
         int l2 = (int)l;
         System.out.println(l2);
         
         
	}

}
