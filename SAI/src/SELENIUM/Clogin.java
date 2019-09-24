package SELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Clogin {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse\\jee-2019-06\\eclipse\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://connect.maveric-systems.com");
		driver.findElement(By.id("LoginForm_username")).sendKeys("vamsikrishnaa");
		driver.findElement(By.id("LoginForm_password")).sendKeys("Maveric12#");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Actions actions=new Actions(driver);
		Thread.sleep(2000);
		WebElement mainMenu=driver.findElement(By.xpath("(//a[@style='padding-right: 23px;'])[9]"));
		actions.moveToElement(mainMenu);
		Thread.sleep(2000);
		WebElement subMenu=driver.findElement(By.xpath("(//a[@href='/index.php/site/logout'])"));
		actions.moveToElement(subMenu);
		Thread.sleep(2000);
		actions.click().build().perform();
		
		
		
		

	}

}
