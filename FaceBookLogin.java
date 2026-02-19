package testngprograms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FaceBookLogin 
{
	@Test(dataProvider= "logininputs")
	public void setOfInputs(String username, String password) throws InterruptedException 
	{
		EdgeDriver driver= new EdgeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement un= driver.findElement(By.id("email"));
		un.sendKeys(username);
		WebElement pwd= driver.findElement(By.id("pass"));
		pwd.sendKeys("password");
		WebElement login= driver.findElement(By.name("login"));
		login.click();
	}
		
		@DataProvider
		public  Object logininputs() 
		{
			Object [][]d1= new Object[5][2];
			d1[0][0]="9867546830";
		    d1[0][1]="thred@2345";
		    
		    d1[1][0]="snehaalan@gmail.com";
		    d1[1][1]="tyef!234";

			d1[2][0]="ghdf@gmail.com";
			d1[2][1]="pjkh453";
			
			d1[3][0]="heck@gmail.com";
			d1[3][1]="ghfer4563";

			d1[4][0]="";
		    d1[4][1]="";
				
			return d1;		
		}
}
