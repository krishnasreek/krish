package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Assignment.RedMail;

public class RedTestMail {
	public static WebDriver driver;

	@BeforeTest
	public static void launch()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse\\jee-2019-06\\eclipse\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	   public void login() throws InterruptedException {
		RedMail.username(driver).sendKeys("krishnasreek");
   	    RedMail.id(driver).sendKeys("krishnasree123");
   	   Thread.sleep(2000);
		RedMail.checkbox(driver).click();
		Thread.sleep(2000);
		RedMail.check(driver).click();
		RedMail.password(driver).sendKeys("Krish@123");
		RedMail.repassword(driver).sendKeys("Krish@123");
		RedMail.alternatemail(driver).sendKeys("Krish@1234");
		RedMail.num(driver).click();
		RedMail.India(driver).click();
		RedMail.phonenum(driver).sendKeys("123445555");
		RedMail.day(driver).click();
		RedMail.month(driver).click();
		RedMail.year(driver).click();
		RedMail.gender(driver).click();
		RedMail.country(driver).click();
		RedMail.cap(driver).sendKeys("Kris");
		RedMail.submit(driver).click();
		
	 }
	
	@AfterTest
	public void close() 
	{
	 driver.quit();
	}
}