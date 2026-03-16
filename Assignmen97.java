package assignments;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

public class Assignmen97
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
        URL u1= new URL("https://www.google.com");
        
        Thread.sleep(3000);
        
        FileReader r= new FileReader("E:\\Users\\alanv\\OneDrive\\Desktop\\Automation & Mannual Testing");
        System.out.println(r.read());
        

    }
}



