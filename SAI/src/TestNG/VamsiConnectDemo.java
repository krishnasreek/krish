package TestNG;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

	import com.beust.jcommander.Parameter;

	public class VamsiConnectDemo
	{
	 public static WebDriver driver;
	
	@BeforeTest
	public static void launch()
	{
		
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse\\jee-2019-06\\eclipse\\chromedriver.exe");
	 driver = new ChromeDriver();
	// driver.manage().window().maximize();
	 driver.get("https://connect.maveric-systems.com/index.php/site/login");
	 System.out.println("before test");
	}
	
	
	@Test
	   public void login() throws InterruptedException {
	  driver.findElement(By.xpath("//input[@name=\"LoginForm[username]\"]")).sendKeys("test");
	  driver.findElement(By.xpath("//input[@name=\"LoginForm[password]\"]")).sendKeys("test");
	 Thread.sleep(2000);
	 //System.out.println("after test  0");
	 }
	
	@AfterTest
	public void close() 
	{
	 driver.quit();
	}
	/*@Test(priority = 0)
	public void lunch1() {
	 driver.get("https://outlook.office.com/mail/inbox/id/AAQkADYzMjM1YzQxLTNmZDgtNDc1NS1hNWIwLTkwNmQ4ZGI2MjM4YQAQAH%2FRq63DUstHoy%2BZgF%2FdBII%3D");
	 System.out.println("after test 1");
	}*/
	}


