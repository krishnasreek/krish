package SELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConnectLogin {
	public static WebElement username(WebDriver driver) {
		WebElement ele=driver.findElement(By.id("LoginForm_username"));
		return ele;
		
	}
	public static WebElement password(WebDriver driver)
	{
		WebElement ele=driver.findElement(By.id("LoginForm_passwo47594rd"));
		return ele;
	}
public static WebElement login(WebDriver driver) {
	WebElement ele=driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[4]/input"));
	return ele;
	
}
}
