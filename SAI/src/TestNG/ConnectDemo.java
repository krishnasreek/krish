package TestNG;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConnectDemo {
	 static WebDriver driver;
	 
	 @Test
		public void Tst2()
		{

			System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse\\jee-2019-06\\eclipse\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://connect.maveric-systems.com/index.php/site/login");
		 
		}

	 
	@Test
	public void Tst() throws InterruptedException
	{

	 driver.findElement(By.xpath("//*[@id=\"LoginForm_username\"]")).sendKeys("sUsername");    
	 driver.findElement(By.id("LoginForm_passwo47594rd")) .sendKeys("sPassword");
	 Thread.sleep(2000);
	        
	}
	
	@AfterTest
	public void Tst1()
	{
	 driver.quit();
	}


	

	
}

