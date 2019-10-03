package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RedMail {	
	public static WebElement username(WebDriver driver) {
		WebElement ele=driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		return ele;
		
	}
	public static WebElement id(WebDriver driver) {
		WebElement ele=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		return ele;
		
	}
	public static WebElement checkbox(WebDriver driver) {
		WebElement ele=driver.findElement(By.xpath("//input[@type='button']"));
		return ele;
	}
	public static WebElement check(WebDriver driver) {
		WebElement ele=driver.findElement(By.xpath("(//input[@name='radio_login'])[1]"));
		return ele;
	}
	public static WebElement password(WebDriver driver) {
		WebElement ele=driver.findElement(By.xpath("(//input[@type='password'])[1]"));
		return ele;
	}
	public static WebElement repassword(WebDriver driver) {
		WebElement ele=driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		return ele;
	}
	public static WebElement alternatemail(WebDriver driver) {
		WebElement ele=driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		return ele;
		
	}
	public static WebElement num(WebDriver driver) {
		WebElement ele=driver.findElement(By.xpath("//span[contains(text(),'91')]"));
		return ele;
	}
	public static WebElement India(WebDriver driver) {
		WebElement ele=driver.findElement(By.xpath("//div[@id='country_id']//li[1]"));
		return ele;
	}
	public static WebElement phonenum(WebDriver driver) {
		WebElement ele=driver.findElement(By.xpath("(//input[@type='text'])[6]"));
		return ele;
	}
	public static WebElement day(WebDriver driver) {
		WebElement ele=driver.findElement(By.xpath("//form[@name='register_mail']//tr[22]//td[3]//select[1]//option[21]"));
		return ele;
	}
	public static WebElement month(WebDriver driver) {
		WebElement ele=driver.findElement(By.xpath("//form[@name='register_mail']//tr[22]//td[3]//select[2]//option[8]"));
		return ele;
	}
	public static WebElement year(WebDriver driver) {
		WebElement ele=driver.findElement(By.xpath("//form[@name='register_mail']//tr[22]//td[3]//select[3]//option[24]"));
		return ele;
	}
	public static WebElement gender(WebDriver driver) {
		WebElement ele=driver.findElement(By.xpath("//input[@type='radio'][2]"));
		return ele;
	}
	public static WebElement country(WebDriver driver) {
		WebElement ele=driver.findElement(By.xpath("//select[@id='country']//option[4]"));
		return ele;
	}
	public static WebElement cap(WebDriver driver) {
		WebElement ele=driver.findElement(By.xpath("//input[@class='captcha']"));
		return ele;
	}
	public static WebElement submit(WebDriver driver) {
		WebElement ele=driver.findElement(By.xpath("//input[@type='submit']"));
		return ele;
	}
	
}