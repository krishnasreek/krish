package SELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {

	public static void main(String[] args) {
WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse\\jee-2019-06\\eclipse\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://connect.maveric-systems.com");
		driver.findElement(By.id("LoginForm_username")).sendKeys("vamsikrishnaa");
		driver.findElement(By.id("LoginForm_password")).sendKeys("Maveric12#");
		WebElement element=driver.findElement(By.xpath("//input[@type='submit']"));
		String toolTipText=element.getAttribute("type");
		System.out.println("given value="+ toolTipText);

	}

}
