package SELENIUM;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse\\jee-2019-06\\eclipse\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/?affid=vineetsah1&affExtParam1=kzv&marketplace=FLIPKART&otracker=nmenu_sub_Home%0Furniture_0_Cushions%20%26%20Pillows");
		Thread.sleep(2000);
		  Alert alert = driver.switchTo().alert();
		  driver.switchTo().alert().sendKeys("Text");
		
	}

}
