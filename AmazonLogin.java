package ab61;
public class AmazonLogin 
	{
	        static void add()
	        {
	                int a,b,c;
	                a=10;
	                b=20;
	                c=a+b;
	                System.out.println(c);
	        }
	        void sub()
	        {
	                int a,b,c;
	                a=10;
	                b=20;
	                c=a-b;
	                System.out.println(c);
	        }
	        AmazonLogin()
	        {
	                System.out.println("This is Constructor");
	        }
	        
        public static void main(String[] args) 
	        {
	                AmazonLogin a1=new AmazonLogin();
	                add();
	                a1.sub();
	                
	        }
	}


